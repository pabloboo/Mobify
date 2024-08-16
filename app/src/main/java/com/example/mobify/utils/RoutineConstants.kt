package com.example.mobify.utils

import com.example.mobify.model.Routine

object RoutineConstants {

    fun getHipMobilityDay01(): Routine {
        return Routine(
            "Hip Mobility Day 1",
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
            "Shoulder Mobility Day 1",
            listOf(
                ExerciseConstants.getExercise("Shoulder internal rotation")
            )
        )
    }

}