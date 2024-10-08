package com.example.mobify.ui.home.settings

import android.content.Intent
import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Button
import android.widget.ImageButton
import androidx.activity.addCallback
import androidx.appcompat.app.AppCompatDelegate
import androidx.appcompat.widget.SwitchCompat
import androidx.appcompat.widget.Toolbar
import androidx.core.content.ContextCompat
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
        val upArrow = ContextCompat.getDrawable(this, R.drawable.baseline_arrow_back_24)
        supportActionBar?.setHomeAsUpIndicator(upArrow)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

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

        val switchThemeButton: SwitchCompat = findViewById(R.id.switchThemeButton)
        val currentNightMode = resources.configuration.uiMode and Configuration.UI_MODE_NIGHT_MASK
        switchThemeButton.isChecked = currentNightMode == Configuration.UI_MODE_NIGHT_YES

        if (switchThemeButton.isChecked) {
            switchThemeButton.setThumbResource(R.drawable.ic_moon)
        } else {
            switchThemeButton.setThumbResource(R.drawable.ic_sun)
        }

        switchThemeButton.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                // If the switch is checked, set the app theme to night
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
                switchThemeButton.setThumbResource(R.drawable.ic_moon)
            } else {
                // If the switch is not checked, set the app theme to day
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
                switchThemeButton.setThumbResource(R.drawable.ic_sun)
            }
            recreate()
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