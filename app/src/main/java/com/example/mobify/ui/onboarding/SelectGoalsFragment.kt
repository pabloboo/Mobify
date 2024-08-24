package com.example.mobify.ui.onboarding

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.mobify.MainActivity
import com.example.mobify.R
import com.example.mobify.utils.SharedPreferencesConstants
import com.example.mobify.utils.SharedPreferencesFunctions
import com.example.mobify.utils.TrainingPlanMap

class SelectGoalsFragment : Fragment(), GoalClickListener {

    private lateinit var recyclerView: RecyclerView
    private lateinit var nextButton: Button

    private val goals = TrainingPlanMap.trainingPlanMap.values.toTypedArray()
    private val selectedGoals = goals.associateWith { false }.toMutableMap()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_select_goals, container, false)

        recyclerView = view.findViewById(R.id.goalsRecyclerView)
        nextButton = view.findViewById(R.id.button_next)

        recyclerView.layoutManager = LinearLayoutManager(context)
        recyclerView.adapter = GoalsAdapter(goals, this)

        // Check if onboarding is completed (if so, it means that the user is accessing from menu)
        val isOnboadingCompleted = SharedPreferencesFunctions.getSharedPreferencesValueBoolean(requireActivity(), SharedPreferencesConstants.ONBOARDING_COMPLETED)

        if (isOnboadingCompleted) {
            initializeSelectedGoals()
            nextButton.text = "Save"
            nextButton.setOnClickListener {
                saveAllGoals()
                val intent = Intent(activity, MainActivity::class.java)
                startActivity(intent)
            }
        } else {
            nextButton.setOnClickListener {
                saveSelectedGoals()
                SharedPreferencesFunctions.setSharedPreferencesValueBoolean(requireActivity(), SharedPreferencesConstants.ONBOARDING_COMPLETED, true)
                val intent = Intent(activity, MainActivity::class.java)
                startActivity(intent)
            }
        }

        return view
    }

    override fun onGoalClick(position: Int) {
        // Handle goal click
        val goal = goals[position]
        val isSelected = (recyclerView.adapter as GoalsAdapter).checkedGoals[goal] ?: false
        selectedGoals[goal] = isSelected
    }

    // initialize selected goals state from SharedPreferences
    private fun initializeSelectedGoals() {
        val activity = activity ?: return
        for (goal in goals) {
            val sharedPreferencesConstant = TrainingPlanMap.invertedMapTrainingPlan[goal]
            if (sharedPreferencesConstant != null) {
                val isSelected = SharedPreferencesFunctions.getSharedPreferencesValueBoolean(activity, sharedPreferencesConstant)
                selectedGoals[goal] = isSelected
                (recyclerView.adapter as GoalsAdapter).checkedGoals[goal] = isSelected
                Log.d("SelectGoalsFragment", "Goal: $goal, isSelected: $isSelected")
            }
        }
    }

    fun saveSelectedGoals() {
        val selectedGoals = (recyclerView.adapter as GoalsAdapter).getSelectedGoals()

        // Save selected goals to SharedPreferences
        val activity = activity ?: return
        for (goal in selectedGoals) {
            val sharedPreferencesConstant = TrainingPlanMap.invertedMapTrainingPlan[goal]
            if (sharedPreferencesConstant != null) {
                SharedPreferencesFunctions.setSharedPreferencesValueBoolean(activity, sharedPreferencesConstant, true)
            }
        }
    }

    fun saveAllGoals() {
        val activity = activity ?: return
        for (goal in selectedGoals.keys) {
            val sharedPreferencesConstant = TrainingPlanMap.invertedMapTrainingPlan[goal]
            if (sharedPreferencesConstant != null) {
                SharedPreferencesFunctions.setSharedPreferencesValueBoolean(activity, sharedPreferencesConstant, selectedGoals[goal] ?: false)
            }
        }
    }
}