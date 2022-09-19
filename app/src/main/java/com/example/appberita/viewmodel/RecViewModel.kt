package com.example.appberita.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.appberita.model.ModelBerita

class RecViewModel: ViewModel() {

    val listBerita : MutableLiveData<MutableList<ModelBerita>> = MutableLiveData()

    private val berita = "Contrary to popular belief, Lorem Ipsum is not simply random text. It has roots in a piece of classical Latin literature from 45 BC, making it over 2000 years old. Richard McClintock, a Latin professor at Hampden-Sydney College in Virginia, looked up one of the more obscure Latin words, consectetur"
}