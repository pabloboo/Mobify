package com.example.mobify.utils

object TrainingPlanMap {

    val trainingPlanMap = mapOf(
        SharedPreferencesConstants.HIP_MOBILITY_TRAINING_PLAN to "Hip mobility",
        SharedPreferencesConstants.HAMSTRING_FLEXIBILITY_TRAINING_PLAN to "Hamstring flexibility",
        SharedPreferencesConstants.SHOULDER_MOBILITY_TRAINING_PLAN to "Shoulder mobility",
        SharedPreferencesConstants.POSTURE_MOBILITY_TRAINING_PLAN to "Posture mobility",
        SharedPreferencesConstants.IMPROVE_SQUAT_TRAINING_PLAN to "Improve squat",
        SharedPreferencesConstants.OFFICE_WORKER_DAILY_MOBILITY_TRAINING_PLAN to "Office worker daily mobility",
        SharedPreferencesConstants.BEGINNER_FULLBODY_FLEXIBILITY_TRAINING_PLAN to "Beginner fullbody flexibility",
        SharedPreferencesConstants.BEGINNER_UPPER_LOWER_FLEXIBILITY_TRAINING_PLAN to "Beginner upper-lower flexibility",
        SharedPreferencesConstants.TOE_TOUCHING_TRAINING_PLAN to "Toe touching"
    )

    val invertedMapTrainingPlan = trainingPlanMap.entries.associateBy({ it.value }) { it.key }

    val trainingPlanToTrainingPlanDaysMap = mapOf(
        SharedPreferencesConstants.HIP_MOBILITY_TRAINING_PLAN to SharedPreferencesConstants.HIP_MOBILITY_TRAINING_PLAN_DAY,
        SharedPreferencesConstants.HAMSTRING_FLEXIBILITY_TRAINING_PLAN to SharedPreferencesConstants.HAMSTRING_FLEXIBILITY_TRAINING_PLAN_DAY,
        SharedPreferencesConstants.SHOULDER_MOBILITY_TRAINING_PLAN to SharedPreferencesConstants.SHOULDER_MOBILITY_TRAINING_PLAN_DAY,
        SharedPreferencesConstants.POSTURE_MOBILITY_TRAINING_PLAN to SharedPreferencesConstants.POSTURE_MOBILITY_TRAINING_PLAN_DAY,
        SharedPreferencesConstants.IMPROVE_SQUAT_TRAINING_PLAN to SharedPreferencesConstants.IMPROVE_SQUAT_TRAINING_PLAN_DAY,
        SharedPreferencesConstants.OFFICE_WORKER_DAILY_MOBILITY_TRAINING_PLAN to SharedPreferencesConstants.OFFICE_WORKER_DAILY_MOBILITY_TRAINING_PLAN_DAY,
        SharedPreferencesConstants.BEGINNER_FULLBODY_FLEXIBILITY_TRAINING_PLAN to SharedPreferencesConstants.BEGINNER_FULLBODY_FLEXIBILITY_TRAINING_PLAN_DAY,
        SharedPreferencesConstants.BEGINNER_UPPER_LOWER_FLEXIBILITY_TRAINING_PLAN to SharedPreferencesConstants.BEGINNER_UPPER_LOWER_FLEXIBILITY_TRAINING_PLAN_DAY,
        SharedPreferencesConstants.TOE_TOUCHING_TRAINING_PLAN to SharedPreferencesConstants.TOE_TOUCHING_TRAINING_PLAN_DAY
    )

}