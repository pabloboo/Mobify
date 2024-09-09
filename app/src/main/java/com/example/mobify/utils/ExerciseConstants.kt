package com.example.mobify.utils

import android.content.Context
import com.example.mobify.R
import com.example.mobify.model.Exercise

object ExerciseConstants {

    fun getExercise(context: Context, exerciseId: Int? = null, exerciseName: String? = null): Exercise {
        val exercises = mutableListOf<Exercise>()

        // Hip mobility exercises
        exercises.add(Exercise(1, context.getString(R.string.single_leg_rdl), R.drawable.single_leg_rdl, 0, false, 1, 10, context.getString(R.string.single_leg_rdl_description)))
        exercises.add(Exercise(2, context.getString(R.string.deep_split_squat), R.drawable.deep_split_squat, 0, false, 1, 10, context.getString(R.string.deep_split_squat_description)))
        exercises.add(Exercise(3, context.getString(R.string.pancake_stretch), R.drawable.pancake_stretch, 30, false,  0, 0, context.getString(R.string.pancake_stretch_description)))
        exercises.add(Exercise(4, context.getString(R.string.modified_pigeon_stretch), R.drawable.modified_pigeon_stretch, 30, true, 0, 0, context.getString(R.string.modified_pigeon_stretch_description)))
        exercises.add(Exercise(5, context.getString(R.string.standing_hamstring_kick), R.drawable.standing_hamstring_kick, 0, false, 1, 15, context.getString(R.string.standing_hamstring_kick_description)))
        exercises.add(Exercise(6, context.getString(R.string.wide_squat), R.drawable.wide_squat, 0, false, 1, 20, context.getString(R.string.wide_squat_description)))
        exercises.add(Exercise(7, context.getString(R.string.runners_lunge), R.drawable.runners_lunge, 30, true, 0, 0, context.getString(R.string.runners_lunge_description)))
        exercises.add(Exercise(8, context.getString(R.string.butterfly_stretch), R.drawable.butterfly_stretch, 30, false, 0, 0, context.getString(R.string.butterfly_stretch_description)))
        exercises.add(Exercise(9, context.getString(R.string.hip_switch_90_90), R.drawable.hip_switch_90_90, 0, false, 1, 10, context.getString(R.string.hip_switch_90_90_description)))
        exercises.add(Exercise(10, context.getString(R.string.standing_pancake), R.drawable.standing_pancake, 30, false, 0, 0, context.getString(R.string.standing_pancake_description)))
        exercises.add(Exercise(11, context.getString(R.string.figure_four_stretch), R.drawable.figure_four_stretch, 30, true, 0, 0, context.getString(R.string.figure_four_stretch_description)))
        exercises.add(Exercise(12, context.getString(R.string.hip_flexor_stretch), R.drawable.hip_flexor_stretch, 30, true, 0, 0, context.getString(R.string.hip_flexor_stretch_description)))
        exercises.add(Exercise(13, context.getString(R.string.elephant_walks), R.drawable.elephant_waltks, 0, false, 1, 30, context.getString(R.string.elephant_walks_description)))
        exercises.add(Exercise(14, context.getString(R.string.couch_stretch), R.drawable.couch_stretch, 0, false, 1, 30, context.getString(R.string.couch_stretch_description)))
        exercises.add(Exercise(15, context.getString(R.string.seated_hamstring_stretch), R.drawable.seated_hamstring_stretch, 30, true, 0, 0, context.getString(R.string.seated_hamstring_stretch_description)))
        exercises.add(Exercise(16, context.getString(R.string.cobra), R.drawable.cobra, 30, false, 0, 0, context.getString(R.string.cobra_description)))
        exercises.add(Exercise(17, context.getString(R.string.duck_walks), R.drawable.duck_walks, 60, false, 0, 0, context.getString(R.string.duck_walks_description)))
        exercises.add(Exercise(18, context.getString(R.string.standing_pancake_good_morning), R.drawable.standing_pancake_good_morning, 0, false, 1, 10, context.getString(R.string.standing_pancake_good_morning_description)))
        exercises.add(Exercise(19, context.getString(R.string.extensions_90_90), R.drawable.extensions_90_90, 0, false, 1, 10, context.getString(R.string.extensions_90_90_description)))
        exercises.add(Exercise(20, context.getString(R.string.wall_deep_squat), R.drawable.wall_deep_squat, 30, false, 0, 0, context.getString(R.string.wall_deep_squat_description)))
        exercises.add(Exercise(21, context.getString(R.string.cossack_squat), R.drawable.cossack_squat, 0, false, 1, 8, context.getString(R.string.cossack_squat_description)))
        exercises.add(Exercise(22, context.getString(R.string.hip_circles), R.drawable.hip_circles, 0, false, 1, 10, context.getString(R.string.hip_circles_description)))
        exercises.add(Exercise(23, context.getString(R.string.modified_horse_stance_stretch), R.drawable.modified_horse_stance_stretch, 30, false, 0, 0, context.getString(R.string.modified_horse_stance_stretch_description)))
        exercises.add(Exercise(24, context.getString(R.string.flat_back_hamstring_stretch), R.drawable.flat_back_hamstring_stretch, 30, false, 0, 0, context.getString(R.string.flat_back_hamstring_stretch_description)))

        // Hamstring flexibility exercises
        exercises.add(Exercise(25, context.getString(R.string.hamstring_kicks), R.drawable.standing_hamstring_kick, 0, false, 1, 15, context.getString(R.string.hamstring_kicks_description)))
        exercises.add(Exercise(26, context.getString(R.string.toe_touch), R.drawable.toe_touch, 30, false, 0, 0, context.getString(R.string.toe_touch_description)))
        exercises.add(Exercise(27, context.getString(R.string.good_morning), R.drawable.good_morning, 0, false, 1, 10, context.getString(R.string.good_morning_description)))
        exercises.add(Exercise(28, context.getString(R.string.single_leg_hamstring_stretch), R.drawable.seated_hamstring_stretch, 30, true, 0, 0, context.getString(R.string.single_leg_hamstring_stretch_description)))
        exercises.add(Exercise(29, context.getString(R.string.sit_and_reach_reps), R.drawable.sit_and_reach, 0, false, 1, 10, context.getString(R.string.sit_and_reach_reps_description)))
        exercises.add(Exercise(30, context.getString(R.string.sit_and_reach_hold), R.drawable.sit_and_reach, 30, false, 0, 0, context.getString(R.string.sit_and_reach_hold_description)))
        exercises.add(Exercise(31, context.getString(R.string.crossbody_leg_swings), R.drawable.crossbody_leg_swings, 0, false, 1, 15, context.getString(R.string.crossbody_leg_swings_description)))
        exercises.add(Exercise(32, context.getString(R.string.hamstring_chokes), R.drawable.hamstring_chokes, 0, false, 1, 15, context.getString(R.string.hamstring_chokes_description)))
        exercises.add(Exercise(33, context.getString(R.string.roll_down), R.drawable.roll_down, 0, false, 1, 10, context.getString(R.string.roll_down_description)))
        exercises.add(Exercise(34, context.getString(R.string.crossbody_hamstring_stretch), R.drawable.crossbody_hamstring_stretch, 30, true, 0, 0, context.getString(R.string.crossbody_hamstring_stretch_description)))

        // Shoulder mobility exercises
        exercises.add(Exercise(35, context.getString(R.string.crossbody_arm_swings), R.drawable.crossbody_arm_swings, 0, false, 1, 20, context.getString(R.string.crossbody_arm_swings_description)))
        exercises.add(Exercise(36, context.getString(R.string.chair_dips), R.drawable.chair_dips, 0, false, 1, 10, context.getString(R.string.chair_dips_description)))
        exercises.add(Exercise(37, context.getString(R.string.dip_hold), R.drawable.dip_hold, 30, false, 0, 0, context.getString(R.string.dip_hold_description)))
        exercises.add(Exercise(38, context.getString(R.string.box_shoulder_stretch), R.drawable.box_shoulder_stretch, 30, false, 0, 0, context.getString(R.string.box_shoulder_stretch_description)))
        exercises.add(Exercise(39, context.getString(R.string.arm_circles), R.drawable.arm_circles, 0, false, 1, 20, context.getString(R.string.arm_circles_description)))
        exercises.add(Exercise(40, context.getString(R.string.chest_pulses), R.drawable.chest_pulses, 0, false, 1, 20, context.getString(R.string.chest_pulses_description)))
        exercises.add(Exercise(41, context.getString(R.string.behind_the_back_bicep_stretch), R.drawable.behind_the_back_bicep_stretch, 30, false, 0, 0, context.getString(R.string.behind_the_back_bicep_stretch_description)))
        exercises.add(Exercise(42, context.getString(R.string.door_frame_chest_stretch), R.drawable.door_frame_chest_stretch, 30, false, 0, 0, context.getString(R.string.door_frame_chest_stretch_description)))
        exercises.add(Exercise(43, context.getString(R.string.shoulder_dislocations), R.drawable.shoulder_dislocations, 0, false, 1, 10, context.getString(R.string.shoulder_dislocations_description)))
        exercises.add(Exercise(44, context.getString(R.string.loaded_lat_stretch), R.drawable.loaded_lat_stretch, 0, false, 1, 30, context.getString(R.string.loaded_lat_stretch_description)))
        exercises.add(Exercise(45, context.getString(R.string.bicep_stretch), R.drawable.bicep_stretch, 30, false, 0, 0, context.getString(R.string.bicep_stretch_description)))
        exercises.add(Exercise(46, context.getString(R.string.cherry_pickers), R.drawable.cherry_pickers, 0, false, 1, 20, context.getString(R.string.cherry_pickers_description)))
        exercises.add(Exercise(47, context.getString(R.string.side_stretch), R.drawable.lateral_stretch, 30, true, 0, 0, context.getString(R.string.side_stretch_description)))
        exercises.add(Exercise(48, context.getString(R.string.broomstick_chest_opener), R.drawable.broomstick_chest_opener, 30, false, 0, 0, context.getString(R.string.broomstick_chest_opener_description)))

        // Posture mobility exercises
        exercises.add(Exercise(49, context.getString(R.string.wall_extension), R.drawable.wall_extension, 30, false, 0, 0, context.getString(R.string.wall_extension_description)))
        exercises.add(Exercise(50, context.getString(R.string.pike), R.drawable.pike, 30, false, 0, 0, context.getString(R.string.pike_description)))
        exercises.add(Exercise(51, context.getString(R.string.wall_lat_stretch), R.drawable.wall_lat_stretch, 30, false, 0, 0, context.getString(R.string.wall_lat_stretch_description)))
        exercises.add(Exercise(52, context.getString(R.string.wall_angels), R.drawable.wall_angels, 0, false, 1, 10, context.getString(R.string.wall_angels_description)))
        exercises.add(Exercise(53, context.getString(R.string.seated_twist), R.drawable.seated_twist, 30, false, 0, 0, context.getString(R.string.seated_twist_description)))
        exercises.add(Exercise(54, context.getString(R.string.cat_cow), R.drawable.cat_cow, 0, false, 1, 10, context.getString(R.string.cat_cow_description)))
        exercises.add(Exercise(55, context.getString(R.string.basic_back_lift), R.drawable.basic_back_lift, 0, false, 2, 10, context.getString(R.string.basic_back_lift_description)))
        exercises.add(Exercise(56, context.getString(R.string.lateral_neck_stretch), R.drawable.lateral_neck_stretch, 30, true, 0, 0, context.getString(R.string.lateral_neck_stretch_description)))
        exercises.add(Exercise(57, context.getString(R.string.wall_back_bend_walkdown), R.drawable.wall_back_bend_walkdown, 0, false, 2, 10, context.getString(R.string.wall_back_bend_walkdown_description)))
        exercises.add(Exercise(58, context.getString(R.string.wall_chest_stretch), R.drawable.wall_chest_stretch, 30, false, 0, 0, context.getString(R.string.wall_chest_stretch_description)))
        exercises.add(Exercise(59, context.getString(R.string.active_twist_hold), R.drawable.active_twist_hold, 30, true, 0, 0, context.getString(R.string.active_twist_hold_description)))
        exercises.add(Exercise(60, context.getString(R.string.lateral_stretch), R.drawable.lateral_stretch, 30, true, 0, 0, context.getString(R.string.lateral_stretch_description)))
        exercises.add(Exercise(61, context.getString(R.string.cat), R.drawable.cat, 30, false, 0, 0, context.getString(R.string.cat_description)))
        exercises.add(Exercise(62, context.getString(R.string.cow), R.drawable.cow, 30, false, 0, 0, context.getString(R.string.cow_description)))
        exercises.add(Exercise(63, context.getString(R.string.lat_stretch), R.drawable.lat_stretch, 30, true, 0, 0, context.getString(R.string.lat_stretch_description)))
        exercises.add(Exercise(64, context.getString(R.string.shoulder_external_rotation), R.drawable.shoulder_external_rotation, 30, false, 0, 0, context.getString(R.string.shoulder_external_rotation_description)))
        exercises.add(Exercise(65, context.getString(R.string.thread_the_needle), R.drawable.thread_the_needle, 30, true, 0, 0, context.getString(R.string.thread_the_needle_description)))
        exercises.add(Exercise(66, context.getString(R.string.lunging_lateral_stretch), R.drawable.lunging_lateral_stretch, 30, true, 0, 0, context.getString(R.string.lunging_lateral_stretch_description)))
        exercises.add(Exercise(67, context.getString(R.string.shoulder_internal_rotation), R.drawable.shoulder_internal_rotation, 30, true, 0, 0, context.getString(R.string.shoulder_internal_rotation_description)))

        // Improve squat exercises
        exercises.add(Exercise(68, context.getString(R.string.ankle_band_mobilization), R.drawable.ankle_band_mobilization, 30, true, 0, 0, context.getString(R.string.ankle_band_mobilization_description)))
        exercises.add(Exercise(69, context.getString(R.string.ankle_foam_rolling), R.drawable.ankle_foam_rolling, 60, true, 0, 0, context.getString(R.string.ankle_foam_rolling_description)))
        exercises.add(Exercise(70, context.getString(R.string.ankle_stretch), R.drawable.ankle_stretch, 30, true, 0, 0, context.getString(R.string.ankle_stretch_description)))
        exercises.add(Exercise(71, context.getString(R.string.knee_touchdown_progression), R.drawable.knee_touchdown_progression, 0, false, 1, 10, context.getString(R.string.knee_touchdown_progression_description)))
        exercises.add(Exercise(72, context.getString(R.string.hip_band_mobilitazion), R.drawable.hip_band_mobilitazion, 0, false, 1, 10, context.getString(R.string.hip_band_mobilitazion_description)))
        exercises.add(Exercise(73, context.getString(R.string.hip_foam_rolling), R.drawable.hip_foam_rolling, 60, false, 0, 0, context.getString(R.string.hip_foam_rolling_description)))
        exercises.add(Exercise(74, context.getString(R.string.worlds_greatest_stretch), R.drawable.worlds_greatest_stretch, 30, true, 0, 0, context.getString(R.string.worlds_greatest_stretch_description)))
        exercises.add(Exercise(75, context.getString(R.string.unilateral_adbuction), R.drawable.unilateral_abduction, 0, false, 1, 10, context.getString(R.string.unilateral_adbuction_description)))
        exercises.add(Exercise(76, context.getString(R.string.squat_bracing_process), R.drawable.squat_bracing_process, 0, false, 3, 10, context.getString(R.string.squat_bracing_process_description)))
        exercises.add(Exercise(77, context.getString(R.string.bird_dog_progression), R.drawable.bird_dog_progression, 0, false, 2, 10, context.getString(R.string.bird_dog_progression_description)))
        exercises.add(Exercise(78, context.getString(R.string.zombie_front_squat), R.drawable.zombie_front_squat, 0, false, 2, 5, context.getString(R.string.zombie_front_squat_description)))
        exercises.add(Exercise(79, context.getString(R.string.prayer_stretch), R.drawable.prayer_stretch, 30, false, 0, 0, context.getString(R.string.prayer_stretch_description)))
        exercises.add(Exercise(80, context.getString(R.string.corner_stretch), R.drawable.corner_stretch, 30, false, 0, 0, context.getString(R.string.corner_stretch_description)))
        exercises.add(Exercise(81, context.getString(R.string.upper_posterior_chain_activation), R.drawable.upper_posterior_chain_activation, 0, false, 1, 10, context.getString(R.string.upper_posterior_chain_activation_description)))
        exercises.add(Exercise(82, context.getString(R.string.external_rotation_press), R.drawable.external_rotation_press, 0, false, 1, 10, context.getString(R.string.external_rotation_press_description)))

        // Office worker daily mobility Plan exercises
        exercises.add(Exercise(83, context.getString(R.string.seated_figure_four_stretch), R.drawable.seated_figure_four_stretch, 30, true, 0, 0, context.getString(R.string.seated_figure_four_stretch_description)))
        exercises.add(Exercise(84, context.getString(R.string.elevated_hip_flexor_stretch), R.drawable.elevated_hip_flexor_stretch, 45, true, 0, 0, context.getString(R.string.elevated_hip_flexor_stretch_description)))
        exercises.add(Exercise(85, context.getString(R.string.prone_scapular_rotation), R.drawable.prone_scapular_rotation, 0, false, 1, 10, context.getString(R.string.prone_scapular_rotation_description)))
        exercises.add(Exercise(86, context.getString(R.string.kneeling_hip_flexor_stretch_with_knee_flexion), R.drawable.kneeling_hip_flexor_stretch_with_knee_flexion, 30, true, 0, 0, context.getString(R.string.kneeling_hip_flexor_stretch_with_knee_flexion_description)))

        return exercises.find { it.id == exerciseId } ?: exercises.find { it.name == exerciseName } ?: Exercise(0, "Unknown", R.drawable.logo, 0, false, 0, 0, "")
    }
}