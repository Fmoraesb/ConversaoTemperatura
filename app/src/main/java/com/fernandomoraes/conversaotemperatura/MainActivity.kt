package com.fernandomoraes.conversaotemperatura

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTitle("Conversor de Temperatura")
        setContentView(R.layout.activity_main)
        val texto = findViewById<TextView>(R.id.txtCelsius)
        val botao = findViewById<Button>(R.id.btnConverter)
        var temperatura : Double = 0.0
        var tempEmF : Double = 0.0
        var tempEmK : Double = 0.0

        botao.setOnClickListener() {
           if (texto.text.toString().isBlank()) {
               Toast.makeText(this, "Por favor, entre com uma temperatura",Toast.LENGTH_LONG).show()
           }else
                temperatura = texto.text.toString().toDouble()
                tempEmK = temperatura + 273.15
                tempEmF = (temperatura * 1.8) + 32
                txtvKelvin.text = tempEmK.toString()
                txtvFahrenheit.text = tempEmF.toString()

        }

    }
}