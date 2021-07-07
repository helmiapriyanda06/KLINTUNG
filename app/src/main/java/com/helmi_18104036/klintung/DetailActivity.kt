package com.helmi_18104036.klintung

import android.app.Activity
import android.content.Intent
import android.nfc.NfcAdapter.EXTRA_DATA
import android.os.Bundle
import android.os.Parcelable
import com.google.android.material.appbar.CollapsingToolbarLayout
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.helmi_18104036.klintung.DetailActivity.Companion.EXTRA_DATA
import com.helmi_18104036.klintung.model.DataModel
import kotlinx.android.synthetic.main.activity_detail.*
import kotlinx.android.synthetic.main.item_list.*

class DetailActivity : AppCompatActivity() {
    companion object{
        const val EXTRA_DATA = "extra_data"
    }
    inline fun<reified T: Parcelable> Activity.getParcelableExtra(key:String) = lazy {
        intent.getParcelableExtra<T>(key)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        setSupportActionBar(findViewById(R.id.toolbar))
//        findViewById<CollapsingToolbarLayout>(R.id.toolbar_layout).title = title

        val myData by getParcelableExtra<DataModel>(DetailActivity.EXTRA_DATA)

        findViewById<CollapsingToolbarLayout>(R.id.toolbar_layout).title = myData?.title.toString()
        supportActionBar?.title = myData?.title.toString()
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        tv_description.text = myData?.description

        Glide.with(this)
            .load(myData?.image)
            .apply(RequestOptions().override(700,700))
            .into(iv_detail_photo)
        fab.setOnClickListener{
            val move = Intent(this,MapsActivity::class.java)
            move.putExtra(MapsActivity.EXTRA_DATA,myData)
            startActivity(move)
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}