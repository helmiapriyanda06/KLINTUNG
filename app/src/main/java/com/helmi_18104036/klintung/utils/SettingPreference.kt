package com.helmi_18104036.klintung.utils

import android.content.Context

internal class SettingPreference(context: Context) {
    companion object{
        private const val PREFS_NAME = "setting_pref"
        private const val THEME = "theme"
    }
    private val preference = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)

    fun setSetting(value:Boolean){
        val editor = preference.edit()
        editor.putBoolean(THEME,value)
        editor.apply()
    }

    fun getSetting():Boolean{
        val isDarkTheme:Boolean = preference.getBoolean(THEME,false)
        return isDarkTheme
    }
}