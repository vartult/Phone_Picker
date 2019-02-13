package com.cellfishpool.custompicker

import android.telecom.Call
import timber.log.Timber

fun Int.asString(): String = when (this) {
    Call.STATE_NEW -> "NEW"
    Call.STATE_RINGING -> "RINGING"
    Call.STATE_DIALING -> "DIALING"
    Call.STATE_ACTIVE -> "ACTIVE"
    Call.STATE_HOLDING -> "HOLDING"
    Call.STATE_DISCONNECTED -> "DISCONNECTED"
    Call.STATE_CONNECTING -> "CONNECTING"
    Call.STATE_DISCONNECTING -> "DISCONNECTING"
    else -> {
        Timber.w("Unknown state ${this}")
        "UNKNOWN"
    }
}