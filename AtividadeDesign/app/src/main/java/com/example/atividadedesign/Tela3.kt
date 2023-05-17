package com.example.atividadedesign

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class Tela3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela3)
        val tela2 = findViewById<Button>(R.id.button4)
        tela2.setOnClickListener {
            Toast.makeText(this, "A jornada é longa", Toast.LENGTH_SHORT).show()

            val intent = Intent(this, Tela2::class.java)
            startActivity(intent)

        }
        val tela4 = findViewById<Button>(R.id.button5)
        tela4.setOnClickListener {
            Toast.makeText(this, "E cheia de maravlihas", Toast.LENGTH_SHORT).show()

            val intent = Intent(this, Tela4::class.java)
            startActivity(intent)

        }
    }

}