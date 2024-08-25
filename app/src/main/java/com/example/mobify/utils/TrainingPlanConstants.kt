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
                Pair(RoutineConstants.getShoulderMobilityDay02(), 2),
                Pair(RoutineConstants.getShoulderMobilityDay03(), 3),
                Pair(RoutineConstants.getShoulderMobilityDay04(), 4),
                Pair(RoutineConstants.getShoulderMobilityDay05(), 5),
                Pair(RoutineConstants.getShoulderMobilityDay06(), 6),
                Pair(RoutineConstants.getShoulderMobilityDay07(), 7),
                Pair(RoutineConstants.getShoulderMobilityDay08(), 8),
                Pair(RoutineConstants.getShoulderMobilityDay09(), 9),
                Pair(RoutineConstants.getShoulderMobilityDay10(), 10),
                Pair(RoutineConstants.getShoulderMobilityDay11(), 11),
                Pair(RoutineConstants.getShoulderMobilityDay12(), 12)
            )
        } else if (trainingPlanName == "Posture mobility") {
            listOf(
                Pair(RoutineConstants.getPostureMobilityDay01(), 1),
                Pair(RoutineConstants.getPostureMobilityDay02(), 2),
                Pair(RoutineConstants.getPostureMobilityDay03(), 3),
                Pair(RoutineConstants.getPostureMobilityDay04(), 4),
                Pair(RoutineConstants.getPostureMobilityDay05(), 5),
                Pair(RoutineConstants.getPostureMobilityDay06(), 6),
                Pair(RoutineConstants.getPostureMobilityDay07(), 7),
                Pair(RoutineConstants.getPostureMobilityDay08(), 8),
                Pair(RoutineConstants.getPostureMobilityDay09(), 9),
                Pair(RoutineConstants.getPostureMobilityDay10(), 10),
                Pair(RoutineConstants.getPostureMobilityDay11(), 11),
                Pair(RoutineConstants.getPostureMobilityDay12(), 12)
            )
        } else {
            emptyList()
        }
    }

    private fun getDescription(trainingPlanName: String): String {
        return when (trainingPlanName) {
            "Hip mobility" -> "This training plan will help you improve your hip mobility. It is designed to do three workouts per week for four weeks."
            "Hamstring flexibility" -> "This training plan will help you improve your hamstring flexibility. It is designed to do three workouts per week for four weeks."
            "Shoulder mobility" -> "This training plan will help you improve your shoulder mobility. It is designed to do three workouts per week for four weeks."
            "Posture mobility" -> "This training plan will help you improve your posture and spinal mobility. It is designed to do three workouts per week for four weeks."
            else -> ""
        }
    }

    val trainingPlans = TrainingPlanMap.trainingPlanMap.values.map { name ->
        TrainingPlan(name, getDescription(name), getRoutines(name))
    }

    fun getTrainingPlanNameFromRoutineName(routineName: String): String {
        val splitRoutineName = routineName.split(" ")
        return splitRoutineName.subList(0, splitRoutineName.size - 2).joinToString(" ")
    }

}