package com.curso.android.app.proyectofinal

import android.content.Context
import android.content.Intent
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.platform.app.InstrumentationRegistry
import junit.framework.TestCase.assertEquals
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runner.manipulation.Ordering

private val Any.textView: TextView
    get() {
        // Obtener el TextView
        return findViewById(R.id.textView)
    }

private val Any.button: Button
    get() {
        // Obtener el botón
        return findViewById(R.id.button)
    }

private val Any.editText1: Button
    get() {
        // Obtener el EditText
        return findViewById(R.id.editText1)
    }

private val Any.editText2: Button
    get() {

        return findViewById(R.id.editText2)
    }

fun findViewById(editText1: Any): Button {
    TODO("Not yet implemented")
}

@RunWith(AndroidJUnit4::class)
class MainActivityInstrumentedTest {

    @Test
    fun testCompararCadenas() {
        val activity = InstrumentationRegistry.getInstrumentation().targetContext.startActivity<MainActivity>()

        // Ingresar cadenas iguales
        activity.editText1.setText("Hola, mundo")
        activity.editText2.setText("Hola, mundo")
        activity.button.performClick()

        // Comprobar que el texto del textView es "Las cadenas son iguales"
        assertEquals("Las cadenas son iguales", activity.textView.text)

        // Ingresar cadenas diferentes
        activity.editText1.setText("Hola, mundo")
        activity.editText2.setText("Hola, mundo!")
        activity.button.performClick()

        // Comprobar que el texto del textView es "Las cadenas son diferentes"
        assertEquals("Las cadenas son diferentes", activity.textView.text)
    }


    private inline fun <reified T> Context.startActivity(): Intent {
        // Crear un Intent
        val intent = Intent(this, T::class.java)

        // Devolver el Intent
        return intent
    }

    private fun <T> Intent(context: Ordering.Context, java: Class<T>): Any {

        val intent = Intent(context, java)


        return intent
    }
}

private inline fun <reified T> Context.startActivity(): Any {

    val intent = Intent(this, T::class.java)

    // Iniciar la actividad
    startActivity(intent)


    return intent
   }


