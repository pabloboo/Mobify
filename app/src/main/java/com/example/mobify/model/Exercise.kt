package com.example.mobify.model

data class Exercise(
    val id: Int,
    val name: String,
    val photo: Int,
    val time: Int,
    val singleLeg: Boolean,
    val sets: Int,
    val reps: Int
)