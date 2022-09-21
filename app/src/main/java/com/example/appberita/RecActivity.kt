package com.example.appberita

import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.appberita.adapter.BeritaAdapter
import com.example.appberita.databinding.ActivityRecBinding
import com.example.appberita.viewmodel.RecViewModel

class RecActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRecBinding
    private lateinit var beritaViewModel: RecViewModel
    private lateinit var beritaAdapter: BeritaAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRecBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        // set viewModel
        beritaViewModel = ViewModelProvider(this)[RecViewModel::class.java]

        // set recyclerView
        binding.rvContentBerita.apply {
            adapter = beritaAdapter
            layoutManager = if (applicationContext.resources.configuration.orientation == Configuration.ORIENTATION_LANDSCAPE){
                GridLayoutManager(this@RecActivity,2)
            }else{
                LinearLayoutManager(this@RecActivity)
            }
        }

        // get data
        beritaViewModel.getDataBerita()
        beritaViewModel.listBerita.observe(this){
            beritaAdapter.setDataBeritas(it)
        }
    }
}