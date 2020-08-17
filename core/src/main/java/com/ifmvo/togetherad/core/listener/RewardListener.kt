package com.ifmvo.togetherad.core.listener

import android.support.annotation.NonNull


/**
 * Created by Matthew Chen on 2020-04-22.
 */
interface RewardListener : BaseListener {

    fun onAdLoaded(@NonNull providerType: String) {}

    fun onAdFailed(@NonNull providerType: String, failedMsg: String?) {}

    fun onAdClicked(@NonNull providerType: String) {}

    fun onAdShow(@NonNull providerType: String) {}

    fun onAdExpose(@NonNull providerType: String) {}

    fun onAdVideoComplete(@NonNull providerType: String) {}

    fun onAdVideoCached(@NonNull providerType: String) {}

    fun onAdRewardVerify(@NonNull providerType: String) {}

    fun onAdClose(@NonNull providerType: String) {}

}