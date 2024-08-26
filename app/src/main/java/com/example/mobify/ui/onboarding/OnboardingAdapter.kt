package com.example.mobify.ui.onboarding

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.mobify.ui.quickMobilityTest.IntroductionScreenFragment

class OnboardingAdapter(activity: AppCompatActivity) : FragmentStateAdapter(activity) {

    override fun getItemCount(): Int = 4

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> IntroductionFragment()
            1 -> MobilityCheckSuggestionFragment()
            2 -> IntroductionScreenFragment()
            3 -> SelectGoalsFragment()
            else -> throw IllegalStateException("Invalid position")
        }
    }
}