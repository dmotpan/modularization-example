package com.dmotpan.modularizationexample

import android.os.Bundle
import androidx.fragment.app.FragmentActivity
import com.dmotpan.player.PlayerFeatureImpl
import com.dmotpan.subscription.SubscriptionFeatureImpl
import com.dmotpan.subscription_api.SubscriptionFeatureApi

class MainActivity : FragmentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val subscriptionFeatureApi: SubscriptionFeatureApi = SubscriptionFeatureImpl()
        val playerFeature = PlayerFeatureImpl(this, subscriptionFeatureApi)

        playerFeature.attemptToPlay()
    }
}