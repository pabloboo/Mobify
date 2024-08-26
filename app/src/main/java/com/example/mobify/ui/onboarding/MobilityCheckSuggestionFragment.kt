package com.example.mobify.ui.onboarding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.viewpager2.widget.ViewPager2
import com.example.mobify.R

class MobilityCheckSuggestionFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_mobility_check_suggestion, container, false)

        val chooseGoalsBtn = view.findViewById<Button>(R.id.chooseGoalsBtn)
        val quickMobilityCheckBtn = view.findViewById<Button>(R.id.quickMobilityCheckBtn)

        chooseGoalsBtn.setOnClickListener {
            val viewPager = activity?.findViewById<ViewPager2>(R.id.viewPager)
            viewPager?.currentItem = 3
        }

        quickMobilityCheckBtn.setOnClickListener {
            val viewPager = activity?.findViewById<ViewPager2>(R.id.viewPager)
            viewPager?.currentItem = 2
        }

        return view
    }

}