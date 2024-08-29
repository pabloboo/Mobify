package com.example.mobify.ui.quickMobilityTest

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.MenuItem
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ImageView
import android.widget.Spinner
import android.widget.TextView
import androidx.appcompat.widget.Toolbar
import com.example.mobify.R
import com.example.mobify.model.QuickMobilityTestExercise
import com.example.mobify.model.QuickMobilityTestResponse
import com.example.mobify.utils.QuickMobilityTestExerciseConstants
import com.example.mobify.utils.TrainingPlanConstants

class MobilityCheckScreenActivity : AppCompatActivity() {

    private var currentExerciseIndex = 0
    private lateinit var quickMobilityTestExercises: List<QuickMobilityTestExercise>
    private val quickMobilityTestResponse = QuickMobilityTestResponse(0, 0, 0, 0)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mobility_check_screen)

        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)
        val actionBar = supportActionBar
        actionBar?.setDisplayHomeAsUpEnabled(true)

        quickMobilityTestExercises = QuickMobilityTestExerciseConstants.getQuickMobilityTestExercises(this)
        updateExercise()

        val difficultySpinner = findViewById<Spinner>(R.id.difficultySpinner)
        difficultySpinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View, position: Int, id: Long) {
                when (currentExerciseIndex) {
                    0 -> quickMobilityTestResponse.hipMobilityResponse = position
                    1 -> quickMobilityTestResponse.hamstringFlexibilityResponse = position
                    2 -> quickMobilityTestResponse.shoulderMobilityResponse = position
                    3 -> quickMobilityTestResponse.postureMobilityResponse = position
                }
            }

            override fun onNothingSelected(parent: AdapterView<*>) {}
        }

        val nextButton = findViewById<Button>(R.id.nextButton)
        nextButton.setOnClickListener {
            currentExerciseIndex++
            if (currentExerciseIndex < quickMobilityTestExercises.size) {
                updateExercise()
            } else {
                val intent = Intent(this, ResultsScreenActivity::class.java)
                intent.putExtra("results", generateQuickMobilityTestResults(this))
                startActivity(intent)
                finish()
            }
        }
    }

    private fun updateExercise() {
        val exercise = quickMobilityTestExercises[currentExerciseIndex]
        findViewById<ImageView>(R.id.exerciseImage).setImageResource(exercise.photo)
        findViewById<TextView>(R.id.exerciseInstructions).text = exercise.description

        // Update the Spinner options
        val difficultySpinner = findViewById<Spinner>(R.id.difficultySpinner)
        val adapter = ArrayAdapter(this, R.layout.spinner_item, exercise.selectionOptions)
        difficultySpinner.adapter = adapter
    }

    private fun generateQuickMobilityTestResults(context: Context): String {
        val scores = mutableMapOf(
            "Hip mobility" to quickMobilityTestResponse.hipMobilityResponse,
            "Hamstring flexibility" to quickMobilityTestResponse.hamstringFlexibilityResponse,
            "Shoulder mobility" to quickMobilityTestResponse.shoulderMobilityResponse,
            "Posture mobility" to quickMobilityTestResponse.postureMobilityResponse
        )

        val frequencyMap = scores.values.groupingBy { it }.eachCount()
        if (frequencyMap.any() { it.value >= 3}) {
            return context.getString(R.string.quick_mobility_test_no_recommendation)
        }

        // Take the two highest scores of the map
        val highestScore = scores.maxByOrNull { it.value }
        scores.remove(highestScore?.key)
        val secondHighestScore = scores.maxByOrNull { it.value }

        val responseText = context.getString(R.string.quick_mobility_test_results)
        val andText = context.getString(R.string.and)
        val highestScoreKey = TrainingPlanConstants.getTrainingPlanName(context, highestScore?.key!!)
        val secondHighestScoreKey = TrainingPlanConstants.getTrainingPlanName(context, secondHighestScore?.key!!)
        return "$responseText $highestScoreKey $andText $secondHighestScoreKey."
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