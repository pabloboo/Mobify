package com.example.mobify.ui.onboarding

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter

class OnboardingAdapter(activity: AppCompatActivity) : FragmentStateAdapter(activity) {

    override fun getItemCount(): Int = 2

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> IntroductionFragment()
            1 -> SelectGoalsFragment()
            else -> throw IllegalStateException("Invalid position")
        }
    }
}