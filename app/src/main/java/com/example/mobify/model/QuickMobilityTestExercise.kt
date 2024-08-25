package com.example.mobify.model

data class QuickMobilityTestExercise (
    val id: Int,
    val name: String,
    val photo: Int,
    val description: String,
    val selectionOptions: List<String>
)