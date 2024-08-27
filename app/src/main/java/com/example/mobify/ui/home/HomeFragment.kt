package com.example.mobify.ui.home

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.mobify.databinding.FragmentHomeBinding
import com.example.mobify.utils.SharedPreferencesConstants
import com.example.mobify.utils.SharedPreferencesFunctions
import com.example.mobify.utils.TrainingPlanConstants
import com.example.mobify.utils.TrainingPlanMap

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

        val recyclerView: RecyclerView = binding.trainingPlanRecyclerView

        val trainingPlans = TrainingPlanConstants.getTrainingPlans(requireContext()).filter { plan ->
            SharedPreferencesFunctions.getSharedPreferencesValueBoolean(requireActivity(), TrainingPlanMap.invertedMapTrainingPlan[plan.name] ?: "")
        }

        Log.d("HomeFragment", "Training plans: ${trainingPlans.size}")

        recyclerView.layoutManager = LinearLayoutManager(context)
        recyclerView.adapter = TrainingPlanAdapter(trainingPlans, requireContext())


        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}