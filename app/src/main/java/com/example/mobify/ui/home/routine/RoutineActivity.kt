package com.example.mobify.ui.home.routine

import android.os.Bundle
import android.util.Log
import android.view.animation.AnimationUtils
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.widget.ViewPager2
import com.example.mobify.R
import com.example.mobify.model.Routine
import com.example.mobify.utils.RoutineConstants.findRoutineByName

class RoutineActivity : AppCompatActivity() {

    private lateinit var viewPager: ViewPager2
    private lateinit var routineName: String
    private lateinit var routine: Routine

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_routine)

        viewPager = findViewById(R.id.viewPager)

        // Supongamos que obtienes la rutina de alguna manera, por ejemplo, a través de un Intent
        routineName = intent.getStringExtra("routine") ?: ""
        routine = findRoutineByName(routineName) ?: run {
            Log.e("RoutineActivity", "Routine not found")
            finish()
            return
        }

        // Deactivate swipe
        viewPager.isUserInputEnabled = false

        viewPager.adapter = object : FragmentStateAdapter(this) {
            override fun getItemCount() = routine.exercises.size

            override fun createFragment(position: Int) = ExerciseFragment(viewPager, routineName, routine.exercises[position], position + 1, itemCount)
        }

        viewPager.setPageTransformer { page, position ->
            val slideIn = AnimationUtils.loadAnimation(this, R.anim.slide_in_right)
            val slideOut = AnimationUtils.loadAnimation(this, R.anim.slide_out_left)

            when {
                position < 0 -> page.startAnimation(slideOut)
                position > 0 -> page.startAnimation(slideIn)
                else -> page.clearAnimation()
            }
        }
    }
}