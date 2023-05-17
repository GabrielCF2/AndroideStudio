package com.example.atividade6

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    @SuppressLint("AppCompatMethod")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        actionBar?.title = "Olá Action Bar"
        //Para Action Bar de appCompat
        supportActionBar?.title = "Olá sou Action Bar de appCompat"
        //Para definir a up Navigation
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_principal,menu)
        return super.onCreateOptionsMenu(menu)
    }
    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        val id = item?.itemId
        if (id == R.id.action_search){
            toast("Você clicou no Pesquisar/Search!")
            return true
        } else if (id == R.id.action_info){
            toast("Você clicou no botão de Informação!")
            return true
        } else if (id == R.id.action_settings){
            toast("Você clicou no botão de Configuração!!!")
            return true
        }
        return super.onOptionsItemSelected(item)
    }
    private fun toast(msg: String) {
        Toast.makeText(this, msg,   Toast.LENGTH_LONG).show()
    }
}