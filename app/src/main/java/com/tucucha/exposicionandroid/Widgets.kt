package com.tucucha.exposicionandroid

import android.os.Bundle
import android.view.LayoutInflater
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import com.tucucha.exposicionandroid.databinding.WidgetsBinding

class Widgets: AppCompatActivity() {
    private lateinit var binding: WidgetsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = WidgetsBinding.inflate(LayoutInflater.from(this))
        setContentView(binding.root)

        val autocompletar = binding.autoCompleteTextView

        val sugerencias = arrayOf("Me quiero suicidad", "Matenme por favor", "Mamaguebo")

        val adaptador = ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line, sugerencias)
        autocompletar.setAdapter(adaptador)



        val opcionesSexo = arrayOf("Masculino", "Femenino", "Helicóptero de guerra industrial táctico", "Otro")
        val adaptadorSex = ArrayAdapter(this, android.R.layout.simple_spinner_item, opcionesSexo)
        adaptador.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        // Configurar el adaptador para el spinner
        val Spiner = binding.spinnerSexo
        Spiner.adapter = adaptadorSex



    }
}