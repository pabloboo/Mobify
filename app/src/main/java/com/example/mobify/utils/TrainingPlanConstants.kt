package com.example.mobify.utils

import com.example.mobify.model.Routine
import com.example.mobify.model.TrainingPlan

object TrainingPlanConstants {

    fun createRoutines(): List<Pair<Routine, Int>> {
        return emptyList()
    }

    val trainingPlans = TrainingPlanMap.trainingPlanMap.values.map { name ->
        TrainingPlan(name, createRoutines())
    }

}