package com.example.mobify.ui.notificationDays

import android.app.NotificationManager
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log
import androidx.core.app.NotificationCompat
import com.example.mobify.R

class NotificationReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        Log.d("Alarm", "BootReceiver onReceive called")
        val notificationManager = context.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager

        val notification = NotificationCompat.Builder(context, "exercise_channel")
            .setContentTitle(context.getString(R.string.exercise_reminder_title))
            .setContentText(context.getString(R.string.exercise_reminder_text))
            .setSmallIcon(R.drawable.logo)
            .build()
        Log.d("Alarm", "Creating notification on channel: exercise_channel")

        notificationManager.notify(0, notification)
    }
}