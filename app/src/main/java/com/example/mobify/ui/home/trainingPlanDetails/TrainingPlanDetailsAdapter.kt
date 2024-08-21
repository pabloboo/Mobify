package com.example.mobify.ui.home.trainingPlanDetails

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.mobify.R
import com.example.mobify.model.Routine
import com.example.mobify.ui.home.routine.RoutineActivity

class TrainingPlanDetailsAdapter(private val routines: List<Pair<Routine, Int>>) : RecyclerView.Adapter<TrainingPlanDetailsAdapter.ViewHolder>() {
    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(routine: Pair<Routine, Int>) {
            val dayTextView: TextView = itemView.findViewById(R.id.dayTextView)
            val day = routine.second
            dayTextView.text = "$day"
            itemView.setOnClickListener {
                val intent = Intent(itemView.context, RoutineActivity::class.java)
                intent.putExtra("routine", routine.first.name)
                itemView.context.startActivity(intent)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.routine_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(routines[position])
    }

    override fun getItemCount() = routines.size
}