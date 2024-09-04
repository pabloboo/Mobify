package com.example.mobify.ui.home.settings

import android.content.Intent
import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Button
import android.widget.ImageButton
import android.widget.Switch
import androidx.activity.addCallback
import androidx.appcompat.app.AppCompatDelegate
import androidx.appcompat.widget.Toolbar
import com.example.mobify.MainActivity
import com.example.mobify.R
import com.example.mobify.utils.SharedPreferencesConstants
import com.example.mobify.utils.SharedPreferencesFunctions
import java.util.Locale

class SettingsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)

        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)
        val actionBar = supportActionBar
        actionBar?.setDisplayHomeAsUpEnabled(true)

        val englishButton: ImageButton = findViewById(R.id.englishButton)
        englishButton.setOnClickListener {
            setLocale("en")
            restartApp()
        }

        val spanishButton: ImageButton = findViewById(R.id.spanishButton)
        spanishButton.setOnClickListener {
            setLocale("es")
            restartApp()
        }

        val changeExerciseDaysButton: Button = findViewById(R.id.changeExerciseDaysButton)
        changeExerciseDaysButton.setOnClickListener {
            val intent = Intent(this, ChangeExerciseDaysActivity::class.java)
            startActivity(intent)
        }

        val switchThemeButton: Switch = findViewById(R.id.switchThemeButton)
        // Check the current theme and set the switch accordingly
        val currentNightMode = resources.configuration.uiMode and Configuration.UI_MODE_NIGHT_MASK
        switchThemeButton.isChecked = currentNightMode == Configuration.UI_MODE_NIGHT_YES

        // Set an OnCheckedChangeListener on the switch
        switchThemeButton.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                // If the switch is checked, set the app theme to night
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
            } else {
                // If the switch is not checked, set the app theme to day
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
            }
        }

        onBackPressedDispatcher.addCallback(this) {
            val intent = Intent(this@SettingsActivity, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }

    private fun setLocale(lang: String) {
        val locale = Locale(lang)
        Locale.setDefault(locale)
        val config = Configuration()
        config.setLocale(locale)
        baseContext.resources.updateConfiguration(config, baseContext.resources.displayMetrics)
        SharedPreferencesFunctions.setSharedPreferencesValueString(this, SharedPreferencesConstants.LANGUAGE, lang)
    }

    private fun restartApp() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish()
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            android.R.id.home -> {
                onBackPressedDispatcher.onBackPressed()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}