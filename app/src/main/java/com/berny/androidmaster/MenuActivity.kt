package com.berny.androidmaster

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.berny.androidmaster.firstapp.FirstAppActivity
import com.berny.androidmaster.imccalculator.ImcCalculatorActivity

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_manu)
        val btnSaludApp = findViewById<Button>(R.id.btnSaludApp)
        val btnIMCApp = findViewById<Button>(R.id.btnIMCApp)
        btnSaludApp.setOnClickListener { navigateToSaludApp() } //setOnClickListener es para que cuando pique un boton haga algo o navegue a un lugar
        btnIMCApp.setOnClickListener { navigateToImcApp() }

    }

    private fun navigateToImcApp() {
        val intent = Intent(this, ImcCalculatorActivity::class.java)//funcion para navegar a la nueva pantalla
        startActivity(intent)

    }

    private fun navigateToSaludApp(){ //funcion para navegar a la nueva pantalla
        val intent = Intent(this, FirstAppActivity::class.java)
        startActivity(intent)
    }
}

//Intent Una intent permite iniciar una actividad en otra app mediante la descripción de una acción
// simple que desees realizar (como "ver un mapa" o "tomar una foto") en un objeto Intent