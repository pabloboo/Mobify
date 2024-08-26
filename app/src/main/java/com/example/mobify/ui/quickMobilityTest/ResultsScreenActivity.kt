package com.example.mobify.ui.quickMobilityTest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.widget.Toolbar
import com.example.mobify.MainActivity
import com.example.mobify.R
import com.example.mobify.ui.onboarding.OnboardingActivity
import com.example.mobify.utils.SharedPreferencesConstants
import com.example.mobify.utils.SharedPreferencesFunctions

class ResultsScreenActivity : AppCompatActivity() {
    private lateinit var resultsTextView: TextView
    private lateinit var finishButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_results_screen)

        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)

        resultsTextView = findViewById(R.id.resultsTextView)
        val results = intent.getStringExtra("results")
        resultsTextView.text = results

        finishButton = findViewById(R.id.finishButton)

        val isOnboadingCompleted = SharedPreferencesFunctions.getSharedPreferencesValueBoolean(this, SharedPreferencesConstants.ONBOARDING_COMPLETED)

        if (!isOnboadingCompleted) {
            setSharedPreferencesValues(results!!)
        }

        if (!isOnboadingCompleted) {
            finishButton.setOnClickListener {
                val intent = Intent(this, OnboardingActivity::class.java)
                val page = 3
                intent.putExtra("page", page)
                startActivity(intent)
                finish()
            }
        } else {
            finishButton.setOnClickListener {
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
                finish()
            }
        }
    }

    private fun setSharedPreferencesValues(results: String) {
        val hipMobility = results.contains("Hip mobility")
        val hamstringFlexibility = results.contains("Hamstring flexibility")
        val shoulderMobility = results.contains("Shoulder mobility")
        val postureMobility = results.contains("Posture mobility")

        SharedPreferencesFunctions.setSharedPreferencesValueBoolean(this, SharedPreferencesConstants.HIP_MOBILITY_TRAINING_PLAN, hipMobility)
        SharedPreferencesFunctions.setSharedPreferencesValueBoolean(this, SharedPreferencesConstants.HAMSTRING_FLEXIBILITY_TRAINING_PLAN, hamstringFlexibility)
        SharedPreferencesFunctions.setSharedPreferencesValueBoolean(this, SharedPreferencesConstants.SHOULDER_MOBILITY_TRAINING_PLAN, shoulderMobility)
        SharedPreferencesFunctions.setSharedPreferencesValueBoolean(this, SharedPreferencesConstants.POSTURE_MOBILITY_TRAINING_PLAN, postureMobility)
    }
}