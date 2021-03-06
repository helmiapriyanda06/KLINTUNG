package com.helmi_18104036.klintung

import android.app.Notification.EXTRA_TITLE
import android.content.Intent
import android.content.Intent.EXTRA_TITLE
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.helmi_18104036.klintung.adapter.Horizontal_RecyclerView
import com.helmi_18104036.klintung.fragment.AboutFragment
import com.helmi_18104036.klintung.utils.SettingPreference
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {
    private lateinit var mSettingPreference: SettingPreference
    private var isDarkTheme:Boolean = false

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: Horizontal_RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        recyclerView = findViewById(R.id.recyclerView)
        adapter = Horizontal_RecyclerView(this)

        recyclerView.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        recyclerView.adapter = adapter

        img_home_penginapan.setOnClickListener{
            val move = Intent(this,ListActivity::class.java)
            move.putExtra(ListActivity.EXTRA_TITLE,"Penginapan")
            startActivity(move)
        }

        img_home_kuliner.setOnClickListener{
            val move = Intent(this,ListActivity::class.java)
            move.putExtra(ListActivity.EXTRA_TITLE,"Kuliner")
            startActivity(move)
        }

        img_home_wisata.setOnClickListener{
            val move = Intent(this,ListActivity::class.java)
            move.putExtra(ListActivity.EXTRA_TITLE,"Wisata")
            startActivity(move)
        }

        mSettingPreference = SettingPreference(this)
        isDarkTheme = mSettingPreference.getSetting()
        showPref()

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

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        Log.d("SUPER","Banyumas")
        super.onActivityResult(requestCode, resultCode, data)
        Log.d("SUPER","Purwokerto")
        if (resultCode == AboutFragment.RESULT_CODE){
            Log.d("THEME_DARK_IN_RESULT",isDarkTheme.toString())
            showPref()
        }
    }

}