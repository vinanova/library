package com.vino.preference.model

import android.support.annotation.WorkerThread
import com.vino.preference.VPM
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

public class PrefLong(private val name: String, private val defaultValue: Long) : ReadWriteProperty<Any, Long> {
    @WorkerThread
    override fun getValue(thisRef: Any, property: KProperty<*>): Long {
        return VPM.getInstance().sADGPreferences.getLong(name, defaultValue)
    }
    override fun setValue(thisRef: Any, property: KProperty<*>, value: Long) {
        VPM.getInstance().sADGPreferences.edit().putLong(name, value).apply()
    }
}