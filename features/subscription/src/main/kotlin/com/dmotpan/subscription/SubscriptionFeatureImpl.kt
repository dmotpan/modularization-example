package com.dmotpan.subscription

import com.dmotpan.subscription_api.SubscriptionFeatureApi

class SubscriptionFeatureImpl : SubscriptionFeatureApi {
    private val subscriptionProvider = SubscriptionProvider()

    override fun hasSubscription(): Boolean {
        return subscriptionProvider.hasSubscription()
    }
}