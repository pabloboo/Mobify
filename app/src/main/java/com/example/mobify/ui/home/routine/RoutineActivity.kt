package com.example.mobify.ui.home.routine

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.MenuItem
import android.view.animation.AnimationUtils
import androidx.activity.addCallback
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.core.content.ContextCompat
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
        val upArrow = ContextCompat.getDrawable(this, R.drawable.baseline_arrow_back_24)
        supportActionBar?.setHomeAsUpIndicator(upArrow)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

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

        onBackPressedDispatcher.addCallback(this) {
            val intent = Intent(this@RoutineActivity, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
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