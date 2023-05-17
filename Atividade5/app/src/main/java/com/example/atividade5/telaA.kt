package com.example.atividade5

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class TelaA : AppCompatActivity() {
    private val context: Context get() = this
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela)
        val button: Button = findViewById(R.id.buttonA)
        button.setOnClickListener {
            // Do something in response to button click
            proxTela()
        }

    }
    fun proxTela(){
        val intent = Intent(context,TelaB::class.java)
        startActivity(intent)
    }
}