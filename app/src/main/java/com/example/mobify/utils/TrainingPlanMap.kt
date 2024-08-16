package com.example.mobify.utils

object TrainingPlanMap {

    val trainingPlanMap = mapOf(
        SharedPreferencesConstants.HIP_MOBILITY_TRAINING_PLAN to "Hip mobility",
        SharedPreferencesConstants.HAMSTRING_FLEXIBILITY_TRAINING_PLAN to "Hamstring flexibility",
        SharedPreferencesConstants.SHOULDER_MOBILITY_TRAINING_PLAN to "Shoulder mobility",
        SharedPreferencesConstants.POSTURE_MOBILITY_TRAINING_PLAN to "Posture mobility"
    )

    val invertedMapTrainingPlan = trainingPlanMap.entries.associateBy({ it.value }) { it.key }

}