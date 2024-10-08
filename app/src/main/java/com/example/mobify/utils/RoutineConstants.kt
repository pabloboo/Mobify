package com.example.mobify.utils

import android.content.Context
import com.example.mobify.R
import com.example.mobify.model.Exercise
import com.example.mobify.model.Routine

object RoutineConstants {

    fun findRoutineByName(context: Context, routineName: String): Routine? {
        return when (routineName) {
            "Hip mobility Day 1" -> getHipMobilityDay01(context)
            "Hip mobility Day 2" -> getHipMobilityDay02(context)
            "Hip mobility Day 3" -> getHipMobilityDay03(context)
            "Hip mobility Day 4" -> getHipMobilityDay04(context)
            "Hip mobility Day 5" -> getHipMobilityDay05(context)
            "Hip mobility Day 6" -> getHipMobilityDay06(context)
            "Hip mobility Day 7" -> getHipMobilityDay07(context)
            "Hip mobility Day 8" -> getHipMobilityDay08(context)
            "Hip mobility Day 9" -> getHipMobilityDay09(context)
            "Hip mobility Day 10" -> getHipMobilityDay10(context)
            "Hip mobility Day 11" -> getHipMobilityDay11(context)
            "Hip mobility Day 12" -> getHipMobilityDay12(context)

            "Hamstring flexibility Day 1" -> getHamstringFlexibilityDay01(context)
            "Hamstring flexibility Day 2" -> getHamstringFlexibilityDay02(context)
            "Hamstring flexibility Day 3" -> getHamstringFlexibilityDay03(context)
            "Hamstring flexibility Day 4" -> getHamstringFlexibilityDay04(context)
            "Hamstring flexibility Day 5" -> getHamstringFlexibilityDay05(context)
            "Hamstring flexibility Day 6" -> getHamstringFlexibilityDay06(context)
            "Hamstring flexibility Day 7" -> getHamstringFlexibilityDay07(context)
            "Hamstring flexibility Day 8" -> getHamstringFlexibilityDay08(context)
            "Hamstring flexibility Day 9" -> getHamstringFlexibilityDay09(context)
            "Hamstring flexibility Day 10" -> getHamstringFlexibilityDay10(context)
            "Hamstring flexibility Day 11" -> getHamstringFlexibilityDay11(context)
            "Hamstring flexibility Day 12" -> getHamstringFlexibilityDay12(context)

            "Shoulder mobility Day 1" -> getShoulderMobilityDay01(context)
            "Shoulder mobility Day 2" -> getShoulderMobilityDay02(context)
            "Shoulder mobility Day 3" -> getShoulderMobilityDay03(context)
            "Shoulder mobility Day 4" -> getShoulderMobilityDay04(context)
            "Shoulder mobility Day 5" -> getShoulderMobilityDay05(context)
            "Shoulder mobility Day 6" -> getShoulderMobilityDay06(context)
            "Shoulder mobility Day 7" -> getShoulderMobilityDay07(context)
            "Shoulder mobility Day 8" -> getShoulderMobilityDay08(context)
            "Shoulder mobility Day 9" -> getShoulderMobilityDay09(context)
            "Shoulder mobility Day 10" -> getShoulderMobilityDay10(context)
            "Shoulder mobility Day 11" -> getShoulderMobilityDay11(context)
            "Shoulder mobility Day 12" -> getShoulderMobilityDay12(context)

            "Posture mobility Day 1" -> getPostureMobilityDay01(context)
            "Posture mobility Day 2" -> getPostureMobilityDay02(context)
            "Posture mobility Day 3" -> getPostureMobilityDay03(context)
            "Posture mobility Day 4" -> getPostureMobilityDay04(context)
            "Posture mobility Day 5" -> getPostureMobilityDay05(context)
            "Posture mobility Day 6" -> getPostureMobilityDay06(context)
            "Posture mobility Day 7" -> getPostureMobilityDay07(context)
            "Posture mobility Day 8" -> getPostureMobilityDay08(context)
            "Posture mobility Day 9" -> getPostureMobilityDay09(context)
            "Posture mobility Day 10" -> getPostureMobilityDay10(context)
            "Posture mobility Day 11" -> getPostureMobilityDay11(context)
            "Posture mobility Day 12" -> getPostureMobilityDay12(context)

            "Improve squat Day 1" -> getImproveSquatDay01(context)

            "Office worker daily mobility Day 1" -> getOfficeWorkerDailyMobilityDay01(context)

            "Beginner fullbody flexibility Day 1" -> getBeginnerFullbodyFlexibilityDay01(context)

            "Beginner upper-lower flexibility Day 1" -> getBeginnerUpperLowerFlexibilityDay01(context)
            "Beginner upper-lower flexibility Day 2" -> getBeginnerUpperLowerFlexibilityDay02(context)

            "Toe touching Day 1" -> getToeTouchingDay01(context)
            "Toe touching Day 2" -> getToeTouchingDay02(context)

            "30 day pancake with PNF and loaded stretching Day 1" -> get30DayPancakeDay01(context)
            "30 day pancake with PNF and loaded stretching Day 2" -> get30DayPancakeDay02(context)
            "30 day pancake with PNF and loaded stretching Day 3" -> get30DayPancakeDay03(context)
            "30 day pancake with PNF and loaded stretching Day 4" -> get30DayPancakeDay04(context)
            "30 day pancake with PNF and loaded stretching Day 5" -> get30DayPancakeDay05(context)
            "30 day pancake with PNF and loaded stretching Day 6" -> get30DayPancakeDay06(context)
            "30 day pancake with PNF and loaded stretching Day 7" -> get30DayPancakeDay07(context)
            "30 day pancake with PNF and loaded stretching Day 8" -> get30DayPancakeDay08(context)
            "30 day pancake with PNF and loaded stretching Day 9" -> get30DayPancakeDay09(context)
            "30 day pancake with PNF and loaded stretching Day 10" -> get30DayPancakeDay10(context)
            "30 day pancake with PNF and loaded stretching Day 11" -> get30DayPancakeDay11(context)
            "30 day pancake with PNF and loaded stretching Day 12" -> get30DayPancakeDay12(context)
            "30 day pancake with PNF and loaded stretching Day 13" -> get30DayPancakeDay13(context)
            "30 day pancake with PNF and loaded stretching Day 14" -> get30DayPancakeDay14(context)
            "30 day pancake with PNF and loaded stretching Day 15" -> get30DayPancakeDay15(context)
            "30 day pancake with PNF and loaded stretching Day 16" -> get30DayPancakeDay16(context)

            else -> null
        }
    }

