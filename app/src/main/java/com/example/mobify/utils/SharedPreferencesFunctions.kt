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
}