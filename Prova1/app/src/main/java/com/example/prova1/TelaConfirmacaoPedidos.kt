package com.example.prova1

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class TelaConfirmacaoPedidos : AppCompatActivity() {
    private val context: Context get() = this
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_confirmacao_pedidos)
        val pedido = findViewById<TextView>(R.id.TextoPedido)
        val quantidade = findViewById<TextView>(R.id.TextoQuantidade)
        supportActionBar?.displayOptions
        setSupportActionBar(findViewById(R.id.toolbar))
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "Confirmar pedido"



        val args = intent.extras
        val nome = args?.getString("pedido")
        val preco = args?.getString("valor")
        pedido.text = "$nome"
        quantidade.text="$preco"

    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_confirmacao,menu)
        return super.onCreateOptionsMenu(menu)
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id = item?.itemId

        if (id == R.id.Confirmar){
            confirmarPedido()
        }
        if (id == R.id.Voltar){
            voltar()
        }
        if (id == R.id.Sair){
            sair()
        }
        return super.onOptionsItemSelected(item)
    }
    fun confirmarPedido(){
        val args = intent.extras
        val intent = Intent(context,TelaBoasVindas::class.java)
        val params = Bundle()

        val login = args?.getString("nome")
        params.putString("nome",login)
        Toast.makeText(context, "Pedido Confirmado", Toast.LENGTH_SHORT).show()

        intent.putExtras(params)
        startActivity(intent)
    }
    fun voltar(){
        finish()
    }
    fun sair(){
        finishAffinity()
    }
}