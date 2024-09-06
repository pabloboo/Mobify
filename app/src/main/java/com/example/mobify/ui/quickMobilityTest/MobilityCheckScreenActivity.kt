package com.example.mobify.ui.quickMobilityTest

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Button
import android.widget.ImageView
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import androidx.appcompat.widget.Toolbar
import androidx.core.content.ContextCompat
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
        val upArrow = ContextCompat.getDrawable(this, R.drawable.baseline_arrow_back_24)
        supportActionBar?.setHomeAsUpIndicator(upArrow)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        quickMobilityTestExercises = QuickMobilityTestExerciseConstants.getQuickMobilityTestExercises(this)
        updateExercise()

        val difficultyRadioGroup = findViewById<RadioGroup>(R.id.difficultyRadioGroup)
        difficultyRadioGroup.setOnCheckedChangeListener { group, checkedId ->
            // Get the RadioButton using the checkedId
            val radioButton = group.findViewById<RadioButton>(checkedId)

            // Get the index of the selected RadioButton
            val index = group.indexOfChild(radioButton)

            // Use the index in your logic
            when (currentExerciseIndex) {
                0 -> quickMobilityTestResponse.hipMobilityResponse = index
                1 -> quickMobilityTestResponse.hamstringFlexibilityResponse = index
                2 -> quickMobilityTestResponse.shoulderMobilityResponse = index
                3 -> quickMobilityTestResponse.postureMobilityResponse = index
            }
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

        // Update the RadioGroup options
        val difficultyRadioGroup = findViewById<RadioGroup>(R.id.difficultyRadioGroup)
        difficultyRadioGroup.removeAllViews() // Remove all existing RadioButtons

        // Add a RadioButton for each selection option
        for (option in exercise.selectionOptions) {
            val radioButton = RadioButton(this)
            radioButton.text = option
            radioButton.setTextColor(resources.getColor(R.color.primaryTextColor, null))
            radioButton.buttonTintList = resources.getColorStateList(R.color.primaryTextColor, null)
            radioButton.minHeight = dpToPx(48)
            difficultyRadioGroup.addView(radioButton)
        }
    }

    private fun dpToPx(dp: Int): Int {
        val density = resources.displayMetrics.density
        return (dp * density).toInt()
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