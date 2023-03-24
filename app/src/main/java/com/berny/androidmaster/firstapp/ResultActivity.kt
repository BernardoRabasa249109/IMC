package com.berny.androidmaster.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.berny.androidmaster.R

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        val tvResult = findViewById<TextView>(R.id.tvResault)
        val name:String = intent.extras?.getString("Bernardo").orEmpty() //reciviendo el valor enviado en la otra pantalla, ojo puede ser nulo o no
        tvResult.text = "Hello, $name"
    }
}

//navegar entre pantallas  intent ::class.java ir de pantalla a pantalla y llevarse cosas consigo como info