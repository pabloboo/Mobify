package com.example.mobify.utils

import android.content.Context
import com.example.mobify.R
import com.example.mobify.model.QuickMobilityTestExercise

object QuickMobilityTestExerciseConstants {

    fun getQuickMobilityTestExercises(context: Context): List<QuickMobilityTestExercise> {
        var quickMobilityTestExercises = mutableListOf<QuickMobilityTestExercise>()

        quickMobilityTestExercises.add(
            QuickMobilityTestExercise(
                1,
                context.getString(R.string.hip_rotation_test),
                R.drawable.hip_rotation_test,
                context.getString(R.string.hip_rotation_test_description),
                listOf(context.getString(R.string.hip_rotation_test_response_easy), context.getString(R.string.hip_rotation_test_response_medium), context.getString(R.string.hip_rotation_test_response_hard))
            )
        )

        quickMobilityTestExercises.add(
            QuickMobilityTestExercise(
                2,
                context.getString(R.string.forward_bend_test),
                R.drawable.forward_bend_test,
                context.getString(R.string.forward_bend_test_description),
                listOf(context.getString(R.string.forward_bend_test_response_easy), context.getString(R.string.forward_bend_test_response_medium), context.getString(R.string.forward_bend_test_response_hard))
            )
        )

        quickMobilityTestExercises.add(
            QuickMobilityTestExercise(
                3,
                context.getString(R.string.behind_the_back_reach_test),
                R.drawable.behind_the_back_reach_test,
                context.getString(R.string.behind_the_back_reach_test_description),
                listOf(context.getString(R.string.behind_the_back_reach_test_response_easy), context.getString(R.string.behind_the_back_reach_test_response_medium), context.getString(R.string.behind_the_back_reach_test_response_hard))
            )
        )

        quickMobilityTestExercises.add(
            QuickMobilityTestExercise(
                4,
                context.getString(R.string.wall_extension_test),
                R.drawable.wall_extension_test,
                context.getString(R.string.wall_extension_test_description),
                listOf(context.getString(R.string.wall_extension_test_response_easy), context.getString(R.string.wall_extension_test_response_medium), context.getString(R.string.wall_extension_test_response_hard))
            )
        )

        return quickMobilityTestExercises
    }

}