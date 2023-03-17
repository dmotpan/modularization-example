package com.dmotpan.player

import android.content.Context
import com.dmotpan.subscription_api.SubscriptionFeatureApi

class PlayerFeatureImpl(
    override val context: Context,
    override val subscriptionFeatureApi: SubscriptionFeatureApi
) : PlayerFeatureApi, PlayerFeatureDependencies {
    private val player = Player()

    override fun attemptToPlay() {
        player.attemptToPlay(context, subscriptionFeatureApi.hasSubscription())
    }

}