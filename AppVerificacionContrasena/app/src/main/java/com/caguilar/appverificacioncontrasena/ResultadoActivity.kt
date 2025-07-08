package com.caguilar.appverificacioncontrasena

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ResultadoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        val textResultado = findViewById<TextView>(R.id.textResultado)
        val imgCandado = findViewById<ImageView>(R.id.imgCandado)
        val password = intent.getStringExtra("password")

        if (password != null) {
            if (password.length >= 8) {
                textResultado.text = "Contraseña segura"
                imgCandado.setImageResource(R.drawable.candado_seguro)
            } else {
                textResultado.text = "Contraseña débil"
                imgCandado.setImageResource(R.drawable.candado_debil)
            }
        } else {
            textResultado.text = "No se ingresó contraseña"
            imgCandado.setImageResource(R.drawable.candado_debil)
        }
    }
}