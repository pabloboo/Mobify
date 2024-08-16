package com.example.mobify.ui.home

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.mobify.R
import com.example.mobify.model.TrainingPlan

class TrainingPlanAdapter(private val trainingPlans: List<TrainingPlan>) : RecyclerView.Adapter<TrainingPlanAdapter.TrainingPlanViewHolder>() {

    class TrainingPlanViewHolder(val view: View) : RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TrainingPlanViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.training_plan_card, parent, false)
        return TrainingPlanViewHolder(view)
    }

    override fun onBindViewHolder(holder: TrainingPlanViewHolder, position: Int) {
        val trainingPlan = trainingPlans[position]
        val textView: TextView = holder.view.findViewById(R.id.trainingPlanName)
        textView.text = trainingPlan.name
    }

    override fun getItemCount() = trainingPlans.size
}