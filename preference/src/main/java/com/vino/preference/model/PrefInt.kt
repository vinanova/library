package com.vino.preference.model

import android.support.annotation.WorkerThread
import com.vino.preference.AGDPreferenceManager
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

public class PrefInt(private val name: String, private val defaultValue: Int) : ReadWriteProperty<Any, Int> {
    @WorkerThread
    override fun getValue(thisRef: Any, property: KProperty<*>): Int {
        return AGDPreferenceManager.getInstance().sADGPreferences.getInt(name, defaultValue)
    }

    override fun setValue(thisRef: Any, property: KProperty<*>, value: Int) {
        AGDPreferenceManager.getInstance().sADGPreferences.edit().putInt(name, value).apply()
    }

}