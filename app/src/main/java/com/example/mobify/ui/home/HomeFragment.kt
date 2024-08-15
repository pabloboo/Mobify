package com.example.mobify.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.mobify.databinding.FragmentHomeBinding
import com.example.mobify.utils.SharedPreferencesConstants
import com.example.mobify.utils.SharedPreferencesFunctions

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val homeViewModel =
            ViewModelProvider(this)[HomeViewModel::class.java]

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        var listOfTrainingPlans = mutableListOf<String>()
        if (SharedPreferencesFunctions.getSharedPreferencesValueBoolean(requireActivity(), SharedPreferencesConstants.HIP_MOBILITY_TRAINING_PLAN)) {
            listOfTrainingPlans.add("Hip mobility")
        }
        if (SharedPreferencesFunctions.getSharedPreferencesValueBoolean(requireActivity(), SharedPreferencesConstants.HAMSTRING_FLEXIBILITY_TRAINING_PLAN)) {
            listOfTrainingPlans.add("Hamstring flexibility")
        }
        if (SharedPreferencesFunctions.getSharedPreferencesValueBoolean(requireActivity(), SharedPreferencesConstants.SHOULDER_MOBILITY_TRAINING_PLAN)) {
            listOfTrainingPlans.add("Shoulder mobility")
        }
        if (SharedPreferencesFunctions.getSharedPreferencesValueBoolean(requireActivity(), SharedPreferencesConstants.POSTURE_MOBILITY_TRAINING_PLAN)) {
            listOfTrainingPlans.add("Posture mobility")
        }

        val textView: TextView = binding.textHome
        textView.text = "Training plans: " + listOfTrainingPlans.joinToString(", ")
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}