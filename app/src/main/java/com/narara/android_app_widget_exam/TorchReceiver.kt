package com.narara.android_app_widget_exam

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class TorchReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        context.toast("손전등 켜짐")
    }
}
