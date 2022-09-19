package com.example.appberita.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.appberita.R
import com.example.appberita.model.ListImageBerita
import com.example.appberita.model.ModelBerita

class RecViewModel: ViewModel() {

    val listBerita : MutableLiveData<MutableList<ModelBerita>> = MutableLiveData()

    private val berita = "Contrary to popular belief, Lorem Ipsum is not simply random text. It has roots in a piece of classical Latin literature from 45 BC, making it over 2000 years old. Richard McClintock, a Latin professor at Hampden-Sydney College in Virginia, looked up one of the more obscure Latin words, consectetur"

    private val berita2 = "Contrary to popular belief, Lorem Ipsum is not simply random text. It has roots in a piece of classical Latin literature from 45 BC, making it over 2000 years old. Richard McClintock, a Latin professor at Hampden-Sydney College in Virginia, looked up one of the more obscure Latin words, consectetur"

    private val berita3 = "Contrary to popular belief, Lorem Ipsum is not simply random text. It has roots in a piece of classical Latin literature from 45 BC, making it over 2000 years old. Richard McClintock, a Latin professor at Hampden-Sydney College in Virginia, looked up one of the more obscure Latin words, consectetur"


    // make list data from model ModelBerita.kt
    private val listDataBerita = mutableListOf(
        ModelBerita("berita 1", berita,"isul", "15/09/01", mutableListOf(ListImageBerita(R.drawable.image_berita))),
        ModelBerita("berita 2", berita2,"isul", "15/09/01", mutableListOf(ListImageBerita(R.drawable.image_berita))),
        ModelBerita("berita 3", berita3,"isul", "15/09/01", mutableListOf(ListImageBerita(R.drawable.image_berita))),
        ModelBerita("berita 4", berita,"isul", "15/09/01", mutableListOf(ListImageBerita(R.drawable.image_berita))),
        ModelBerita("berita 5", berita2,"isul", "15/09/01", mutableListOf(ListImageBerita(R.drawable.image_berita))),
        ModelBerita("berita 6", berita3,"isul", "15/09/01", mutableListOf(ListImageBerita(R.drawable.image_berita))),
        ModelBerita("berita 7", berita,"isul", "15/09/01", mutableListOf(ListImageBerita(R.drawable.image_berita))),
        ModelBerita("berita 8", berita2,"isul", "15/09/01", mutableListOf(ListImageBerita(R.drawable.image_berita))),
    )

    // make function for get data from array listData to variabel live data listBerita
    fun getDataBerita(){
        listBerita.value = listDataBerita
    }
}