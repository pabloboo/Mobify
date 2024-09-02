package com.example.mobify.ui.home.routine

import android.content.Intent
import android.os.Bundle
import android.os.CountDownTimer
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.example.mobify.MainActivity
import com.example.mobify.R
import com.example.mobify.model.Exercise
import com.example.mobify.utils.SharedPreferencesFunctions.getUnlockedDays
import com.example.mobify.utils.SharedPreferencesFunctions.setUnlockedDays
import com.example.mobify.utils.TrainingPlanConstants
import com.example.mobify.utils.TrainingPlanConstants.getTrainingPlanNameFromRoutineName

class ExerciseFragment(private val viewPager: ViewPager2, private val routineName: String, private val exercise: Exercise, private val exerciseNumber: Int, private val totalExerciseNumber: Int) : Fragment() {

    private lateinit var exerciseNumberTextView: TextView
    private lateinit var exerciseNameTextView: TextView
    private lateinit var exerciseDescriptionTextView: TextView
    private lateinit var exerciseImageView: ImageView
    private lateinit var countdownTextView: TextView
    private lateinit var playButton: ImageButton
    private lateinit var nextButton: Button

    private var countDownTimer: CountDownTimer? = null
    private var isBothSidesDone: Boolean = false

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_exercise, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        exerciseNumberTextView = view.findViewById(R.id.exerciseNumberTextView)
        exerciseNameTextView = view.findViewById(R.id.exerciseNameTextView)
        exerciseDescriptionTextView = view.findViewById(R.id.exerciseDescriptionTextView)
        exerciseImageView = view.findViewById(R.id.exerciseImageView)
        countdownTextView = view.findViewById(R.id.countdownTextView)
        playButton = view.findViewById(R.id.playButton)
        nextButton = view.findViewById(R.id.nextButton)

        val exerciseText = getString(R.string.exercise)
        exerciseNumberTextView.text = "$exerciseText $exerciseNumber/$totalExerciseNumber"
        exerciseDescriptionTextView.text = exercise.description
        exerciseNameTextView.text = exercise.name
        exerciseImageView.setImageResource(exercise.photo)
        countdownTextView.visibility = View.VISIBLE

        setNextButton()
    }

    private fun setNextButton() {
        if (exerciseNumber == totalExerciseNumber && (isBothSidesDone || !exercise.unilateral)) {
            nextButton.text = getText(R.string.finish)
            nextButton.setOnClickListener {
                updateUnlockedDays()
                val intent = Intent(requireContext(), MainActivity::class.java)
                startActivity(intent)
            }
        } else {
            if (isBothSidesDone || !exercise.unilateral) {
                nextButton.text = getText(R.string.next)
                nextButton.setOnClickListener {
                    viewPager.currentItem = viewPager.currentItem + 1
                }
            } else {
                nextButton.text = getText(R.string.next_side)
                nextButton.setOnClickListener {
                    startCountDownTimer()
                    nextButton.visibility = View.GONE
                    countdownTextView.visibility = View.VISIBLE
                    isBothSidesDone = true
                }
            }
        }
    }

    fun updateUnlockedDays() {
        val trainingPlanName = getTrainingPlanNameFromRoutineName(routineName)
        val unlockedDays = getUnlockedDays(requireActivity(), trainingPlanName)
        val trainingPlan = TrainingPlanConstants.getTrainingPlans(requireContext()).firstOrNull { it.name == trainingPlanName }
        var day = 0
        for (routine in trainingPlan?.routines ?: emptyList()) {
            if (routine.first.name == routineName) {
                day = routine.second
                break
            }
        }
        Log.d("ExerciseFragment", "Training plan name: $trainingPlanName, routineName: $routineName, Day: $day, Unlocked days: $unlockedDays")
        if (day-1 == unlockedDays) { // Update only if the day is equal than the current unlocked days
            setUnlockedDays(requireActivity(), trainingPlanName, unlockedDays + 1)
            /*if (getUnlockedDays(requireActivity(), trainingPlanName) == trainingPlan?.routines?.size) { // All days completed -> Reset unlocked days or unlock next training plan
                setUnlockedDays(requireActivity(), trainingPlanName, 0)
            }*/
        }
    }

    override fun onResume() {
        super.onResume()

        if (exercise.time == 0) {
            countdownTextView.text = "${exercise.sets} sets x ${exercise.reps} reps"
            countdownTextView.textSize = 24f
            nextButton.visibility = View.VISIBLE
        } else {
            showPlayButton()
        }
    }

    private fun showPlayButton() {
        playButton.visibility = View.VISIBLE
        playButton.setOnClickListener {
            startCountDownTimer()
            playButton.visibility = View.GONE
            countdownTextView.visibility = View.VISIBLE
        }
    }

    private fun startCountDownTimer() {
        countDownTimer = object : CountDownTimer((exercise.time * 1000).toLong(), 1000) {
            override fun onTick(millisUntilFinished: Long) {
                countdownTextView.text = (millisUntilFinished / 1000).toString()
            }

            override fun onFinish() {
                countDownTimer?.cancel()
                countdownTextView.visibility = View.GONE
                nextButton.visibility = View.VISIBLE
                setNextButton()
            }
        }.start()
    }

    override fun onPause() {
        super.onPause()
        if (exercise.time != 0) {
            countDownTimer?.cancel()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        if (exercise.time != 0) {
            countDownTimer?.cancel()
        }
    }
}