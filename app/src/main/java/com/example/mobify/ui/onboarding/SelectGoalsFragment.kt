package com.example.mobify.ui.onboarding

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2
import com.example.mobify.MainActivity
import com.example.mobify.R
import com.example.mobify.utils.SharedPreferencesConstants
import com.example.mobify.utils.SharedPreferencesFunctions
import com.example.mobify.utils.TrainingPlanMap
import com.example.mobify.utils.TrainingPlanMap.trainingPlanToTrainingPlanDaysMap

class SelectGoalsFragment : Fragment(), GoalClickListener {

    private lateinit var recyclerView: RecyclerView
    private lateinit var backButton: Button
    private lateinit var nextButton: Button

    private val goals = TrainingPlanMap.trainingPlanMap.values.toTypedArray()
    private val selectedGoals = goals.associateWith { false }.toMutableMap()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_select_goals, container, false)

        recyclerView = view.findViewById(R.id.goalsRecyclerView)
        backButton = view.findViewById(R.id.button_back)
        nextButton = view.findViewById(R.id.button_next)

        recyclerView.layoutManager = LinearLayoutManager(context)
        recyclerView.adapter = GoalsAdapter(goals, this)

        initializeSelectedGoals()

        // Check if onboarding is completed (if so, it means that the user is accessing from menu)
        val isOnboadingCompleted = SharedPreferencesFunctions.getSharedPreferencesValueBoolean(requireActivity(), SharedPreferencesConstants.ONBOARDING_COMPLETED)

        if (isOnboadingCompleted) {
            nextButton.text = getText(R.string.save)
            nextButton.setOnClickListener {
                saveAllGoals()
            }
        } else {
            backButton.visibility = View.VISIBLE
            backButton.setOnClickListener {
                val viewPager = activity?.findViewById<ViewPager2>(R.id.viewPager)
                viewPager?.currentItem = 1
            }
            nextButton.setOnClickListener {
                saveSelectedGoals()
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
        val activity = activity ?: return

        if (selectedGoals.isEmpty()) {
            Toast.makeText(activity, R.string.minimum_goals_selection_error, Toast.LENGTH_SHORT).show()
            return
        }

        // Save selected goals to SharedPreferences
        for (goal in selectedGoals) {
            val sharedPreferencesConstant = TrainingPlanMap.invertedMapTrainingPlan[goal]
            if (sharedPreferencesConstant != null) {
                SharedPreferencesFunctions.setSharedPreferencesValueBoolean(activity, sharedPreferencesConstant, true)
            }
        }

        val viewPager = activity?.findViewById<ViewPager2>(R.id.viewPager)
        viewPager?.currentItem = 4
    }

    fun saveAllGoals() {
        val activity = activity ?: return

        // Check if at least one goal is selected
        var selectedGoalsSize = 0
        for (goal in selectedGoals) {
            if (goal.value) {
                selectedGoalsSize++
            }
        }
        if (selectedGoalsSize == 0) {
            Toast.makeText(activity, R.string.minimum_goals_selection_error, Toast.LENGTH_SHORT).show()
            return
        }

        // Save all goals to SharedPreferences
        for (goal in selectedGoals.keys) {
            val sharedPreferencesConstant = TrainingPlanMap.invertedMapTrainingPlan[goal]
            if (sharedPreferencesConstant != null) {
                SharedPreferencesFunctions.setSharedPreferencesValueBoolean(activity, sharedPreferencesConstant, selectedGoals[goal] ?: false)

                // Restart day count for all goals that are not selected
                if (selectedGoals[goal] == false) {
                    trainingPlanToTrainingPlanDaysMap[sharedPreferencesConstant]?.let {
                        SharedPreferencesFunctions.setSharedPreferencesValueInt(activity, it, 0)
                    }
                }
            }
        }
        val intent = Intent(activity, MainActivity::class.java)
        startActivity(intent)
    }
}