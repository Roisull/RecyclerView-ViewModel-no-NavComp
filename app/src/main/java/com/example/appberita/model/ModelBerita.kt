package com.example.appberita.model

data class ModelBerita(val judulBer: String,
                       val descBer: String,
                       val jurnalisBer: String,
                       val tanggalBer: String,
                       val imageBer: MutableList<ListImageBerita>):java.io.Serializable

data class ListImageBerita(val images: Int): java.io.Serializable