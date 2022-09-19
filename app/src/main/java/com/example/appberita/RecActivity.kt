package com.example.appberita

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.example.appberita.databinding.ActivityRecBinding
import com.example.appberita.viewmodel.RecViewModel

class RecActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRecBinding

    private val viewModel: RecViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRecBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

    }
}