package com.example.mobify.ui.onboarding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ScrollView
import androidx.appcompat.widget.Toolbar
import androidx.viewpager2.widget.ViewPager2
import com.example.mobify.R

class OnboardingActivity : AppCompatActivity() {

    private lateinit var viewPager: ViewPager2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding)

        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)

        viewPager = findViewById(R.id.viewPager)
        viewPager.isUserInputEnabled = false // Disable swipe
        viewPager.adapter = OnboardingAdapter(this)

        val page = intent.getIntExtra("page", 0)
        viewPager.currentItem = page
    }
}