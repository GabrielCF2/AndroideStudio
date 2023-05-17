package com.example.atividade5

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class TelaE : AppCompatActivity() {
    @SuppressLint("AppCompatMethod")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_e)
        actionBar?.setDisplayHomeAsUpEnabled(true)
    }
}