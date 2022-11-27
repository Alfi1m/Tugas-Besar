package com.project.proyek_akhir_mobile_programming.ui.detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.project.proyek_akhir_mobile_programming.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}