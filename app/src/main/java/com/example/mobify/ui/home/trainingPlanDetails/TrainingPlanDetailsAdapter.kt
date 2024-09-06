package com.example.mobify.ui.home.trainingPlanDetails

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.mobify.R
import com.example.mobify.model.Routine
import com.example.mobify.ui.home.routine.RoutineActivity

class TrainingPlanDetailsAdapter(private val routines: List<Pair<Routine, Int>>, private val unlockedDays: Int) : RecyclerView.Adapter<TrainingPlanDetailsAdapter.ViewHolder>() {
    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(routine: Pair<Routine, Int>) {
            val dayCardView : CardView = itemView.findViewById(R.id.dayCardView)
            val dayTextView: TextView = itemView.findViewById(R.id.dayTextView)
            val day = routine.second
            dayTextView.text = "$day"

            var dayUnlocked = false
            if (day == 1 && unlockedDays == 0) { // First day
                dayUnlocked = true
            } else if (day-1 < unlockedDays) { // Day completed
                dayCardView.setCardBackgroundColor(itemView.context.getColor(R.color.successColor))
                dayTextView.setTextColor(itemView.context.getColor(R.color.black))
                dayUnlocked = true
            } else if (day-1 > unlockedDays) { // Day locked
                dayCardView.setCardBackgroundColor(itemView.context.getColor(R.color.lockedDayColor))
                dayTextView.setTextColor(itemView.context.getColor(R.color.black))
                itemView.setOnClickListener {
                    Toast.makeText(itemView.context, itemView.context.getString(R.string.day_not_unlocked_error), Toast.LENGTH_SHORT).show()
                }
            } else if (day-1 == unlockedDays) { // Current day
                dayUnlocked = true
            }

            if (dayUnlocked) {
                itemView.setOnClickListener {
                    val intent = Intent(itemView.context, RoutineActivity::class.java)
                    intent.putExtra("routine", routine.first.name)
                    itemView.context.startActivity(intent)
                }
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