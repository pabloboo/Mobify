package com.example.mobify.ui.onboarding

import android.content.Intent
import android.os.Bundle
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

        nextButton.setOnClickListener {
            saveSelectedGoals()
            SharedPreferencesFunctions.setSharedPreferencesValueBoolean(requireActivity(), SharedPreferencesConstants.ONBOARDING_COMPLETED, true)
            val intent = Intent(activity, MainActivity::class.java)
            startActivity(intent)
        }

        return view
    }

    override fun onGoalClick(position: Int) {
        // Handle goal click
        val goal = goals[position]
        val isSelected = (recyclerView.adapter as GoalsAdapter).checkedGoals[goal] ?: false
        selectedGoals[goal] = isSelected
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
}