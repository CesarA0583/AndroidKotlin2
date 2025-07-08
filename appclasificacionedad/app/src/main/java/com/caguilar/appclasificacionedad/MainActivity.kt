package com.caguilar.appclasificacionedad

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editTextEdad = findViewById<EditText>(R.id.editTextEdad)
        val btnEnviar = findViewById<Button>(R.id.btnEnviar)

        btnEnviar.setOnClickListener {
            val edadStr = editTextEdad.text.toString()
            if (edadStr.isNotEmpty()) {
                val edad = edadStr.toInt()
                val intent = Intent(this, ResultadoActivity::class.java)
                intent.putExtra("edad", edad)
                startActivity(intent)
            } else {
                editTextEdad.error = "Por favor ingresa tu edad"
            }
        }
    }
}
