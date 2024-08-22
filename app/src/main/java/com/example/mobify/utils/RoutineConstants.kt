package com.example.mobify.utils

import com.example.mobify.model.Routine

object RoutineConstants {

    fun findRoutineByName(routineName: String): Routine? {
        return when (routineName) {
            "Hip mobility Day 1" -> getHipMobilityDay01()
            "Shoulder mobility Day 1" -> getShoulderMobilityDay01()
            else -> null
        }
    }

    fun getHipMobilityDay01(): Routine {
        return Routine(
            "Hip mobility Day 1",
            listOf(
                ExerciseConstants.getExercise("Figure 4 stretch"),
                ExerciseConstants.getExercise("Figure 4 stretch"),
                ExerciseConstants.getExercise("Figure 4 stretch"),
                ExerciseConstants.getExercise("Figure 4 stretch"),
                ExerciseConstants.getExercise("Figure 4 stretch"),
                ExerciseConstants.getExercise("Figure 4 stretch")
            )
        )
    }

    fun getShoulderMobilityDay01(): Routine {
        return Routine(
            "Shoulder mobility Day 1",
            listOf(
                ExerciseConstants.getExercise("Shoulder internal rotation")
            )
        )
    }

}