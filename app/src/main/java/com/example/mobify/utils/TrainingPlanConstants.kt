package com.example.mobify.utils

import android.content.Context
import com.example.mobify.R
import com.example.mobify.model.Routine
import com.example.mobify.model.TrainingPlan

object TrainingPlanConstants {

    private fun getRoutines(context: Context, trainingPlanName: String): List<Pair<Routine, Int>> {
        return if (trainingPlanName == "Hip mobility") {
            listOf(
                Pair(RoutineConstants.getHipMobilityDay01(context), 1),
                Pair(RoutineConstants.getHipMobilityDay02(context), 2),
                Pair(RoutineConstants.getHipMobilityDay03(context), 3),
                Pair(RoutineConstants.getHipMobilityDay04(context), 4),
                Pair(RoutineConstants.getHipMobilityDay05(context), 5),
                Pair(RoutineConstants.getHipMobilityDay06(context), 6),
                Pair(RoutineConstants.getHipMobilityDay07(context), 7),
                Pair(RoutineConstants.getHipMobilityDay08(context), 8),
                Pair(RoutineConstants.getHipMobilityDay09(context), 9),
                Pair(RoutineConstants.getHipMobilityDay10(context), 10),
                Pair(RoutineConstants.getHipMobilityDay11(context), 11),
                Pair(RoutineConstants.getHipMobilityDay12(context), 12)
            )
        } else if (trainingPlanName == "Hamstring flexibility") {
            listOf(
                Pair(RoutineConstants.getHamstringFlexibilityDay01(context), 1),
                Pair(RoutineConstants.getHamstringFlexibilityDay02(context), 2),
                Pair(RoutineConstants.getHamstringFlexibilityDay03(context), 3),
                Pair(RoutineConstants.getHamstringFlexibilityDay04(context), 4),
                Pair(RoutineConstants.getHamstringFlexibilityDay05(context), 5),
                Pair(RoutineConstants.getHamstringFlexibilityDay06(context), 6),
                Pair(RoutineConstants.getHamstringFlexibilityDay07(context), 7),
                Pair(RoutineConstants.getHamstringFlexibilityDay08(context), 8),
                Pair(RoutineConstants.getHamstringFlexibilityDay09(context), 9),
                Pair(RoutineConstants.getHamstringFlexibilityDay10(context), 10),
                Pair(RoutineConstants.getHamstringFlexibilityDay11(context), 11),
                Pair(RoutineConstants.getHamstringFlexibilityDay12(context), 12)
            )
        } else if (trainingPlanName == "Shoulder mobility") {
            listOf(
                Pair(RoutineConstants.getShoulderMobilityDay01(context), 1),
                Pair(RoutineConstants.getShoulderMobilityDay02(context), 2),
                Pair(RoutineConstants.getShoulderMobilityDay03(context), 3),
                Pair(RoutineConstants.getShoulderMobilityDay04(context), 4),
                Pair(RoutineConstants.getShoulderMobilityDay05(context), 5),
                Pair(RoutineConstants.getShoulderMobilityDay06(context), 6),
                Pair(RoutineConstants.getShoulderMobilityDay07(context), 7),
                Pair(RoutineConstants.getShoulderMobilityDay08(context), 8),
                Pair(RoutineConstants.getShoulderMobilityDay09(context), 9),
                Pair(RoutineConstants.getShoulderMobilityDay10(context), 10),
                Pair(RoutineConstants.getShoulderMobilityDay11(context), 11),
                Pair(RoutineConstants.getShoulderMobilityDay12(context), 12)
            )
        } else if (trainingPlanName == "Posture mobility") {
            listOf(
                Pair(RoutineConstants.getPostureMobilityDay01(context), 1),
                Pair(RoutineConstants.getPostureMobilityDay02(context), 2),
                Pair(RoutineConstants.getPostureMobilityDay03(context), 3),
                Pair(RoutineConstants.getPostureMobilityDay04(context), 4),
                Pair(RoutineConstants.getPostureMobilityDay05(context), 5),
                Pair(RoutineConstants.getPostureMobilityDay06(context), 6),
                Pair(RoutineConstants.getPostureMobilityDay07(context), 7),
                Pair(RoutineConstants.getPostureMobilityDay08(context), 8),
                Pair(RoutineConstants.getPostureMobilityDay09(context), 9),
                Pair(RoutineConstants.getPostureMobilityDay10(context), 10),
                Pair(RoutineConstants.getPostureMobilityDay11(context), 11),
                Pair(RoutineConstants.getPostureMobilityDay12(context), 12)
            )
        } else {
            emptyList()
        }
    }

    private fun getDescription(context: Context, trainingPlanName: String): String {
        return when (trainingPlanName) {
            "Hip mobility" -> context.getString(R.string.hip_mobility_description)
            "Hamstring flexibility" -> context.getString(R.string.hamstring_flexibility_description)
            "Shoulder mobility" -> context.getString(R.string.shoulder_mobility_description)
            "Posture mobility" -> context.getString(R.string.posture_mobility_description)
            else -> ""
        }
    }

    fun getTrainingPlanName(context: Context, trainingPlanName: String): String {
        return when (trainingPlanName) {
            "Hip mobility" -> context.getString(R.string.hip_mobility)
            "Hamstring flexibility" -> context.getString(R.string.hamstring_flexibility)
            "Shoulder mobility" -> context.getString(R.string.shoulder_mobility)
            "Posture mobility" -> context.getString(R.string.posture_mobility)
            else -> ""
        }
    }

    fun getTrainingPlans(context: Context): List<TrainingPlan> {
        return TrainingPlanMap.trainingPlanMap.values.map { name ->
            TrainingPlan(name, getDescription(context, name), getRoutines(context, name))
        }
    }

    fun getTrainingPlanNameFromRoutineName(routineName: String): String {
        val splitRoutineName = routineName.split(" ")
        return splitRoutineName.subList(0, splitRoutineName.size - 2).joinToString(" ")
    }

}