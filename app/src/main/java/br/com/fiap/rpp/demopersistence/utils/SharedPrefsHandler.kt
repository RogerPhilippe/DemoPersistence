package br.com.fiap.rpp.demopersistence.utils

import android.content.Context

class SharedPrefsHandler(context: Context) {

    private val sharedPrefs = context.getSharedPreferences("DEMO_PERSIST_PREFS", Context.MODE_PRIVATE)

    fun save(key: String, value: String) {

        val editor = sharedPrefs.edit()
        editor.putString(key, value)
        editor.apply()
    }

    fun load(key: String) = sharedPrefs.getString(key, null)

    fun clean() = sharedPrefs.edit().clear().apply()

    fun delete(key: String) {

        val editor = sharedPrefs.edit()
        editor.remove(key)
        editor.apply()
    }

}