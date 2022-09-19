package com.example.appberita.model

data class ModelBerita(val judulBer: String,
                       val descBer: String,
                       val jurnalisBer: String,
                       val tanggalBer: String,
                       val imageBer: MutableList<listImageBerita>):java.io.Serializable

data class listImageBerita(val image: Int): java.io.Serializable