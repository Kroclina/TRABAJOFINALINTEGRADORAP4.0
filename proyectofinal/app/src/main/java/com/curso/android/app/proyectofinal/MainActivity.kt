package com.curso.android.app.proyectofinal

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    private var txtCadena1: EditText? = null
    private var txtCadena2: EditText? = null
    private var btnComparar: Button? = null
    private var txtResultado: TextView? = null
    protected override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Referencias a los elementos de la interfaz
        txtCadena1 = findViewById(R.id.txtCadena1)
        txtCadena2 = findViewById(R.id.txtCadena2)
        btnComparar = findViewById(R.id.btnComparar)
        txtResultado = findViewById(R.id.txtResultado)

        // Escuchador del botón
        btnComparar!!.setOnClickListener { // Obtener las cadenas de caracteres ingresadas por el usuario
            val cadena1 = txtCadena1!!.text.toString()
            val cadena2 = txtCadena2!!.text.toString()

            // Comparar las cadenas de caracteres
            val iguales = cadena1 == cadena2

            // Mostrar el resultado
            txtResultado!!.text = if (iguales) "Iguales" else "Diferentes"
        }
    }
}