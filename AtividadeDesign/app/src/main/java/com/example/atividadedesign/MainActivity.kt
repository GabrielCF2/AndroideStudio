package com.example.atividadedesign

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tela1 = findViewById<Button>(R.id.button)
//        actionBar?.setDisplayHomeAsUpEnabled(true)
        tela1.setOnClickListener {

            Toast.makeText(this, "O começo de uma jornada", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, Tela2::class.java)
            startActivity(intent)
        }
    }

}