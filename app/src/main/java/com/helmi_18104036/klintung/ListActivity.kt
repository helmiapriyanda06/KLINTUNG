package com.helmi_18104036.klintung

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatDelegate
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.helmi_18104036.klintung.adapter.ListDataAdapter
import com.helmi_18104036.klintung.data.DataWisata
import com.helmi_18104036.klintung.model.DataModel
import com.helmi_18104036.klintung.utils.SettingPreference

class ListActivity : AppCompatActivity() {
    private lateinit var rvData:RecyclerView
    private var list:ArrayList<DataModel> = arrayListOf()
    private lateinit var mSettingPreference: SettingPreference
    private var isDarkTheme:Boolean = false

    companion object{
        const val EXTRA_TITLE = "extra_title"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)
        val title = intent.getStringExtra(EXTRA_TITLE)
        supportActionBar?.title = title.toString()
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        rvData = findViewById(R.id.rv_list)
        rvData.setHasFixedSize(true)

        mSettingPreference = SettingPreference(this)
        isDarkTheme = mSettingPreference.getSetting()
        showPref()
        showData(title.toString())
        showRecyclerList()
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

    private fun setMode(selected:Int){
        when(selected){
            R.id.action_list->{
                showRecyclerList()
            }
            R.id.action_grid->{
                showGridView()
            }
            R.id.action_card->{
                shoCardView()
            }
            android.R.id.home ->{
                finish()
            }
        }
    }

    private fun showData(title:String){
        when(title){

            "Wisata" ->{
                list.addAll(DataWisata.listData)
            }
        }
    }

    private fun showRecyclerList(){
        rvData.layoutManager = LinearLayoutManager(this)
        val adapter = ListDataAdapter(list,this)
        rvData.adapter = adapter
    }

    private fun showGridView(){

    }

    private fun shoCardView(){

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }
}