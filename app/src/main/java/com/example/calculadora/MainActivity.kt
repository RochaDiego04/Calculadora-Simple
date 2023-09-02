package com.example.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun sumar (view: View){
        val txtNumero1 : TextView = findViewById(R.id.activity_main_numero1)
        val txtNumero2 : TextView = findViewById(R.id.activity_main_numero2)
        val btnSumar : TextView = findViewById(R.id.activity_main_button_sumar)
        val editResultado : TextView = findViewById(R.id.activity_main_resultado)

        btnSumar.setOnClickListener{
            val num1 = txtNumero1.text.toString().toIntOrNull() ?: 0
            val num2 = txtNumero2.text.toString().toIntOrNull() ?: 0
            val resultado = num1 + num2
            editResultado.text = "Resultado: $resultado"

        }
    }

    fun restar (view: View){
        val txtNumero1 : TextView = findViewById(R.id.activity_main_numero1)
        val txtNumero2 : TextView = findViewById(R.id.activity_main_numero2)
        val btnRestar : TextView = findViewById(R.id.activity_main_button_restar)
        val editResultado : TextView = findViewById(R.id.activity_main_resultado)

        btnRestar.setOnClickListener{
            val num1 = txtNumero1.text.toString().toIntOrNull() ?: 0
            val num2 = txtNumero2.text.toString().toIntOrNull() ?: 0
            val resultado = num1 - num2
            editResultado.text = "Resultado: $resultado"

        }
    }

    fun multiplicar (view: View){
        val txtNumero1 : TextView = findViewById(R.id.activity_main_numero1)
        val txtNumero2 : TextView = findViewById(R.id.activity_main_numero2)
        val btnMultiplicar : TextView = findViewById(R.id.activity_main_button_multiplicar)
        val editResultado : TextView = findViewById(R.id.activity_main_resultado)

        btnMultiplicar.setOnClickListener{
            val num1 = txtNumero1.text.toString().toIntOrNull() ?: 0
            val num2 = txtNumero2.text.toString().toIntOrNull() ?: 0
            val resultado = num1 * num2
            editResultado.text = "Resultado: $resultado"

        }
    }

    fun dividir (view: View){
        val txtNumero1 : TextView = findViewById(R.id.activity_main_numero1)
        val txtNumero2 : TextView = findViewById(R.id.activity_main_numero2)
        val btnDividir : TextView = findViewById(R.id.activity_main_button_dividir)
        val editResultado : TextView = findViewById(R.id.activity_main_resultado)

        btnDividir.setOnClickListener{
            val num1 = txtNumero1.text.toString().toIntOrNull() ?: 0
            val num2 = txtNumero2.text.toString().toIntOrNull() ?: 0
            val resultado = num1 / num2
            editResultado.text = "Resultado: $resultado"

        }
    }
}