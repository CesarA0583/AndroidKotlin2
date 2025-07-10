package com.caguilar.appimc

import android.content.SharedPreferences
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ResultActivity : AppCompatActivity() {
    private lateinit var preferences: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        preferences = getSharedPreferences("DatosIMC", MODE_PRIVATE)

        val nombre = preferences.getString("nombre", "Usuario")
        val imc = preferences.getFloat("imc", 0f)

        val tvResultado = findViewById<TextView>(R.id.tvResultado)
        val ivImagen = findViewById<ImageView>(R.id.ivImagen)

        tvResultado.text = "Hola $nombre, tu IMC es: %.2f".format(imc)

        when {
            imc < 18.5 -> ivImagen.setImageResource(R.drawable.bajo_peso)
            imc in 18.5..24.9 -> ivImagen.setImageResource(R.drawable.normal)
            imc in 25.0..29.9 -> ivImagen.setImageResource(R.drawable.sobrepeso)
            else -> ivImagen.setImageResource(R.drawable.obesidad)
        }
    }
}
