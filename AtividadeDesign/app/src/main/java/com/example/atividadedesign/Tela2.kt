package com.example.atividadedesign

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Button
import android.widget.Toast

class Tela2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela2)

        val btnHome = findViewById<Button>(R.id.button2)
        btnHome.setOnClickListener {
            Toast.makeText(this, "As vezes é preciso voltar para o começo", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)

        }

        val tela3 = findViewById<Button>(R.id.button3)
        tela3.setOnClickListener {
            Toast.makeText(this, "A jornada é longa", Toast.LENGTH_SHORT).show()

            val intent = Intent(this, Tela3::class.java)
            startActivity(intent)

        }
    }

}