package com.example.mobify.ui.onboarding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.viewpager2.widget.ViewPager2
import com.example.mobify.R

class IntroductionFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_introduction, container, false)

        val buttonNext = view.findViewById<Button>(R.id.button_next)
        buttonNext.setOnClickListener {
            // Get a reference to the ViewPager2 in the activity
            val viewPager = activity?.findViewById<ViewPager2>(R.id.viewPager)
            // Go to the next page
            viewPager?.currentItem = 1
        }

        return view


    }

}