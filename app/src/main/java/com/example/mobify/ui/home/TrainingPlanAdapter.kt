package com.example.mobify.ui.home

import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.mobify.R
import com.example.mobify.model.TrainingPlan
import com.example.mobify.ui.home.trainingPlanDetails.TrainingPlanDetailsActivity
import com.example.mobify.utils.TrainingPlanConstants

class TrainingPlanAdapter(private val trainingPlans: List<TrainingPlan>, private val context: Context) : RecyclerView.Adapter<TrainingPlanAdapter.TrainingPlanViewHolder>() {

    class TrainingPlanViewHolder(val view: View) : RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TrainingPlanViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.training_plan_card, parent, false)
        return TrainingPlanViewHolder(view)
    }

    override fun onBindViewHolder(holder: TrainingPlanViewHolder, position: Int) {
        val trainingPlan = trainingPlans[position]
        val textView: TextView = holder.view.findViewById(R.id.trainingPlanName)
        textView.text = TrainingPlanConstants.getTrainingPlanName(context, trainingPlan.name)

        val imageView: ImageView = holder.view.findViewById(R.id.trainingPlanImage)
        imageView.setImageResource(TrainingPlanConstants.getTrainingPlanImage(trainingPlan.name))
        val blueFilter = Color.argb(180, 28, 51, 93)
        imageView.setColorFilter(blueFilter)

        holder.view.setOnClickListener {
            val intent = Intent(context, TrainingPlanDetailsActivity::class.java)
            intent.putExtra("trainingPlan", trainingPlan.name)
            context.startActivity(intent)
        }
    }

    override fun getItemCount() = trainingPlans.size
}