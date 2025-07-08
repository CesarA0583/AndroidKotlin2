package com.caguilar.appclasificacionedad

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ResultadoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        val edad = intent.getIntExtra("edad", 0)
        val txtResultado = findViewById<TextView>(R.id.txtResultado)
        val imgResultado = findViewById<ImageView>(R.id.imgResultado)

        when {
            edad < 13 -> {
                txtResultado.text = "Eres un niño."
                imgResultado.setImageResource(R.drawable.nino)
            }
            edad in 13..17 -> {
                txtResultado.text = "Eres un adolescente."
                imgResultado.setImageResource(R.drawable.adolecente)
            }
            else -> {
                txtResultado.text = "Eres un adulto."
                imgResultado.setImageResource(R.drawable.adulto)
            }
        }
    }
}
