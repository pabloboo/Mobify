package com.example.mobify.utils

import com.example.mobify.model.Routine
import com.example.mobify.model.TrainingPlan

object TrainingPlanConstants {

    private fun getRoutines(trainingPlanName: String): List<Pair<Routine, Int>> {
        return if (trainingPlanName == "Hip mobility") {
            listOf(
                Pair(RoutineConstants.getHipMobilityDay01(), 1),
                Pair(RoutineConstants.getHipMobilityDay02(), 2),
                Pair(RoutineConstants.getHipMobilityDay03(), 3),
                Pair(RoutineConstants.getHipMobilityDay04(), 4),
                Pair(RoutineConstants.getHipMobilityDay05(), 5),
                Pair(RoutineConstants.getHipMobilityDay06(), 6),
                Pair(RoutineConstants.getHipMobilityDay07(), 7),
                Pair(RoutineConstants.getHipMobilityDay08(), 8),
                Pair(RoutineConstants.getHipMobilityDay09(), 9),
                Pair(RoutineConstants.getHipMobilityDay10(), 10),
                Pair(RoutineConstants.getHipMobilityDay11(), 11),
                Pair(RoutineConstants.getHipMobilityDay12(), 12)
            )
        } else if (trainingPlanName == "Hamstring flexibility") {
            listOf(
                Pair(RoutineConstants.getHamstringFlexibilityDay01(), 1),
                Pair(RoutineConstants.getHamstringFlexibilityDay02(), 2),
                Pair(RoutineConstants.getHamstringFlexibilityDay03(), 3),
                Pair(RoutineConstants.getHamstringFlexibilityDay04(), 4),
                Pair(RoutineConstants.getHamstringFlexibilityDay05(), 5),
                Pair(RoutineConstants.getHamstringFlexibilityDay06(), 6),
                Pair(RoutineConstants.getHamstringFlexibilityDay07(), 7),
                Pair(RoutineConstants.getHamstringFlexibilityDay08(), 8),
                Pair(RoutineConstants.getHamstringFlexibilityDay09(), 9),
                Pair(RoutineConstants.getHamstringFlexibilityDay10(), 10),
                Pair(RoutineConstants.getHamstringFlexibilityDay11(), 11),
                Pair(RoutineConstants.getHamstringFlexibilityDay12(), 12)
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