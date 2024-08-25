package com.example.mobify.utils

import com.example.mobify.R
import com.example.mobify.model.Exercise

object ExerciseConstants {

    fun getExercise(exerciseId: Int? = null, exerciseName: String? = null): Exercise {
        val exercises = mutableListOf<Exercise>()

        // Hip mobility exercises
        exercises.add(Exercise(1, "Single leg RDL", R.drawable.single_leg_rdl, 0, false, 1, 10))
        exercises.add(Exercise(2, "Deep split squat", R.drawable.deep_split_squat, 0, false, 1, 10))
        exercises.add(Exercise(3, "Pancake stretch", R.drawable.pancake_stretch, 30, false,  0, 0))
        exercises.add(Exercise(4, "Modified pigeon stretch", R.drawable.modified_pigeon_stretch, 30, true, 0, 0))
        exercises.add(Exercise(5, "Standing hamstring kick", R.drawable.standing_hamstring_kick, 0, false, 1, 15))
        exercises.add(Exercise(6, "Wide squat", R.drawable.wide_squat, 0, false, 1, 20))
        exercises.add(Exercise(7, "Runners lunge", R.drawable.runners_lunge, 30, true, 0, 0))
        exercises.add(Exercise(8, "Butterfly stretch", R.drawable.butterfly_stretch, 30, false, 0, 0))
        exercises.add(Exercise(9, "90/90 Hip Switch", R.drawable.hip_switch_90_90, 0, false, 1, 10))
        exercises.add(Exercise(10, "Standing pancake", R.drawable.standing_pancake, 30, false, 0, 0))
        exercises.add(Exercise(11, "Figure four stretch", R.drawable.figure_four_stretch, 30, true, 0, 0))
        exercises.add(Exercise(12, "Hip flexor stretch", R.drawable.hip_flexor_stretch, 30, true, 0, 0))
        exercises.add(Exercise(13, "Elephant walks", R.drawable.elephant_waltks, 0, false, 1, 30))
        exercises.add(Exercise(14, "Couch stretch", R.drawable.couch_stretch, 0, false, 1, 30))
        exercises.add(Exercise(15, "Seated hamstring stretch", R.drawable.seated_hamstring_stretch, 30, true, 0, 0))
        exercises.add(Exercise(16, "Cobra", R.drawable.cobra, 30, false, 0, 0))
        exercises.add(Exercise(17, "Duck walks", R.drawable.duck_walks, 60, false, 0, 0))
        exercises.add(Exercise(18, "Standing pancake good morning", R.drawable.standing_pancake_good_morning, 0, false, 1, 10))
        exercises.add(Exercise(19, "90/90 extensions", R.drawable.extensions_90_90, 0, false, 1, 10))
        exercises.add(Exercise(20, "Wall deep squat", R.drawable.wall_deep_squat, 0, false, 0, 0))
        exercises.add(Exercise(21, "Cossack squat", R.drawable.cossack_squat, 0, false, 1, 8))
        exercises.add(Exercise(22, "Hip circles", R.drawable.hip_circles, 0, false, 1, 10))
        exercises.add(Exercise(23, "Modified horse stance stretch", R.drawable.modified_horse_stance_stretch, 30, false, 0, 0))
        exercises.add(Exercise(24, "Flat back hamstring stretch", R.drawable.flat_back_hamstring_stretch, 30, false, 0, 0))

        // Hamstring flexibility exercises
        exercises.add(Exercise(25, "Hamstring kicks", R.drawable.hamstring_kicks, 0, false, 1, 15))
        exercises.add(Exercise(26, "Toe touch", R.drawable.toe_touch, 30, false, 0, 0))
        exercises.add(Exercise(27, "Good morning", R.drawable.good_morning, 0, false, 1, 10))
        exercises.add(Exercise(28, "Single leg hamstring stretch", R.drawable.single_leg_hamstring_stretch, 30, true, 0, 0))
        exercises.add(Exercise(29, "Sit and reach (reps)", R.drawable.sit_and_reach, 0, false, 1, 10))
        exercises.add(Exercise(30, "Sit and reach (hold)", R.drawable.sit_and_reach, 30, false, 0, 0))
        exercises.add(Exercise(31, "Crossbody leg swings", R.drawable.crossbody_leg_swings, 0, false, 1, 15))
        exercises.add(Exercise(32, "Hamstring chokes", R.drawable.hamstring_chokes, 0, false, 1, 15))
        exercises.add(Exercise(33, "Roll down", R.drawable.roll_down, 0, false, 1, 10))
        exercises.add(Exercise(34, "Crossbody hamstring stretch", R.drawable.crossbody_hamstring_stretch, 30, true, 0, 0))

        return exercises.find { it.id == exerciseId } ?: exercises.find { it.name == exerciseName } ?: Exercise(0, "Unknown", R.drawable.logo, 0, false, 0, 0)
    }
}