package com.berny.androidmaster.imccalculator

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.core.content.ContextCompat
import com.berny.androidmaster.R
import com.berny.androidmaster.imccalculator.ImcCalculatorActivity.Companion.IMC_KEY

//intent para recivir un valor

class ResultIMCActivity : AppCompatActivity() {

    private lateinit var tvResult:TextView
    private lateinit var tvIMC:TextView
    private lateinit var tvDescription:TextView
    private lateinit var btnRecalculate: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result_imcactivity)
        val result:Double = intent.extras?.getDouble(IMC_KEY) ?: -1.0
        initComponents()
        initUI(result)
        initListeners()
    }

    private fun initListeners() { //navegar  entre pantallas, funcion para ir hacia atras.
        btnRecalculate.setOnClickListener { onBackPressed() }
    }

    private fun initUI(result: Double) {
        tvIMC.text = result.toString()
        when (result){
            in 0.0..18.50 ->{ //bajo peso
                tvResult.text = getString(R.string.title_peso_bajo)
                tvResult.setTextColor(ContextCompat.getColor(this, R.color.peso_bajo)) //Pintar un texto de colores
                tvDescription.text = getString((R.string.description_peso_bajo))
            }

            in 18.51..24.99 ->{ //peso normal
                tvResult.text = getString(R.string.title_peso_normal)
                tvResult.setTextColor(ContextCompat.getColor(this, R.color.peso_normal))
                tvDescription.text = getString(R.string.description_peso_normal)
            }
            in 25.00..29.99 ->{ //sobrepeso
                tvResult.text = getString(R.string.title_peso_sobrepeso)
                tvResult.setTextColor(ContextCompat.getColor(this, R.color.peso_sobrepeso))
                tvDescription.text = getString(R.string.description_sobrepeso)
            }
            in 30.00..99.00 ->{ //obesidad
                tvResult.text = getString(R.string.title_peso_obesidad)
                tvResult.setTextColor(ContextCompat.getColor(this, R.color.peso_obesidad))
                tvDescription.text = getString(R.string.description_obesidad)
            }

            else ->{
            tvResult.text = getString(R.string.error) //Acceder a un texto desde el activity es diferente a como se hace en el xml getString(R.string.#)
            tvIMC.text = getString(R.string.error)
            tvResult.setTextColor(ContextCompat.getColor(this, R.color.peso_obesidad))
            tvDescription.text = getString(R.string.error)
            }
        }
    }

    private fun initComponents() {
        tvResult = findViewById(R.id.tvResult)
        tvIMC = findViewById(R.id.tvIMC)
        tvDescription = findViewById(R.id.tvDescription)
        btnRecalculate = findViewById(R.id.btnRecalculate)
    }
}