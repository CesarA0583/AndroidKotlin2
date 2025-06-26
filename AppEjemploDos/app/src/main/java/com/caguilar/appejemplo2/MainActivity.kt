package com.caguilar.appejemplo2

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private var contador = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val txtNumero = findViewById<TextView>(R.id.txtNumero)
        val btnSumar = findViewById<TextView>(R.id.btnSumar)
        val btnMenos = findViewById<Button>(R.id.btnRestar)
        val btnReset = findViewById<Button>(R.id.btnReset)

        btnSumar.setOnClickListener {
            contador++
            txtNumero.text = contador.toString()
        }
        btnMenos.setOnClickListener {
            contador--
            txtNumero.text = contador.toString()
        }
        btnReset.setOnClickListener {
            contador = 0
            txtNumero.text = contador.toString()
        }
    }
}