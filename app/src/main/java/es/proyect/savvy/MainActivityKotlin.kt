package es.proyect.savvy

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivityKotlin : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Aquí puedes agregar tus listas
        val leftItems = listOf("Manzana", "Gato", "Sol")
        val rightItems = listOf("Fruta", "Animal", "Astro")

        // Ejemplo: Mostrar un dato en la consola
        println("Left Items: $leftItems")
    }
}