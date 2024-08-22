package com.example.mobify.ui.home.routine

import android.content.Intent
import android.os.Bundle
import android.os.CountDownTimer
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.example.mobify.MainActivity
import com.example.mobify.R
import com.example.mobify.model.Exercise

class ExerciseFragment(private val viewPager: ViewPager2, private val exercise: Exercise, private val exerciseNumber: Int, private val totalExerciseNumber: Int) : Fragment() {

    private lateinit var exerciseNumberTextView: TextView
    private lateinit var exerciseImageView: ImageView
    private lateinit var countdownTextView: TextView
    private lateinit var nextButton: Button

    private lateinit var countDownTimer: CountDownTimer

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_exercise, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        exerciseNumberTextView = view.findViewById(R.id.exerciseNumberTextView)
        exerciseImageView = view.findViewById(R.id.exerciseImageView)
        countdownTextView = view.findViewById(R.id.countdownTextView)
        nextButton = view.findViewById(R.id.nextButton)

        exerciseNumberTextView.text = "Exercise $exerciseNumber/$totalExerciseNumber"
        exerciseImageView.setImageResource(exercise.photo)
        countdownTextView.visibility = View.VISIBLE

        if (exerciseNumber == totalExerciseNumber) {
            nextButton.text = "Finish"
            nextButton.setOnClickListener {
                val intent = Intent(requireContext(), MainActivity::class.java)
                startActivity(intent)
            }
        } else {
            nextButton.text = "Next"
            nextButton.setOnClickListener {
                viewPager.currentItem = viewPager.currentItem + 1
            }
        }
    }

    override fun onResume() {
        super.onResume()

        countDownTimer = object : CountDownTimer((exercise.time * 1000).toLong(), 1000) {
            override fun onTick(millisUntilFinished: Long) {
                countdownTextView.text = (millisUntilFinished / 1000).toString()
            }

            override fun onFinish() {
                countDownTimer?.cancel()
                countdownTextView.visibility = View.GONE
                nextButton.visibility = View.VISIBLE
            }
        }.start()
    }

    override fun onPause() {
        super.onPause()
        countDownTimer?.cancel()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        countDownTimer.cancel()
    }
}