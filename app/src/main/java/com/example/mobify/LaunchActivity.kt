package com.example.mobify

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.mobify.ui.onboarding.OnboardingActivity
import com.example.mobify.utils.SharedPreferencesConstants
import com.example.mobify.utils.SharedPreferencesFunctions

class LaunchActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.Theme_Mobify)
        super.onCreate(savedInstanceState)

        val completedOnboarding = SharedPreferencesFunctions.getSharedPreferencesValueBoolean(this, SharedPreferencesConstants.ONBOARDING_COMPLETED)

        val activityIntent = if (completedOnboarding) {
            Intent(this, MainActivity::class.java)
        } else {
            Intent(this, OnboardingActivity::class.java)
        }

        startActivity(activityIntent)
        finish()
    }
}