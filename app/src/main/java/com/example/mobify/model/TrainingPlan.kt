package com.example.mobify.model

data class TrainingPlan (
    val name: String,
    val description: String,
    val routines: List<Pair<Routine, Int>> // Int is the day of the routine in the training plan
)