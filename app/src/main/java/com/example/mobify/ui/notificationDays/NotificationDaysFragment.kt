package com.example.mobify.ui.notificationDays

import android.app.AlarmManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.CheckBox
import androidx.core.app.NotificationManagerCompat
import androidx.viewpager2.widget.ViewPager2
import com.example.mobify.MainActivity
import com.example.mobify.R
import com.example.mobify.utils.SharedPreferencesConstants
import com.example.mobify.utils.SharedPreferencesFunctions
import java.util.Calendar


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
            "Sunday" to checkBoxSunday,
            "Monday" to checkBoxMonday,
            "Tuesday" to checkBoxTuesday,
            "Wednesday" to checkBoxWednesday,
            "Thursday" to checkBoxThursday,
            "Friday" to checkBoxFriday,
            "Saturday" to checkBoxSaturday
        )

        for ((day, checkBox) in daysOfWeek) {
            checkBox.isChecked = SharedPreferencesFunctions.getSharedPreferencesValueBoolean(requireActivity(), day)

            checkBox.setOnCheckedChangeListener { _, isChecked ->
                SharedPreferencesFunctions.setSharedPreferencesValueBoolean(requireActivity(), day, isChecked)
                val i = daysOfWeek.keys.indexOf(day)

                // If checkbox is checked, set the alarm
                if (isChecked) {
                    val calendar = Calendar.getInstance()
                    calendar.set(Calendar.HOUR_OF_DAY, 9)
                    calendar.set(Calendar.MINUTE, 0)
                    calendar.set(Calendar.DAY_OF_WEEK, i + 1)

                    // Check if the current time is after 9 a.m. of the day the alarm is being set for -> If it is, add 7 days to the alarm time
                    if (Calendar.getInstance().after(calendar)) {
                        calendar.add(Calendar.DAY_OF_YEAR, 7)
                    }
                    Log.d("Alarm", "Alarma $i configurada para: ${calendar.time}")

                    val alarmManager = requireActivity().getSystemService(Context.ALARM_SERVICE) as AlarmManager
                    val intent = Intent(requireActivity(), NotificationReceiver::class.java)
                    val pendingIntent = PendingIntent.getBroadcast(requireActivity(), i, intent, PendingIntent.FLAG_IMMUTABLE)

                    alarmManager.setRepeating(
                        AlarmManager.RTC_WAKEUP,
                        calendar.timeInMillis,
                        AlarmManager.INTERVAL_DAY * 7,
                        pendingIntent
                    )
                } else {
                    // If checkbox is not checked, cancel the alarm
                    val intent = Intent(requireActivity(), NotificationReceiver::class.java)
                    val pendingIntent = PendingIntent.getBroadcast(requireActivity(), i, intent, PendingIntent.FLAG_IMMUTABLE)
                    val alarmManager = requireActivity().getSystemService(Context.ALARM_SERVICE) as AlarmManager
                    alarmManager.cancel(pendingIntent)
                }
            }
        }

        val nextButton: Button = view.findViewById(R.id.button_next)
        val backButton: Button = view.findViewById(R.id.button_back)
        if (isOnboadingCompleted) {
            nextButton.text = getText(R.string.save)
            nextButton.setOnClickListener {
                // If the user doesn't have notifications enabled, show a dialog to enable them
                val notificationManager = context?.let { NotificationManagerCompat.from(it) }
                if (notificationManager?.areNotificationsEnabled() == false) {
                    NotificationFunctions.showNotificationPermissionDialog(context)
                } else {
                    val intent = Intent(activity, MainActivity::class.java)
                    startActivity(intent)
                }
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