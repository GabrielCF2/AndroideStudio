package com.example.prova1

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.widget.Toolbar

class TelaBoasVindas : AppCompatActivity() {
    private val context: Context get() = this
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_boas_vindas)

        supportActionBar?.displayOptions
        setSupportActionBar(findViewById(R.id.toolbar))
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "Bem vindo!"


        val texto = findViewById<TextView>(R.id.textView)
        val args = intent.extras
        val nome = args?.getString("nome")
        texto.text = "Bem vindo $nome"

//        val botao = findViewById<MenuItem>(R.id.Pedido)

    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_principal,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id = item?.itemId

        if (id == R.id.Pedido){
            telaPedido()
        }
        return super.onOptionsItemSelected(item)
    }
    fun telaPedido(){
        val args = intent.extras
        val intent = Intent(context,TelaPedidos::class.java)
        val params = Bundle()

        val login = args?.getString("nome")
        params.putString("nome",login)
        intent.putExtras(params)


        startActivity(intent)

    }
}