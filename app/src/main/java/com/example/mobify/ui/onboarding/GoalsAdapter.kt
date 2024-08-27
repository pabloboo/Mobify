package com.example.mobify.ui.onboarding

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckedTextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.mobify.R
import com.example.mobify.utils.TrainingPlanConstants

class GoalsAdapter(private val goals: Array<String>, private val listener: GoalClickListener) : RecyclerView.Adapter<GoalsAdapter.GoalsViewHolder>() {

    val checkedGoals = goals.associateWith { false }.toMutableMap()

    class GoalsViewHolder(val view: View) : RecyclerView.ViewHolder(view) {
        val checkedTextView: CheckedTextView = view.findViewById(android.R.id.text1)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GoalsViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(android.R.layout.simple_list_item_multiple_choice, parent, false)
        return GoalsViewHolder(view)
    }

    override fun onBindViewHolder(holder: GoalsViewHolder, position: Int) {
        val goal = goals[position]
        holder.checkedTextView.text = TrainingPlanConstants.getTrainingPlanName(holder.view.context, goal)
        holder.checkedTextView.isChecked = checkedGoals[goal] ?: false
        holder.checkedTextView.setTextColor(holder.view.context.resources.getColor(R.color.primaryTextColor, null))
        holder.checkedTextView.checkMarkTintList = holder.view.context.resources.getColorStateList(R.color.primaryTextColor, null)
        holder.view.setOnClickListener {
            val isChecked = holder.checkedTextView.isChecked
            Log.d("SelectGoalsFragment", "Selected goals: ${getSelectedGoalsSize()}")
            if (getSelectedGoalsSize() >= 2 && !isChecked) {
                Toast.makeText(holder.view.context, "You can only select up to 2 goals", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            holder.checkedTextView.isChecked = !isChecked
            checkedGoals[goal] = !isChecked
            listener.onGoalClick(position)
        }
    }

    fun getSelectedGoals(): List<String> {
        val selectedGoals = mutableListOf<String>()
        for (goal in checkedGoals) {
            if (goal.value) {
                selectedGoals.add(goal.key)
            }
        }
        return selectedGoals
    }

    private fun getSelectedGoalsSize(): Int {
        var count = 0
        for (goal in checkedGoals) {
            if (goal.value) {
                count++
            }
        }
        return count
    }

    override fun getItemCount() = goals.size
}