package com.vino.preference

import android.content.Context

class VPM{
    lateinit var sADGPreferences: VPreference
    fun initialize(context: Context) {
        sADGPreferences = VPreference(context)
    }

    companion object {
        private var sInstance: VPM? = null
        fun getInstance(): VPM {
            if (sInstance == null) {
                sInstance = VPM()
            }
            return sInstance!!
        }
    }
}