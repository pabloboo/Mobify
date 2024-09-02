package com.example.mobify.utils

import android.app.Activity
import android.content.Context

object SharedPreferencesFunctions {

    fun getSharedPreferencesValueString(activity: Activity, key: String): String {
        val sharedPreferences = activity.getSharedPreferences(SharedPreferencesConstants.SHARED_PREFERENCES_NAME, Context.MODE_PRIVATE)
        return sharedPreferences.getString(key, "") ?: ""
    }

    fun setSharedPreferencesValueString(activity: Activity, key: String, value: String) {
        val sharedPreferences = activity.getSharedPreferences(SharedPreferencesConstants.SHARED_PREFERENCES_NAME, Context.MODE_PRIVATE)
        val editor = sharedPreferences.edit()
        editor.putString(key, value)
        editor.apply()
    }

    fun getSharedPreferencesValueBoolean(activity: Activity, key: String): Boolean {
        val sharedPreferences = activity.getSharedPreferences(SharedPreferencesConstants.SHARED_PREFERENCES_NAME, Context.MODE_PRIVATE)
        return sharedPreferences.getBoolean(key, false)
    }

    fun setSharedPreferencesValueBoolean(activity: Activity, key: String, value: Boolean) {
        val sharedPreferences = activity.getSharedPreferences(SharedPreferencesConstants.SHARED_PREFERENCES_NAME, Context.MODE_PRIVATE)
        val editor = sharedPreferences.edit()
        editor.putBoolean(key, value)
        editor.apply()
    }

    fun getSharedPreferencesValueInt(activity: Activity, key: String): Int {
        val sharedPreferences = activity.getSharedPreferences(SharedPreferencesConstants.SHARED_PREFERENCES_NAME, Context.MODE_PRIVATE)
        return sharedPreferences.getInt(key, 0)
    }

    fun setSharedPreferencesValueInt(activity: Activity, key: String, value: Int) {
        val sharedPreferences = activity.getSharedPreferences(SharedPreferencesConstants.SHARED_PREFERENCES_NAME, Context.MODE_PRIVATE)
        val editor = sharedPreferences.edit()
        editor.putInt(key, value)
        editor.apply()
    }

    // Get the number of days unlocked for a specific training plan
    fun getUnlockedDays(activity: Activity, trainingPlanName: String?): Int {
        val key = when (trainingPlanName) {
            "Hip mobility" -> SharedPreferencesConstants.HIP_MOBILITY_TRAINING_PLAN_DAY
            "Hamstring flexibility" -> SharedPreferencesConstants.HAMSTRING_FLEXIBILITY_TRAINING_PLAN_DAY
            "Shoulder mobility" -> SharedPreferencesConstants.SHOULDER_MOBILITY_TRAINING_PLAN_DAY
            "Posture mobility" -> SharedPreferencesConstants.POSTURE_MOBILITY_TRAINING_PLAN_DAY
            "Improve squat" -> SharedPreferencesConstants.IMPROVE_SQUAT_TRAINING_PLAN_DAY
            "Office worker daily mobility" -> SharedPreferencesConstants.OFFICE_WORKER_DAILY_MOBILITY_TRAINING_PLAN_DAY
            else -> ""
        }
        return getSharedPreferencesValueInt(activity, key)
    }

    // Set the number of days unlocked for a specific training plan
    fun setUnlockedDays(activity: Activity, trainingPlanName: String?, value: Int) {
        val key = when (trainingPlanName) {
            "Hip mobility" -> SharedPreferencesConstants.HIP_MOBILITY_TRAINING_PLAN_DAY
            "Hamstring flexibility" -> SharedPreferencesConstants.HAMSTRING_FLEXIBILITY_TRAINING_PLAN_DAY
            "Shoulder mobility" -> SharedPreferencesConstants.SHOULDER_MOBILITY_TRAINING_PLAN_DAY
            "Posture mobility" -> SharedPreferencesConstants.POSTURE_MOBILITY_TRAINING_PLAN_DAY
            "Improve squat" -> SharedPreferencesConstants.IMPROVE_SQUAT_TRAINING_PLAN_DAY
            "Office worker daily mobility" -> SharedPreferencesConstants.OFFICE_WORKER_DAILY_MOBILITY_TRAINING_PLAN_DAY
            else -> ""
        }
        setSharedPreferencesValueInt(activity, key, value)
    }
}