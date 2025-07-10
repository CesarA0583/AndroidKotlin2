package com.caguilar.appimc

import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var preferences: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        preferences = getSharedPreferences("DatosIMC", MODE_PRIVATE)

        val etNombre = findViewById<EditText>(R.id.etNombre)
        val etPeso = findViewById<EditText>(R.id.etPeso)
        val etAltura = findViewById<EditText>(R.id.etAltura)
        val btnCalcular = findViewById<Button>(R.id.btnCalcular)

        btnCalcular.setOnClickListener {
            val nombre = etNombre.text.toString()
            val pesoLb = etPeso.text.toString().toDoubleOrNull()
            val alturaM = etAltura.text.toString().toDoubleOrNull()

            if (nombre.isNotEmpty() && pesoLb != null && alturaM != null && alturaM > 0) {
                val pesoKg = pesoLb * 0.453592
                val imc = pesoKg / (alturaM * alturaM)

                preferences.edit().apply {
                    putString("nombre", nombre)
                    putFloat("imc", imc.toFloat())
                    apply()
                }

                val intent = Intent(this, ResultActivity::class.java)
                startActivity(intent)
            }
        }
    }
}