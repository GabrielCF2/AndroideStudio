package com.example.prova1

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    private val context: Context get() = this
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val botao = findViewById<Button>(R.id.button)
        botao.setOnClickListener{
            fazLogin()
        }
    }
    fun fazLogin(){
        val login = findViewById<EditText>(R.id.editTextTextPersonName).toString()
        val senha = findViewById<EditText>(R.id.editTextTextPassword).toString()
        if(login=="aluno"&&senha=="123"){
            val intent = Intent(context,TelaBoasVindas::class.java)
            val params = Bundle()
            params.putString("nome",login)
            intent.putExtras(params)
            startActivity(intent)
        }
    }
}