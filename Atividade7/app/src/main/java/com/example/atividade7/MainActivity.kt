package com.example.atividade7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fm = supportFragmentManager
        val frag1 = fm.findFragmentById(R.id.fragmentContainerView4) as AloFragment
        frag1.hello() //Chama o print do alo mundo só para ilustrar
    }
}