package com.example.mobify.ui.notificationDays

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.CheckBox
import androidx.viewpager2.widget.ViewPager2
import com.example.mobify.MainActivity
import com.example.mobify.R
import com.example.mobify.utils.SharedPreferencesConstants
import com.example.mobify.utils.SharedPreferencesFunctions


class NotificationDaysFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_notification_days, container, false)

        val checkBoxMonday = view.findViewById<CheckBox>(R.id.checkbox_monday)
        checkBoxMonday.setTextColor(resources.getColor(R.color.primaryTextColor, null))
        val checkBoxTuesday = view.findViewById<CheckBox>(R.id.checkbox_tuesday)
        checkBoxTuesday.setTextColor(resources.getColor(R.color.primaryTextColor, null))
        val checkBoxWednesday = view.findViewById<CheckBox>(R.id.checkbox_wednesday)
        checkBoxWednesday.setTextColor(resources.getColor(R.color.primaryTextColor, null))
        val checkBoxThursday = view.findViewById<CheckBox>(R.id.checkbox_thursday)
        checkBoxThursday.setTextColor(resources.getColor(R.color.primaryTextColor, null))
        val checkBoxFriday = view.findViewById<CheckBox>(R.id.checkbox_friday)
        checkBoxFriday.setTextColor(resources.getColor(R.color.primaryTextColor, null))
        val checkBoxSaturday = view.findViewById<CheckBox>(R.id.checkbox_saturday)
        checkBoxSaturday.setTextColor(resources.getColor(R.color.primaryTextColor, null))
        val checkBoxSunday = view.findViewById<CheckBox>(R.id.checkbox_sunday)
        checkBoxSunday.setTextColor(resources.getColor(R.color.primaryTextColor, null))

        // Check if onboarding is completed (if so, it means that the user is accessing from menu)
        val isOnboadingCompleted = SharedPreferencesFunctions.getSharedPreferencesValueBoolean(requireActivity(), SharedPreferencesConstants.ONBOARDING_COMPLETED)

        val daysOfWeek = mapOf(
            "Monday" to checkBoxMonday,
            "Tuesday" to checkBoxTuesday,
            "Wednesday" to checkBoxWednesday,
            "Thursday" to checkBoxThursday,
            "Friday" to checkBoxFriday,
            "Saturday" to checkBoxSaturday,
            "Sunday" to checkBoxSunday
        )

        for ((day, checkBox) in daysOfWeek) {
            checkBox.isChecked = SharedPreferencesFunctions.getSharedPreferencesValueBoolean(requireActivity(), day)

            checkBox.setOnCheckedChangeListener { _, isChecked ->
                SharedPreferencesFunctions.setSharedPreferencesValueBoolean(requireActivity(), day, isChecked)
            }
        }

        val nextButton: Button = view.findViewById(R.id.button_next)
        val backButton: Button = view.findViewById(R.id.button_back)
        if (isOnboadingCompleted) {
            nextButton.text = getText(R.string.save)
            nextButton.setOnClickListener {
                val intent = Intent(activity, MainActivity::class.java)
                startActivity(intent)
            }
        } else {
            backButton.visibility = View.VISIBLE
            backButton.setOnClickListener {
                val viewPager = activity?.findViewById<ViewPager2>(R.id.viewPager)
                viewPager?.currentItem = 3
            }

            nextButton.text = getText(R.string.finish)
            nextButton.setOnClickListener {
                SharedPreferencesFunctions.setSharedPreferencesValueBoolean(requireActivity(), SharedPreferencesConstants.ONBOARDING_COMPLETED, true)
                val intent = Intent(activity, MainActivity::class.java)
                startActivity(intent)
            }
        }

        return view
    }
}