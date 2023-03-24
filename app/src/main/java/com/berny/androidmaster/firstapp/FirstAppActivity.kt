package com.berny.androidmaster.firstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText
import com.berny.androidmaster.R

class FirstAppActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_app)
        val btnStart = findViewById<AppCompatButton>(R.id.btnStart)
        val etName = findViewById<AppCompatEditText>(R.id.etName)
        btnStart.setOnClickListener {
            val name = etName.text.toString()

            if (name.isNotEmpty()) {
                //Log.i("Bernardo", "Boton Pulsado $name")
                val intent = Intent(this, ResultActivity::class.java)
                intent.putExtra("Bernardo", name) //mandar valores
                //navegar de esta pantalla a la otra pantalla
                startActivity(intent)
            }

        }

    }
}

//Se llama a esta pantalla al iniciar la app es una funcion
//unir vistas con activitis con ids

//control + alt + l