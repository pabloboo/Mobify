package com.example.mobify

import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Context
import android.content.Intent
import android.content.res.Configuration
import android.os.Build
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.mobify.ui.onboarding.OnboardingActivity
import com.example.mobify.utils.SharedPreferencesConstants
import com.example.mobify.utils.SharedPreferencesFunctions
import java.util.Locale

class LaunchActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.Theme_Mobify)
        super.onCreate(savedInstanceState)

        val completedOnboarding = SharedPreferencesFunctions.getSharedPreferencesValueBoolean(this, SharedPreferencesConstants.ONBOARDING_COMPLETED)

        val activityIntent = if (completedOnboarding) {
            val language = SharedPreferencesFunctions.getSharedPreferencesValueString(this, SharedPreferencesConstants.LANGUAGE)
            if (language.isNotEmpty()) {
                setLocale(language)
            }
            Intent(this, MainActivity::class.java)
        } else {
            Intent(this, OnboardingActivity::class.java)
        }

        // Create notification channel
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val importance = NotificationManager.IMPORTANCE_DEFAULT
            val channel = NotificationChannel("exercise_channel", "exercise_channel", importance).apply {
                description = "Exercise reminder notifications"
            }
            val notificationManager: NotificationManager =
                getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
            notificationManager.createNotificationChannel(channel)
        }

        startActivity(activityIntent)
        finish()
    }

    private fun setLocale(lang: String) {
        val locale = Locale(lang)
        Locale.setDefault(locale)
        val config = Configuration()
        config.setLocale(locale)
        baseContext.resources.updateConfiguration(config, baseContext.resources.displayMetrics)
    }
}