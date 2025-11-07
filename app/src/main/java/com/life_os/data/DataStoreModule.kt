package com.life_os.data

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.preferencesDataStore

private val Context.lifeOsDataStore: DataStore<Preferences> by preferencesDataStore(name = "life_os_preferences")

fun getDataStore(context: Context): DataStore<Preferences> = context.lifeOsDataStore
