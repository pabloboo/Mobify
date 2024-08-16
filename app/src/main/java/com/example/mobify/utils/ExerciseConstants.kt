package com.example.mobify.utils

import com.example.mobify.R
import com.example.mobify.model.Exercise

object ExerciseConstants {

    fun getExercise(exerciseName: String): Exercise {
        val exercises = mutableListOf<Exercise>()

        exercises.add(Exercise("Figure 4 stretch", R.drawable.figure_4_stretch, 30))
        exercises.add(Exercise("Shoulder internal rotation", R.drawable.shoulder_internal_rotation, 30))

        return exercises.find { it.name == exerciseName } ?: Exercise("Unknown", R.drawable.logo, 0)
    }
}