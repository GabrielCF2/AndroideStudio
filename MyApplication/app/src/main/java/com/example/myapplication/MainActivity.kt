package com.example.myapplication

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem

class MainActivity : AppCompatActivity() {
/*
* Adicionar o NoActionBar nos temas
* criar a toolbar.xml no layout
* Adicionar o suportActionBar Toolbar nas activitys
* Incluir as toolbars nos arquivos XML
* Adiconar finishAffinit() no botão de sair
* */
    private val context:Context get() = this
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.toolbar))
//        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "Prova"

    }
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_tela1,menu)
        return super.onCreateOptionsMenu(menu)
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id = item?.itemId
        if (id == R.id.prox){
            proxTela()
            return true
        }
        return super.onOptionsItemSelected(item)
    }
    fun proxTela(){
        val intent = Intent(context, MainActivity2::class.java)
        startActivity(intent)
    }
}