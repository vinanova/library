package com.vino.preference.model

import android.support.annotation.WorkerThread
import com.vino.preference.AGDPreferenceManager
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

public class PrefString(private val name: String, private val defaultValue: String) : ReadWriteProperty<Any, String> {
    @WorkerThread
    override fun getValue(thisRef: Any, property: KProperty<*>): String {
        return AGDPreferenceManager.getInstance().sADGPreferences.getString(name, defaultValue)!!
    }

    override fun setValue(thisRef: Any, property: KProperty<*>, value: String) {
        AGDPreferenceManager.getInstance().sADGPreferences.edit().putString(name, value).apply()
    }

}