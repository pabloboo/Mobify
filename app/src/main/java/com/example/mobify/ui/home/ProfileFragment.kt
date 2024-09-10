package com.example.mobify.ui.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.mobify.R
import com.example.mobify.utils.SharedPreferencesConstants
import com.example.mobify.utils.SharedPreferencesFunctions
import com.example.mobify.utils.SharedPreferencesFunctions.getSharedPreferencesValueInt


class ProfileFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val root = inflater.inflate(R.layout.fragment_profile, container, false)

        val totalExerciseDaysTv = root.findViewById<TextView>(R.id.total_exercise_days)
        val currentStreakTv = root.findViewById<TextView>(R.id.current_streak_count)
        val longestStreakTv = root.findViewById<TextView>(R.id.longest_streak_count)

        val totalExerciseDays = getSharedPreferencesValueInt(requireActivity(), SharedPreferencesConstants.TOTAL_EXERCISE_DAYS)
        val currentStreak = getSharedPreferencesValueInt(requireActivity(), SharedPreferencesConstants.CURRENT_STREAK)
        val longestStreak = getSharedPreferencesValueInt(requireActivity(), SharedPreferencesConstants.LONGEST_STREAK)

        totalExerciseDaysTv.text = totalExerciseDays.toString()
        currentStreakTv.text = currentStreak.toString()
        longestStreakTv.text = longestStreak.toString()

        return root
    }
}