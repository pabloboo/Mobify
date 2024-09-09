package com.example.mobify.ui.notificationDays

import android.app.NotificationManager
import android.app.PendingIntent
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log
import androidx.core.app.NotificationCompat
import com.example.mobify.LaunchActivity
import com.example.mobify.R

class NotificationReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        Log.d("Alarm", "BootReceiver onReceive called")
        val notificationManager = context.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager

        val appIntent = Intent(context, LaunchActivity::class.java)
        val appPendingIntent = PendingIntent.getActivity(context, 0, appIntent, PendingIntent.FLAG_UPDATE_CURRENT)

        val notification = NotificationCompat.Builder(context, "daily_reminder_channel")
            .setContentTitle(context.getString(R.string.exercise_reminder_title))
            .setContentText(context.getString(R.string.exercise_reminder_text))
            .setSmallIcon(R.drawable.logo)
            .setContentIntent(appPendingIntent)
            .setAutoCancel(true)
            .build()
        Log.d("Alarm", "Creating notification on channel: daily_reminder_channel")

        notificationManager.notify(0, notification)
    }
}