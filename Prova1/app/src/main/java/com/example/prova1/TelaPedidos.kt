package com.example.prova1

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.EditText
import android.widget.Toast

class TelaPedidos : AppCompatActivity() {
    private val context: Context get() = this
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_pedidos)
        supportActionBar?.displayOptions
        setSupportActionBar(findViewById(R.id.toolbar))
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "Pedido"


    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_principal,menu)
        return super.onCreateOptionsMenu(menu)
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id = item?.itemId

        if (id == R.id.Pedido){
            calculaPedido()
        }
        return super.onOptionsItemSelected(item)
    }
    fun calculaPedido(){
        val args = intent.extras
        var quant = findViewById<EditText>(R.id.editTextNumber).text.toString()
        var pedido = findViewById<EditText>(R.id.editTextTextPersonName2).text.toString()
        val intent = Intent(context,TelaConfirmacaoPedidos::class.java)
        val params = Bundle()

        val login = args?.getString("nome")
        params.putString("nome",login)
        intent.putExtras(params)
        params.putString("valor",quant)
        params.putString("pedido",pedido)
        intent.putExtras(params)

        startActivity(intent)


    }
}