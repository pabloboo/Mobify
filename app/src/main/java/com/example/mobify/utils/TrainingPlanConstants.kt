package com.example.mobify.utils

import com.example.mobify.model.Routine
import com.example.mobify.model.TrainingPlan

object TrainingPlanConstants {

    private fun getRoutines(trainingPlanName: String): List<Pair<Routine, Int>> {
        return if (trainingPlanName == "Hip mobility") {
            listOf(
                Pair(RoutineConstants.getHipMobilityDay01(), 1),
                Pair(RoutineConstants.getHipMobilityDay01(), 2),
                Pair(RoutineConstants.getHipMobilityDay01(), 3),
                Pair(RoutineConstants.getHipMobilityDay01(), 4),
                Pair(RoutineConstants.getHipMobilityDay01(), 5),
                Pair(RoutineConstants.getHipMobilityDay01(), 6)
            )
        } else if (trainingPlanName == "Shoulder mobility") {
            listOf(
                Pair(RoutineConstants.getShoulderMobilityDay01(), 1),
                Pair(RoutineConstants.getShoulderMobilityDay01(), 2),
                Pair(RoutineConstants.getShoulderMobilityDay01(), 3),
            )
        } else {
            emptyList()
        }
    }

    val trainingPlans = TrainingPlanMap.trainingPlanMap.values.map { name ->
        TrainingPlan(name, getRoutines(name))
    }

    fun getTrainingPlanNameFromRoutineName(routineName: String): String {
        val splitRoutineName = routineName.split(" ")
        return splitRoutineName.subList(0, splitRoutineName.size - 2).joinToString(" ")
    }

}