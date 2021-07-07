package com.helmi_18104036.klintung.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class DataModel(
    var title:String,
    var image:String,
    var description:String,
    var lat:String,
    var lang:String,
): Parcelable