package com.tucucha.exposicionandroid

import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import com.tucucha.exposicionandroid.databinding.RelativelayoutBinding

class Stratify : AppCompatActivity() {
    private lateinit var binding: RelativelayoutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = RelativelayoutBinding.inflate(LayoutInflater.from(this))
        setContentView(binding.root)



    }
}