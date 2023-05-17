package com.example.atividade5

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Button
import android.widget.TextView

class BemVindoActivity : DebugActivity() {
    private val context: Context get() = this
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //Visões
        setContentView(R.layout.activity_bem_vindo)
        val textView = findViewById<TextView>(R.id.textBoasVindas)
        //Args
        val button: Button = findViewById(R.id.buttonBV)
        button.setOnClickListener {
            // Do something in response to button click
            proxTela()
        }
        val args = intent.extras
        val nome = args?.getString("nome")
        textView.text = "$nome, seja bem vindo."

        actionBar?.setDisplayHomeAsUpEnabled(true)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(item.itemId ==android.R.id.home){
            finish()
            return true
        }
        return super.onOptionsItemSelected(item)
    }
    fun proxTela(){
        val intent = Intent(context,TelaA::class.java)
        startActivity(intent)
    }
}