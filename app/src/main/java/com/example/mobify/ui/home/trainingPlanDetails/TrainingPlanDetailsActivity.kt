package com.example.mobify.ui.home.trainingPlanDetails

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.mobify.R
import com.example.mobify.utils.SharedPreferencesFunctions.getUnlockedDays
import com.example.mobify.utils.TrainingPlanConstants

class TrainingPlanDetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_routine_details)

        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)

        val trainingPlanTitle = findViewById<TextView>(R.id.trainingPlanTitle)
        val trainingPlanDescription = findViewById<TextView>(R.id.trainingPlanDescription)
        val recyclerView = findViewById<RecyclerView>(R.id.routineRecyclerView)

        val trainingPlanName = intent.getStringExtra("trainingPlan")
        trainingPlanTitle.text = TrainingPlanConstants.getTrainingPlanName(this, trainingPlanName!!)

        val trainingPlan = TrainingPlanConstants.getTrainingPlans(this).find { it.name == trainingPlanName }
        trainingPlanDescription.text = trainingPlan?.description

        val unlockedDays = getUnlockedDays(this, trainingPlanName)

        recyclerView.layoutManager = GridLayoutManager(this, 5)
        recyclerView.adapter = trainingPlan?.let { TrainingPlanDetailsAdapter(it.routines, unlockedDays) }
    }
}