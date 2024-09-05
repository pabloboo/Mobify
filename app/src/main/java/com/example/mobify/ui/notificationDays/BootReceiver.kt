package com.example.mobify.ui.notificationDays

import android.app.AlarmManager
import android.app.PendingIntent
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log
import com.example.mobify.utils.SharedPreferencesFunctions
import java.util.Calendar

class BootReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        if (intent.action == "android.intent.action.BOOT_COMPLETED") {

            val daysOfWeek = arrayOf("Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday")

            val calendar = Calendar.getInstance()
            calendar.set(Calendar.HOUR_OF_DAY, 9)
            calendar.set(Calendar.MINUTE, 0)

            for (i in daysOfWeek.indices) {
                if (SharedPreferencesFunctions.getSharedPreferencesValueBoolean(context,daysOfWeek[i])) {
                    calendar.set(Calendar.DAY_OF_WEEK, i + 1)
                    Log.d("Alarm", "Alarm set for: ${calendar.time}")

                    // Check if the current time is after 9 a.m. of the day the alarm is being set for
                    if (Calendar.getInstance().after(calendar)) {
                        // If it is, add 7 days to the alarm time
                        calendar.add(Calendar.DAY_OF_YEAR, 7)
                    }

                    val alarmManager = context.getSystemService(Context.ALARM_SERVICE) as AlarmManager
                    val intent = Intent(context, NotificationReceiver::class.java)
                    val pendingIntent = PendingIntent.getBroadcast(context, i, intent, PendingIntent.FLAG_IMMUTABLE)
                    Log.d("Alarm", "PendingIntent created with request code: $i")

                    alarmManager.setRepeating(
                        AlarmManager.RTC_WAKEUP,
                        calendar.timeInMillis,
                        AlarmManager.INTERVAL_DAY * 7,
                        pendingIntent
                    )
                }
            }
        }
    }
}