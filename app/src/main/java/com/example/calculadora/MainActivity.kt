package com.example.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun comprobarCampo1(): Boolean {
        val num1: TextView = findViewById(R.id.activity_main_numero1)

        if (num1.text.toString().trim().isEmpty()) {
            num1.error = getString(R.string.activity_main_error)
            return false
        }

        return true
    }

    fun comprobarCampo2(): Boolean {
        val num2: TextView = findViewById(R.id.activity_main_numero2)

        if (num2.text.toString().trim().isEmpty()) {
            num2.error = getString(R.string.activity_main_error)
            return false
        }

        return true
    }

    fun sumar(view: View) {
        val txtNumero1: TextView = findViewById(R.id.activity_main_numero1)
        val txtNumero2: TextView = findViewById(R.id.activity_main_numero2)
        val editResultado: TextView = findViewById(R.id.activity_main_resultado)

        val campo1Valido = comprobarCampo1()
        val campo2Valido = comprobarCampo2()

        if (campo1Valido && campo2Valido) {
            val num1 = txtNumero1.text.toString().toIntOrNull() ?: 0
            val num2 = txtNumero2.text.toString().toIntOrNull() ?: 0
            val resultado = num1 + num2
            editResultado.text = "Resultado: $resultado"
        }
    }

    fun restar (view: View){
        val txtNumero1: TextView = findViewById(R.id.activity_main_numero1)
        val txtNumero2: TextView = findViewById(R.id.activity_main_numero2)
        val editResultado: TextView = findViewById(R.id.activity_main_resultado)

        val campo1Valido = comprobarCampo1()
        val campo2Valido = comprobarCampo2()

        if (campo1Valido && campo2Valido) {
            val num1 = txtNumero1.text.toString().toIntOrNull() ?: 0
            val num2 = txtNumero2.text.toString().toIntOrNull() ?: 0
            val resultado = num1 - num2
            editResultado.text = "Resultado: $resultado"
        }
    }

    fun multiplicar (view: View){
        val txtNumero1: TextView = findViewById(R.id.activity_main_numero1)
        val txtNumero2: TextView = findViewById(R.id.activity_main_numero2)
        val editResultado: TextView = findViewById(R.id.activity_main_resultado)

        val campo1Valido = comprobarCampo1()
        val campo2Valido = comprobarCampo2()

        if (campo1Valido && campo2Valido) {
            val num1 = txtNumero1.text.toString().toIntOrNull() ?: 0
            val num2 = txtNumero2.text.toString().toIntOrNull() ?: 0
            val resultado = num1 * num2
            editResultado.text = "Resultado: $resultado"
        }
    }

    fun dividir (view: View){
        val txtNumero1: TextView = findViewById(R.id.activity_main_numero1)
        val txtNumero2: TextView = findViewById(R.id.activity_main_numero2)
        val editResultado: TextView = findViewById(R.id.activity_main_resultado)

        val campo1Valido = comprobarCampo1()
        val campo2Valido = comprobarCampo2()

        if (campo1Valido && campo2Valido) {
            val num1 = txtNumero1.text.toString().toIntOrNull() ?: 0
            val num2 = txtNumero2.text.toString().toIntOrNull() ?: 0
            val resultado = num1 / num2
            editResultado.text = "Resultado: $resultado"
        }
    }
}