package com.curso.android.app.proyectofinal

import android.content.Context
import android.content.Intent
import android.os.Parcel
import android.os.Parcelable
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.platform.app.InstrumentationRegistry
import junit.framework.TestCase.assertEquals
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runner.manipulation.Ordering


private val Any.text: String?
    get() {
        TODO("Not yet implemented")
    }
private val Any.textViewResult: Any
    get() {
        TODO("Not yet implemented")
    }
private val Any.buttonCompare: Any
    get() {
        TODO("Not yet implemented")
    }
private val Any.textView2: Any
    get() {
        TODO("Not yet implemented")
    }
private val Any.textView1: Any
    get() {
        TODO("Not yet implemented")
    }

@RunWith(AndroidJUnit4::class)
class MainActivityTest() : Parcelable {

    constructor(parcel: Parcel) : this() {
    }

    class MyClass {
        fun myFunction() {
            // Código de la función
        }
    }
    @Test
    fun testCompareStrings() {
        // Crear una instancia de la actividad
        val activity = InstrumentationRegistry.getInstrumentation().targetContext.startActivity<MainActivity>()

        // Establecer la entrada de los cuadros de texto
        activity.textView1.setText("Hola")
        activity.textView2.setText("Hola")

        // Presionar el botón comparar
        activity.buttonCompare.performClick()

        // Verificar el resultado
        assertEquals("Las cadenas son iguales", activity.textViewResult.text)
    }

    @Test
    fun testCompareStringsDifferent() {
        // Crear una instancia de la actividad
        val activity = InstrumentationRegistry.getInstrumentation().targetContext.startActivity<MainActivity>()

        // Establecer la entrada de los cuadros de texto
        activity.textView1.setText("Hola")
        activity.textView2.setText("Adiós")

        // Presionar el botón comparar
        activity.buttonCompare.performClick()

        // Verificar el resultado
        assertEquals("Las cadenas son diferentes", activity.textViewResult.text)
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {

    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<MainActivityTest> {
        override fun createFromParcel(parcel: Parcel): MainActivityTest {
            return MainActivityTest(parcel)
        }

        override fun newArray(size: Int): Array<MainActivityTest?> {
            return arrayOfNulls(size)
        }
    }
}

private fun Any.performClick() {


}

private fun Any.setText(s: String) {

}

private fun <T> Context.startActivity() {

}

inline fun <reified T> Context.startActivity(intent: Intent): Any {

    val intent = Intent(this, T::class.java)


    return intent
}

private inline fun <reified T> Ordering.Context.startActivity(): Intent {

    val intent = Intent(this, T::class.java)


    return intent
  }

fun <T> Intent(context: Ordering.Context, java: Class<T>): Intent {
    TODO("Not yet implemented")
}

fun Context.Intent(java: Class<*>): Intent {

    val intent = Intent(this, java)


    return intent
  }
fun main() {
    val myClass = MainActivityTest.MyClass()
    myClass.myFunction()
}

