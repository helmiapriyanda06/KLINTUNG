package com.helmi_18104036.klintung

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import com.helmi_18104036.klintung.fragment.AboutFragment
import com.helmi_18104036.klintung.utils.SettingPreference

class AboutActivity : AppCompatActivity() {
    private lateinit var mSettingPreference: SettingPreference
    private var isDarkTheme:Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        val mFragmentManager = supportFragmentManager
        val mAboutFragment = AboutFragment()
        val fragment = mFragmentManager.findFragmentByTag(AboutFragment::class.java.simpleName)
        if(fragment !is AboutFragment){
            mFragmentManager.beginTransaction()
                .add(R.id.frame_container,mAboutFragment,AboutFragment::class.java.simpleName)
                .commit()
        }
        mSettingPreference = SettingPreference(this)
        isDarkTheme = mSettingPreference.getSetting()
        Log.d("TEST",isDarkTheme.toString())
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        showPref()

    }


    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        Log.d("SUPER","Banyumas")
        super.onActivityResult(requestCode, resultCode, data)
        Log.d("SUPER","Purwokerto")
        if (resultCode == AboutFragment.RESULT_CODE){
            Log.d("THEME_DARK_IN_RESULT",isDarkTheme.toString())
            showPref()
        }
    }
    private fun showPref() {
        if (isDarkTheme){
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
            delegate.applyDayNight()
        }else{
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
            delegate.applyDayNight()
        }
    }
}