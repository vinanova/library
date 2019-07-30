package com.vino.preference

import android.content.Context

class AGDPreferenceManager{
    lateinit var sADGPreferences: ADGPreference
    fun initialize(context: Context) {
        sADGPreferences = ADGPreference(context)
    }

    companion object {
        private var sInstance: AGDPreferenceManager? = null
        fun getInstance(): AGDPreferenceManager {
            if (sInstance == null) {
                sInstance = AGDPreferenceManager()
            }
            return sInstance!!
        }
    }
}