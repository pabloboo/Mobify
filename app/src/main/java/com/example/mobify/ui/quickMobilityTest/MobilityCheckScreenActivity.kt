package com.example.mobify.ui.quickMobilityTest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ImageView
import android.widget.Spinner
import android.widget.TextView
import androidx.appcompat.widget.Toolbar
import com.example.mobify.R
import com.example.mobify.model.QuickMobilityTestResponse
import com.example.mobify.utils.QuickMobilityTestExerciseConstants

class MobilityCheckScreenActivity : AppCompatActivity() {

    private var currentExerciseIndex = 0
    private val quickMobilityTestExercises = QuickMobilityTestExerciseConstants.getQuickMobilityTestExercises()
    private val quickMobilityTestResponse = QuickMobilityTestResponse(0, 0, 0, 0)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mobility_check_screen)

        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)

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
                val result = "Hip Mobility: ${quickMobilityTestResponse.hipMobilityResponse}, " +
                        "Hamstring Flexibility: ${quickMobilityTestResponse.hamstringFlexibilityResponse}, " +
                        "Shoulder Mobility: ${quickMobilityTestResponse.shoulderMobilityResponse}, " +
                        "Posture Mobility: ${quickMobilityTestResponse.postureMobilityResponse}"

                Log.d("MobilityCheckScreenActivity", "Results: $result")
                val intent = Intent(this, ResultsScreenActivity::class.java)
                intent.putExtra("results", generateQuickMobilityTestResults())
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

    private fun generateQuickMobilityTestResults(): String {
        val scores = mutableMapOf(
            "Hip mobility" to quickMobilityTestResponse.hipMobilityResponse,
            "Hamstring flexibility" to quickMobilityTestResponse.hamstringFlexibilityResponse,
            "Shoulder mobility" to quickMobilityTestResponse.shoulderMobilityResponse,
            "Posture mobility" to quickMobilityTestResponse.postureMobilityResponse
        )

        val frequencyMap = scores.values.groupingBy { it }.eachCount()
        if (frequencyMap.any() { it.value >= 3}) {
            return "Based on your results, we haven't been able to determine a clear recommendation since you scored the same on three or more exercises, feel free to choose the objective that best suits your preferences."
        }

        // Take the two highest scores of the map
        val highestScore = scores.maxByOrNull { it.value }
        scores.remove(highestScore?.key)
        val secondHighestScore = scores.maxByOrNull { it.value }

        return "Based on your results, we recommend focusing on ${highestScore?.key} and ${secondHighestScore?.key}."
    }
}