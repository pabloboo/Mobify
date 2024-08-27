package com.example.mobify.ui.home.routine

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.animation.AnimationUtils
import androidx.activity.addCallback
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.widget.ViewPager2
import com.example.mobify.MainActivity
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

        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)

        viewPager = findViewById(R.id.viewPager)

        // Supongamos que obtienes la rutina de alguna manera, por ejemplo, a través de un Intent
        routineName = intent.getStringExtra("routine") ?: ""
        routine = findRoutineByName(this, routineName) ?: run {
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

        onBackPressedDispatcher.addCallback(this) {
            val intent = Intent(this@RoutineActivity, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}