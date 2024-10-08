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
        } else if (trainingPlanName == "Improve squat") {
            listOf(
                Pair(RoutineConstants.getImproveSquatDay01(context), 1)
            )
        } else if (trainingPlanName == "Office worker daily mobility") {
            listOf(
                Pair(RoutineConstants.getOfficeWorkerDailyMobilityDay01(context), 1)
            )
        } else if (trainingPlanName == "Beginner fullbody flexibility") {
            listOf(
                Pair(RoutineConstants.getBeginnerFullbodyFlexibilityDay01(context), 1)
            )
        } else if (trainingPlanName == "Beginner upper-lower flexibility") {
            listOf(
                Pair(RoutineConstants.getBeginnerUpperLowerFlexibilityDay01(context), 1),
                Pair(RoutineConstants.getBeginnerUpperLowerFlexibilityDay02(context), 2)
            )
        } else if (trainingPlanName == "Toe touching") {
            listOf(
                Pair(RoutineConstants.getToeTouchingDay01(context), 1),
                Pair(RoutineConstants.getToeTouchingDay02(context), 2)
            )
        } else if (trainingPlanName == "30 day pancake with PNF and loaded stretching") {
            listOf(
                Pair(RoutineConstants.get30DayPancakeDay01(context), 1),
                Pair(RoutineConstants.get30DayPancakeDay02(context), 2),
                Pair(RoutineConstants.get30DayPancakeDay03(context), 3),
                Pair(RoutineConstants.get30DayPancakeDay04(context), 4),
                Pair(RoutineConstants.get30DayPancakeDay05(context), 5),
                Pair(RoutineConstants.get30DayPancakeDay06(context), 6),
                Pair(RoutineConstants.get30DayPancakeDay07(context), 7),
                Pair(RoutineConstants.get30DayPancakeDay08(context), 8),
                Pair(RoutineConstants.get30DayPancakeDay09(context), 9),
                Pair(RoutineConstants.get30DayPancakeDay10(context), 10),
                Pair(RoutineConstants.get30DayPancakeDay11(context), 11),
                Pair(RoutineConstants.get30DayPancakeDay12(context), 12),
                Pair(RoutineConstants.get30DayPancakeDay13(context), 13),
                Pair(RoutineConstants.get30DayPancakeDay14(context), 14),
                Pair(RoutineConstants.get30DayPancakeDay15(context), 15),
                Pair(RoutineConstants.get30DayPancakeDay16(context), 16)
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
            "Improve squat" -> context.getString(R.string.improve_squat_description)
            "Office worker daily mobility" -> context.getString(R.string.office_worker_daily_mobility_description)
            "Beginner fullbody flexibility" -> context.getString(R.string.beginner_fullbody_flexibility_description)
            "Beginner upper-lower flexibility" -> context.getString(R.string.beginner_upper_lower_flexibility_description)
            "Toe touching" -> context.getString(R.string.toe_touching_description)
            "30 day pancake with PNF and loaded stretching" -> context.getString(R.string.thirty_day_pancake_with_pnf_and_loaded_stretching_description)
            else -> ""
        }
    }

    fun getTrainingPlanName(context: Context, trainingPlanName: String): String {
        return when (trainingPlanName) {
            "Hip mobility" -> context.getString(R.string.hip_mobility)
            "Hamstring flexibility" -> context.getString(R.string.hamstring_flexibility)
            "Shoulder mobility" -> context.getString(R.string.shoulder_mobility)
            "Posture mobility" -> context.getString(R.string.posture_mobility)
            "Improve squat" -> context.getString(R.string.improve_squat)
            "Office worker daily mobility" -> context.getString(R.string.office_worker_daily_mobility)
            "Beginner fullbody flexibility" -> context.getString(R.string.beginner_fullbody_flexibility)
            "Beginner upper-lower flexibility" -> context.getString(R.string.beginner_upper_lower_flexibility)
            "Toe touching" -> context.getString(R.string.toe_touching)
            "30 day pancake with PNF and loaded stretching" -> context.getString(R.string.thirty_day_pancake_with_pnf_and_loaded_stretching)
            else -> ""
        }
    }

    fun getTrainingPlanImage(trainingPlanName: String): Int {
        return when (trainingPlanName) {
            "Hip mobility" -> R.drawable.training_plan_hip_mobility
            "Hamstring flexibility" -> R.drawable.training_plan_hamstring_flexibility
            "Shoulder mobility" -> R.drawable.training_plan_shoulder_mobility
            "Posture mobility" -> R.drawable.training_plan_posture_mobility
            "Improve squat" -> R.drawable.training_plan_improve_squat
            "Office worker daily mobility" -> R.drawable.training_plan_office_worker_daily_mobility
            "Beginner fullbody flexibility" -> R.drawable.training_plan_beginner_fullbody_flexibility
            "Beginner upper-lower flexibility" -> R.drawable.training_plan_beginner_upper_lower_flexibility
            "Toe touching" -> R.drawable.training_plan_toe_touching
            "30 day pancake with PNF and loaded stretching" -> R.drawable.training_plan_thirty_day_pancake_with_pnf_and_loaded_stretching
            else -> R.drawable.logo
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