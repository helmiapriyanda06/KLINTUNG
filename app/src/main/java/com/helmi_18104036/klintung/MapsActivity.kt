package com.helmi_18104036.klintung

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcelable

import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import com.helmi_18104036.klintung.databinding.ActivityMapsBinding
import com.helmi_18104036.klintung.model.DataModel

class MapsActivity : AppCompatActivity(), OnMapReadyCallback {
    companion object{
        const val EXTRA_DATA = "extra_data"
    }

    val myData by getParcelableExtra<DataModel>(DetailActivity.EXTRA_DATA)
    inline fun <reified T : Parcelable> Activity.getParcelableExtra(key: String) = lazy {
        intent.getParcelableExtra<T>(key)
    }

    private lateinit var mMap: GoogleMap

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_maps)
        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)
        supportActionBar?.title = myData?.title.toString()
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }


    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap
        val lat:Double = myData!!.lat.toDouble()
        val lang:Double =myData!!.lang.toDouble()

        val latLng = LatLng(lat, lang)
        mMap.addMarker(MarkerOptions().position(latLng).title(myData!!.title.toString()))
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(latLng, 16.0F))
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}