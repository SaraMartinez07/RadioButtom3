package com.example.radiobutton3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore.Audio.Radio
import android.view.View
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var txtResultado:TextView
    lateinit var rdSuma: RadioButton
    lateinit var rdResta: RadioButton
    lateinit var num1: EditText
    lateinit var num2: EditText
    lateinit var rdMulti: RadioButton
    lateinit var rdDiv: RadioButton


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Inicializando
        txtResultado= findViewById(R.id.tvResultado)
        rdSuma = findViewById(R.id.rbSuma)
        rdResta= findViewById(R.id.rbResta)
        num1 = findViewById(R.id.num1)
        num2 = findViewById(R.id.num2)
        rdMulti = findViewById(R.id.rbMulti)
        rdDiv = findViewById(R.id.rbDiv)

    }

    /**
     * Metodo que permite ejecutar la operacion
     * al presionar el boton
     */
    fun accionBoton(v: View){
        val numerito1 = num1.text.toString().toInt()
        val numerito2 = num2.text.toString().toInt()
        var resultado = 0
        if (rdSuma.isChecked){
            resultado = numerito1 + numerito2

        }else if(rdResta.isChecked){
            resultado = numerito1 - numerito2
        }else if (rdMulti.isChecked){
            resultado = numerito1*numerito2
        }else if (rdDiv.isChecked){
            resultado = numerito1/numerito2
        }
            txtResultado.text = "$resultado"
    }
}