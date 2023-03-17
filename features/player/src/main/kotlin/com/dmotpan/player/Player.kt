package com.dmotpan.player

import android.app.Activity
import android.content.Context
import android.widget.Toast

internal class Player {
    fun attemptToPlay(context: Context, hasSubscription: Boolean) {
        if (hasSubscription) {
            Toast.makeText(context, "Welcome! You have a subscription", Toast.LENGTH_LONG).show()
        } else {
            Toast.makeText(context, "You need a subscription to watch this.", Toast.LENGTH_LONG).show()
        }
    }
}