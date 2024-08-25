package com.example.mobify.utils

import com.example.mobify.R
import com.example.mobify.model.QuickMobilityTestExercise

object QuickMobilityTestExerciseConstants {

    fun getQuickMobilityTestExercises(): List<QuickMobilityTestExercise> {
        var quickMobilityTestExercises = mutableListOf<QuickMobilityTestExercise>()

        quickMobilityTestExercises.add(
            QuickMobilityTestExercise(
                1,
                "Hip rotation test",
                R.drawable.hip_rotation_test,
                "Sit on the floor with your legs extended in front of you. Slowly rotate your leg inward and then outward while keeping your torso straight.",
                listOf("Full range of motion with ease", "Some difficulty rotating", "Unable to rotate fully")
            )
        )

        quickMobilityTestExercises.add(
            QuickMobilityTestExercise(
                2,
                "Forward Bend Test",
                R.drawable.forward_bend_test,
                "Stand with your feet together and slowly bend forward at the hips, trying to touch your toes without bending your knees.",
                listOf("Can easily touch my toes", "Can reach just above my toes", "Cannot reach my toes")
            )
        )

        quickMobilityTestExercises.add(
            QuickMobilityTestExercise(
                3,
                "Behind-the-Back Reach",
                R.drawable.behind_the_back_reach_test,
                "Reach one hand over your shoulder and the other hand behind your back, trying to make your hands touch.",
                listOf("Hands can easily touch", "Hands are close but not touching", "Hands are far apart")
            )
        )

        quickMobilityTestExercises.add(
            QuickMobilityTestExercise(
                4,
                "Wall Extension Test",
                R.drawable.wall_extension_test,
                "Stand with your heels, back, and head against a wall. Try to lift your arms overhead without moving your head or back away from the wall.",
                listOf("Can fully extend arms without losing contact", "Some difficulty maintaining contact", "Cannot fully extend arms without losing contact")
            )
        )

        return quickMobilityTestExercises
    }

}