    // Hip mobility
    fun getHipMobilityDay01(context: Context): Routine {
        return Routine(
            "Hip mobility Day 1",
            listOf(
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.single_leg_rdl)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.deep_split_squat)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.pancake_stretch)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.pancake_stretch)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.modified_pigeon_stretch)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.modified_pigeon_stretch))
            )
        )
    }

    fun getHipMobilityDay02(context: Context): Routine {
        return Routine(
            "Hip mobility Day 2",
            listOf(
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.standing_hamstring_kick)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.wide_squat)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.runners_lunge)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.runners_lunge)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.butterfly_stretch)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.butterfly_stretch))
            )
        )
    }

    fun getHipMobilityDay03(context: Context): Routine {
        return Routine(
            "Hip mobility Day 3",
            listOf(
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.single_leg_rdl)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.deep_split_squat)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.pancake_stretch)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.pancake_stretch)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.modified_pigeon_stretch)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.modified_pigeon_stretch))
            )
        )
    }

    fun getHipMobilityDay04(context: Context): Routine {
        return Routine(
            "Hip mobility Day 4",
            listOf(
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.standing_hamstring_kick)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.wide_squat)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.runners_lunge)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.runners_lunge)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.butterfly_stretch)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.butterfly_stretch))
            )
        )
    }

    fun getHipMobilityDay05(context: Context): Routine {
        return Routine(
            "Hip mobility Day 5",
            listOf(
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.hip_switch_90_90)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.standing_pancake)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.standing_pancake)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.figure_four_stretch)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.figure_four_stretch)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.hip_flexor_stretch)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.hip_flexor_stretch))
            )
        )
    }

    fun getHipMobilityDay06(context: Context): Routine {
        return Routine(
            "Hip mobility Day 6",
            listOf(
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.elephant_walks)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.couch_stretch)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.seated_hamstring_stretch)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.seated_hamstring_stretch)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.cobra)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.cobra))
            )
        )
    }

    fun getHipMobilityDay07(context: Context): Routine {
        return Routine(
            "Hip mobility Day 7",
            listOf(
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.hip_switch_90_90)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.standing_pancake)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.standing_pancake)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.figure_four_stretch)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.figure_four_stretch)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.hip_flexor_stretch)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.hip_flexor_stretch))
            )
        )
    }

    fun getHipMobilityDay08(context: Context): Routine {
        return Routine(
            "Hip mobility Day 8",
            listOf(
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.elephant_walks)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.couch_stretch)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.seated_hamstring_stretch)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.seated_hamstring_stretch)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.cobra)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.cobra))
            )
        )
    }

    fun getHipMobilityDay09(context: Context): Routine {
        return Routine(
            "Hip mobility Day 9",
            listOf(
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.duck_walks)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.standing_pancake_good_morning)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.extensions_90_90)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.wall_deep_squat)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.wall_deep_squat))
            )
        )
    }

    fun getHipMobilityDay10(context: Context): Routine {
        return Routine(
            "Hip mobility Day 10",
            listOf(
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.cossack_squat)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.hip_circles)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.modified_horse_stance_stretch)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.modified_horse_stance_stretch)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.flat_back_hamstring_stretch)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.flat_back_hamstring_stretch))
            )
        )
    }

    fun getHipMobilityDay11(context: Context): Routine {
        return Routine(
            "Hip mobility Day 11",
            listOf(
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.duck_walks)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.standing_pancake_good_morning)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.extensions_90_90)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.wall_deep_squat)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.wall_deep_squat))
            )
        )
    }

    fun getHipMobilityDay12(context: Context): Routine {
        return Routine(
            "Hip mobility Day 12",
            listOf(
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.cossack_squat)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.hip_circles)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.modified_horse_stance_stretch)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.modified_horse_stance_stretch)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.flat_back_hamstring_stretch)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.flat_back_hamstring_stretch))
            )
        )
    }

    // Hamstring flexibility
    fun getHamstringFlexibilityDay01(context: Context): Routine {
        return Routine(
            "Hamstring flexibility Day 1",
            listOf(
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.hamstring_kicks)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.single_leg_rdl)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.toe_touch)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.toe_touch))
            )
        )
    }

    fun getHamstringFlexibilityDay02(context: Context): Routine {
        return Routine(
            "Hamstring flexibility Day 2",
            listOf(
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.elephant_walks)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.good_morning)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.single_leg_hamstring_stretch)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.single_leg_hamstring_stretch))
            )
        )
    }

    fun getHamstringFlexibilityDay03(context: Context): Routine {
        return Routine(
            "Hamstring flexibility Day 3",
            listOf(
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.hamstring_kicks)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.single_leg_rdl)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.toe_touch)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.toe_touch))
            )
        )
    }

    fun getHamstringFlexibilityDay04(context: Context): Routine {
        return Routine(
            "Hamstring flexibility Day 4",
            listOf(
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.elephant_walks)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.good_morning)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.single_leg_hamstring_stretch)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.single_leg_hamstring_stretch))
            )
        )
    }

    fun getHamstringFlexibilityDay05(context: Context): Routine {
        return Routine(
            "Hamstring flexibility Day 5",
            listOf(
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.sit_and_reach_reps)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.sit_and_reach_hold)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.flat_back_hamstring_stretch)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.flat_back_hamstring_stretch))
            )
        )
    }

    fun getHamstringFlexibilityDay06(context: Context): Routine {
        return Routine(
            "Hamstring flexibility Day 6",
            listOf(
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.crossbody_leg_swings)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.standing_pancake)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.pancake_stretch)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.pancake_stretch))
            )
        )
    }

    fun getHamstringFlexibilityDay07(context: Context): Routine {
        return Routine(
            "Hamstring flexibility Day 7",
            listOf(
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.sit_and_reach_reps)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.sit_and_reach_hold)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.flat_back_hamstring_stretch)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.flat_back_hamstring_stretch))
            )
        )
    }

    fun getHamstringFlexibilityDay08(context: Context): Routine {
        return Routine(
            "Hamstring flexibility Day 8",
            listOf(
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.crossbody_leg_swings)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.standing_pancake)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.pancake_stretch)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.pancake_stretch))
            )
        )
    }

    fun getHamstringFlexibilityDay09(context: Context): Routine {
        return Routine(
            "Hamstring flexibility Day 9",
            listOf(
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.standing_pancake_good_morning)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.hamstring_chokes)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.toe_touch)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.toe_touch))
            )
        )
    }

    fun getHamstringFlexibilityDay10(context: Context): Routine {
        return Routine(
            "Hamstring flexibility Day 10",
            listOf(
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.roll_down)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.standing_pancake_good_morning)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.crossbody_hamstring_stretch)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.crossbody_hamstring_stretch))
            )
        )
    }

    fun getHamstringFlexibilityDay11(context: Context): Routine {
        return Routine(
            "Hamstring flexibility Day 11",
            listOf(
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.standing_pancake_good_morning)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.hamstring_chokes)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.toe_touch)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.toe_touch))
            )
        )
    }

    fun getHamstringFlexibilityDay12(context: Context): Routine {
        return Routine(
            "Hamstring flexibility Day 12",
            listOf(
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.roll_down)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.standing_pancake_good_morning)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.crossbody_hamstring_stretch)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.crossbody_hamstring_stretch))
            )
        )
    }

    // Shoulder mobility
    fun getShoulderMobilityDay01(context: Context): Routine {
        return Routine(
            "Shoulder mobility Day 1",
            listOf(
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.crossbody_arm_swings)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.chair_dips)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.dip_hold)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.box_shoulder_stretch))
            )
        )
    }

    fun getShoulderMobilityDay02(context: Context): Routine {
        return Routine(
            "Shoulder mobility Day 2",
            listOf(
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.arm_circles)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.chest_pulses)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.behind_the_back_bicep_stretch)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.door_frame_chest_stretch))
            )
        )
    }

    fun getShoulderMobilityDay03(context: Context): Routine {
        return Routine(
            "Shoulder mobility Day 3",
            listOf(
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.crossbody_arm_swings)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.chair_dips)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.dip_hold)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.box_shoulder_stretch))
            )
        )
    }

    fun getShoulderMobilityDay04(context: Context): Routine {
        return Routine(
            "Shoulder mobility Day 4",
            listOf(
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.arm_circles)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.chest_pulses)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.behind_the_back_bicep_stretch)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.door_frame_chest_stretch))
            )
        )
    }

    fun getShoulderMobilityDay05(context: Context): Routine {
        return Routine(
            "Shoulder mobility Day 5",
            listOf(
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.crossbody_arm_swings)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.shoulder_dislocations)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.loaded_lat_stretch)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.bicep_stretch))
            )
        )
    }

    fun getShoulderMobilityDay06(context: Context): Routine {
        return Routine(
            "Shoulder mobility Day 6",
            listOf(
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.arm_circles)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.chest_pulses)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.behind_the_back_bicep_stretch)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.door_frame_chest_stretch))
            )
        )
    }

    fun getShoulderMobilityDay07(context: Context): Routine {
        return Routine(
            "Shoulder mobility Day 7",
            listOf(
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.crossbody_arm_swings)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.shoulder_dislocations)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.loaded_lat_stretch)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.bicep_stretch))
            )
        )
    }

    fun getShoulderMobilityDay08(context: Context): Routine {
        return Routine(
            "Shoulder mobility Day 8",
            listOf(
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.chest_pulses)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.cherry_pickers)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.side_stretch)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.broomstick_chest_opener))
            )
        )
    }

    fun getShoulderMobilityDay09(context: Context): Routine {
        return Routine(
            "Shoulder mobility Day 9",
            listOf(
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.crossbody_arm_swings)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.shoulder_dislocations)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.loaded_lat_stretch)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.bicep_stretch))
            )
        )
    }

    fun getShoulderMobilityDay10(context: Context): Routine {
        return Routine(
            "Shoulder mobility Day 10",
            listOf(
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.chest_pulses)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.cherry_pickers)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.side_stretch)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.broomstick_chest_opener))
            )
        )
    }

    fun getShoulderMobilityDay11(context: Context): Routine {
        return Routine(
            "Shoulder mobility Day 11",
            listOf(
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.crossbody_arm_swings)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.chair_dips)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.dip_hold)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.lat_stretch))
            )
        )
    }

    fun getShoulderMobilityDay12(context: Context): Routine {
        return Routine(
            "Shoulder mobility Day 12",
            listOf(
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.chest_pulses)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.cherry_pickers)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.side_stretch)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.broomstick_chest_opener))
            )
        )
    }

    // Posture mobility

    fun getPostureMobilityDay01(context: Context): Routine {
        return Routine(
            "Posture mobility Day 1",
            listOf(
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.wall_extension)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.wall_extension)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.pike)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.wall_lat_stretch)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.wall_angels))
            )
        )
    }

    fun getPostureMobilityDay02(context: Context): Routine {
        return Routine(
            "Posture mobility Day 2",
            listOf(
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.seated_twist)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.cat_cow)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.basic_back_lift)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.lateral_neck_stretch))
            )
        )
    }

    fun getPostureMobilityDay03(context: Context): Routine {
        return Routine(
            "Posture mobility Day 3",
            listOf(
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.wall_extension)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.wall_extension)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.pike)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.wall_lat_stretch)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.wall_angels))
            )
        )
    }

    fun getPostureMobilityDay04(context: Context): Routine {
        return Routine(
            "Posture mobility Day 4",
            listOf(
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.seated_twist)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.cat_cow)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.basic_back_lift)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.lateral_neck_stretch))
            )
        )
    }

    fun getPostureMobilityDay05(context: Context): Routine {
        return Routine(
            "Posture mobility Day 5",
            listOf(
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.wall_back_bend_walkdown)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.roll_down)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.wall_chest_stretch)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.wall_angels))
            )
        )
    }

    fun getPostureMobilityDay06(context: Context): Routine {
        return Routine(
            "Posture mobility Day 6",
            listOf(
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.active_twist_hold)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.lateral_stretch)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.cat)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.cat)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.cow)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.cow))
            )
        )
    }

    fun getPostureMobilityDay07(context: Context): Routine {
        return Routine(
            "Posture mobility Day 7",
            listOf(
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.wall_back_bend_walkdown)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.roll_down)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.wall_chest_stretch)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.wall_angels))
            )
        )
    }

    fun getPostureMobilityDay08(context: Context): Routine {
        return Routine(
            "Posture mobility Day 8",
            listOf(
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.active_twist_hold)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.lateral_stretch)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.cat)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.cat)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.cow)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.cow))
            )
        )
    }

    fun getPostureMobilityDay09(context: Context): Routine {
        return Routine(
            "Posture mobility Day 9",
            listOf(
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.wall_extension)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.wall_extension)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.sit_and_reach_hold)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.shoulder_external_rotation)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.wall_angels))
            )
        )
    }

    fun getPostureMobilityDay10(context: Context): Routine {
        return Routine(
            "Posture mobility Day 10",
            listOf(
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.thread_the_needle)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.lunging_lateral_stretch)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.shoulder_internal_rotation)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.cat_cow))
            )
        )
    }

    fun getPostureMobilityDay11(context: Context): Routine {
        return Routine(
            "Posture mobility Day 11",
            listOf(
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.wall_extension)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.wall_extension)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.sit_and_reach_hold)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.sit_and_reach_hold)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.shoulder_external_rotation)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.shoulder_external_rotation)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.wall_angels))
            )
        )
    }

    fun getPostureMobilityDay12(context: Context): Routine {
        return Routine(
            "Posture mobility Day 12",
            listOf(
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.thread_the_needle)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.thread_the_needle)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.lunging_lateral_stretch)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.lunging_lateral_stretch)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.shoulder_internal_rotation)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.shoulder_internal_rotation)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.cat_cow))
            )
        )
    }

    // Improve squat
    fun getImproveSquatDay01(context: Context): Routine {
        return Routine(
            "Improve squat Day 1",
            listOf(
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.ankle_band_mobilization)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.ankle_foam_rolling)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.ankle_stretch)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.knee_touchdown_progression)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.hip_band_mobilitazion)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.worlds_greatest_stretch)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.unilateral_adbuction)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.squat_bracing_process)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.bird_dog_progression)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.zombie_front_squat)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.prayer_stretch)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.corner_stretch)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.upper_posterior_chain_activation)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.external_rotation_press))
            )
        )
    }

    // Office Worker Mobility
    fun getOfficeWorkerDailyMobilityDay01(context: Context): Routine {
        return Routine(
            "Office worker daily mobility Day 1",
            listOf(
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.seated_figure_four_stretch)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.elevated_hip_flexor_stretch)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.prone_scapular_rotation)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.kneeling_hip_flexor_stretch_with_knee_flexion))
            )
        )
    }

    // Beginner Fullbody Flexibility
    fun getBeginnerFullbodyFlexibilityDay01(context: Context): Routine {
        return Routine(
            "Beginner fullbody flexibility Day 1",
            listOf(
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.shoulder_backbend)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.spine_backbend)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.rear_hand_clasp)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.lying_cross)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.wrist_biceps_stretch)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.one_leg_pike)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.kneeling_lunge)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.pancake)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.butterfly)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.calf_stretch))
            )
        )
    }

    // Beginner Upper-Lower Flexibility
    fun getBeginnerUpperLowerFlexibilityDay01(context: Context): Routine {
        return Routine(
            "Beginner upper-lower flexibility Day 1",
            listOf(
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.shoulder_backbend)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.spine_backbend)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.rear_hand_clasp)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.lying_cross)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.wrist_biceps_stretch))
            )
        )
    }

    fun getBeginnerUpperLowerFlexibilityDay02(context: Context): Routine {
        return Routine(
            "Beginner upper-lower flexibility Day 2",
            listOf(
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.one_leg_pike)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.kneeling_lunge)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.pancake)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.butterfly)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.calf_stretch))
            )
        )
    }

    // Toe touching
    fun getToeTouchingDay01(context: Context): Routine {
        return Routine(
            "Toe touching Day 1",
            listOf(
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.figure_four_stretch)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.figure_four_stretch)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.couch_stretch)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.couch_stretch)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.calf_stretch)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.bent_knee_to_straight_leg)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.bent_knee_to_straight_leg)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.toe_touch)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.toe_touch)),
            )
        )
    }

    fun getToeTouchingDay02(context: Context): Routine {
        return Routine(
            "Toe touching Day 2",
            listOf(
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.figure_four_stretch)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.figure_four_stretch)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.couch_stretch)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.couch_stretch)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.calf_stretch)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.standing_split_hamstring_floss)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.standing_split_hamstring_floss)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.toe_touch)),
                ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.toe_touch)),
            )
        )
    }

    // 30 day pancake with PNF and loaded stretching
    private fun getWeek1Of30PancakeExercises(context: Context): List<Exercise> {
        return listOf(
            // Warm-up
            ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.crossbody_leg_swings)),
            ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.cat_cow)),
            // Main routine
            ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.seated_wide_legged_forward_fold)),
            ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.pigeon_pose)),
            ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.butterfly_stretch_2)),
            ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.standing_wide_legged_forward_bend)),
            ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.seated_wide_legged_forward_fold)),
            ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.pigeon_pose)),
            ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.butterfly_stretch_2)),
            ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.standing_wide_legged_forward_bend)),
            // Cool-down
            ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.supine_twist))
        )
    }

    fun get30DayPancakeDay01(context: Context): Routine {
        return Routine(
            "30 day pancake with PNF and loaded stretching Day 1",
            getWeek1Of30PancakeExercises(context)
        )
    }

    fun get30DayPancakeDay02(context: Context): Routine {
        return Routine(
            "30 day pancake with PNF and loaded stretching Day 2",
            getWeek1Of30PancakeExercises(context)
        )
    }

    fun get30DayPancakeDay03(context: Context): Routine {
        return Routine(
            "30 day pancake with PNF and loaded stretching Day 3",
            getWeek1Of30PancakeExercises(context)
        )
    }

    fun get30DayPancakeDay04(context: Context): Routine {
        return Routine(
            "30 day pancake with PNF and loaded stretching Day 4",
            getWeek1Of30PancakeExercises(context)
        )
    }

    private fun getWeek2Of30PancakeExercises(context: Context): List<Exercise> {
        return listOf(
            // Warm-up
            ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.crossbody_leg_swings)),
            ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.leg_raises)),
            // Main routine
            ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.pancake_stretch_with_weight)),
            ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.deep_frog_stretch)),
            ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.elevated_pancake_stretch)),
            ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.cossack_squats)),
            ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.active_pancake_lift_offs)),
            ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.pancake_stretch_with_weight)),
            ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.deep_frog_stretch)),
            ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.elevated_pancake_stretch)),
            ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.cossack_squats)),
            ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.active_pancake_lift_offs)),
            // Cool-down
            ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.butterfly_pose_with_forward_fold))
        )
    }

    fun get30DayPancakeDay05(context: Context): Routine {
        return Routine(
            "30 day pancake with PNF and loaded stretching Day 5",
            getWeek2Of30PancakeExercises(context)
        )
    }

    fun get30DayPancakeDay06(context: Context): Routine {
        return Routine(
            "30 day pancake with PNF and loaded stretching Day 6",
            getWeek2Of30PancakeExercises(context)
        )
    }

    fun get30DayPancakeDay07(context: Context): Routine {
        return Routine(
            "30 day pancake with PNF and loaded stretching Day 7",
            getWeek2Of30PancakeExercises(context)
        )
    }

    fun get30DayPancakeDay08(context: Context): Routine {
        return Routine(
            "30 day pancake with PNF and loaded stretching Day 8",
            getWeek2Of30PancakeExercises(context)
        )
    }

    private fun getWeek3Of30PancakeExercises(context: Context): List<Exercise> {
        return listOf(
            // Warm-up
            ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.crossbody_leg_swings)),
            ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.dynamic_lunges)),
            // Main routine
            ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.pancake_stretch_with_weight)),
            ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.deep_frog_stretch)),
            ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.pigeon_pose)),
            ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.cossack_squats_with_weight)),
            ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.active_pancake_holds)),
            ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.pancake_stretch_with_weight)),
            ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.deep_frog_stretch)),
            ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.pigeon_pose)),
            ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.cossack_squats_with_weight)),
            ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.active_pancake_holds)),
            // Cool-down
            ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.pancake_stretch))
        )
    }

    fun get30DayPancakeDay09(context: Context): Routine {
        return Routine(
            "30 day pancake with PNF and loaded stretching Day 9",
            getWeek3Of30PancakeExercises(context)
        )
    }

    fun get30DayPancakeDay10(context: Context): Routine {
        return Routine(
            "30 day pancake with PNF and loaded stretching Day 10",
            getWeek3Of30PancakeExercises(context)
        )
    }

    fun get30DayPancakeDay11(context: Context): Routine {
        return Routine(
            "30 day pancake with PNF and loaded stretching Day 11",
            getWeek3Of30PancakeExercises(context)
        )
    }

    fun get30DayPancakeDay12(context: Context): Routine {
        return Routine(
            "30 day pancake with PNF and loaded stretching Day 12",
            getWeek3Of30PancakeExercises(context)
        )
    }

    private fun getWeek4Of30PancakeExercises(context: Context): List<Exercise> {
        return listOf(
            // Warm-up
            ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.crossbody_leg_swings)),
            ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.leg_raises)),
            // Main routine
            ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.pancake_stretch_with_weight)),
            ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.elevated_pancake_stretch)),
            ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.deep_frog_stretch)),
            ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.cossack_squats_with_weight)),
            ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.active_pancake_lift_offs)),
            ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.active_pancake_holds)),
            ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.pancake_stretch_with_weight)),
            ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.elevated_pancake_stretch)),
            ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.deep_frog_stretch)),
            ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.cossack_squats_with_weight)),
            ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.active_pancake_lift_offs)),
            ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.active_pancake_holds)),
            ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.pancake_stretch_with_weight)),
            ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.elevated_pancake_stretch)),
            ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.deep_frog_stretch)),
            ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.cossack_squats_with_weight)),
            ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.active_pancake_lift_offs)),
            ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.active_pancake_holds)),
            // Cool-down
            ExerciseConstants.getExercise(context, exerciseName = context.getString(R.string.seated_wide_legged_forward_fold))
        )
    }

    fun get30DayPancakeDay13(context: Context): Routine {
        return Routine(
            "30 day pancake with PNF and loaded stretching Day 13",
            getWeek4Of30PancakeExercises(context)
        )
    }

    fun get30DayPancakeDay14(context: Context): Routine {
        return Routine(
            "30 day pancake with PNF and loaded stretching Day 14",
            getWeek4Of30PancakeExercises(context)
        )
    }

    fun get30DayPancakeDay15(context: Context): Routine {
        return Routine(
            "30 day pancake with PNF and loaded stretching Day 15",
            getWeek4Of30PancakeExercises(context)
        )
    }

    fun get30DayPancakeDay16(context: Context): Routine {
        return Routine(
            "30 day pancake with PNF and loaded stretching Day 16",
            getWeek4Of30PancakeExercises(context)
        )
    }

}