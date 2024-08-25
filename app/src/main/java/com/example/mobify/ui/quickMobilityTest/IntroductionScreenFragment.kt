package com.example.mobify.ui.quickMobilityTest

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.example.mobify.R

class IntroductionScreenFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_introduction_screen, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val startButton = view.findViewById<Button>(R.id.startBtn)
        startButton.setOnClickListener {
            val intent = Intent(requireContext(), MobilityCheckScreenActivity::class.java)
            startActivity(intent)
        }
    }

}