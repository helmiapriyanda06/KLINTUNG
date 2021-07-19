package com.helmi_18104036.klintung.data

import com.helmi_18104036.klintung.model.DataModel

object DataMerger {
    fun getData() : ArrayList<DataModel> {
        val listData = ArrayList<DataModel>()
        listData.addAll(DataKuliner.listData)
        listData.addAll(DataWisata.listData)
        listData.addAll(DataPenginapan.listData)
        return listData
    }
}