package com.example.mobify.ui.notificationDays

import android.app.AlertDialog
import android.content.Context
import android.content.Intent
import android.provider.Settings
import com.example.mobify.R

object NotificationFunctions {

    fun showNotificationPermissionDialog(context: Context?) {
        AlertDialog.Builder(context)
            .setTitle(context?.getString(R.string.notification_permission_title))
            .setMessage(context?.getString(R.string.notification_permission_message))
            .setPositiveButton(context?.getString(R.string.allow)) { _, _ ->
                requestNotificationPermission(context)
            }
            .setNegativeButton(context?.getString(R.string.cancel), null)
            .show()
    }

    private fun requestNotificationPermission(context: Context?) {
        val enableNotificationIntent = Intent(Settings.ACTION_APP_NOTIFICATION_SETTINGS).apply {
            putExtra(Settings.EXTRA_APP_PACKAGE, context?.packageName)
        }
        context?.startActivity(enableNotificationIntent)
    }
}