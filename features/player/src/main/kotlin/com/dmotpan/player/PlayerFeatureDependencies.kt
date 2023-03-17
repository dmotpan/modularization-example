package com.dmotpan.player

import android.content.Context
import com.dmotpan.subscription_api.SubscriptionFeatureApi

interface PlayerFeatureDependencies {
    val context: Context
    val subscriptionFeatureApi: SubscriptionFeatureApi
}