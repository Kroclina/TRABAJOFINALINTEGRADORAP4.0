package com.curso.android.app.proyectofinal.comparar

class CompararViewModel {
    private val model: CompararModel

    init {
        model = CompararModel()
    }

    fun comparar(): Boolean {
        return model.cadena1 == model.cadena2
    }

    fun setCadena1(cadena1: String?) {
        model.cadena1 = cadena1
    }

    fun setCadena2(cadena2: String?) {
        model.cadena2 = cadena2
    }
}