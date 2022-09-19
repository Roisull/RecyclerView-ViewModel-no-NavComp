package com.example.appberita

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.activity.viewModels
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.appberita.databinding.ActivityMainBinding
import com.example.appberita.viewmodel.MainViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var mCounter: Int = 0 // variabel untuk menampung angka

    private val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        withViewModel()

        binding.btnGotoRecyclerView.setOnClickListener {
            startActivity(Intent(this, RecActivity::class.java))
        }
    }

    // function untuk ViewModel
    private fun withViewModel(){
        binding.btnPlus.setOnClickListener {
            wIncrementCount()
        }
        binding.btnMinus.setOnClickListener {
            wDecrementCount()
        }
    }
    private fun wIncrementCount(){
        viewModel.incrementCount()
    }
    private fun wDecrementCount(){
        viewModel.decrementCount()
    }

    // function untuk contoh tanpa ViewModel
    private fun withOutViewModel(){
        binding.btnPlus.setOnClickListener {
            mIncrementCount()
        }
        binding.btnMinus.setOnClickListener {
            mDecrement()
        }
    }

    private fun mIncrementCount(){
        mCounter += 1
        updateUI()
    }
    private fun mDecrement(){
        mCounter.let {
            if (it > 0) mCounter -= 1
        }
        updateUI()
    }
    private fun updateUI(){
        binding.tvResult.text = mCounter.toString()
    }
}