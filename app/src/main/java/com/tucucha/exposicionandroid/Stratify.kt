package com.tucucha.exposicionandroid

import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import com.tucucha.exposicionandroid.databinding.FramelayoutBinding

class Stratify : AppCompatActivity() {
    private lateinit var binding: FramelayoutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = FramelayoutBinding.inflate(LayoutInflater.from(this))
        setContentView(binding.root)



    }
}