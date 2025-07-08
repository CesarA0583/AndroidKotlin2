package com.caguilar.appverificacioncontrasena

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editTextPassword = findViewById<EditText>(R.id.editTextPassword)
        val btnVerificar = findViewById<Button>(R.id.btnVerificar)

        btnVerificar.setOnClickListener {
            val password = editTextPassword.text.toString()
            val intent = Intent(this, ResultadoActivity::class.java)
            intent.putExtra("password", password)
            startActivity(intent)
        }
    }
}