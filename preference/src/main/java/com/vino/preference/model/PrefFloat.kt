package com.vino.preference.model

import android.support.annotation.WorkerThread
import com.vino.preference.AGDPreferenceManager
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

public class PrefFloat(private val name: String, private val defaultValue: Float) : ReadWriteProperty<Any, Float> {
    @WorkerThread
    override fun getValue(thisRef: Any, property: KProperty<*>): Float {
        return AGDPreferenceManager.getInstance().sADGPreferences.getFloat(name, defaultValue)
    }

    override fun setValue(thisRef: Any, property: KProperty<*>, value: Float) {
        AGDPreferenceManager.getInstance().sADGPreferences.edit().putFloat(name, value).apply()
    }

}