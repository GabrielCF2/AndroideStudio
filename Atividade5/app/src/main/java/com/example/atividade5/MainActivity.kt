package com.example.atividade5

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : DebugActivity() {
    private val context: Context get() = this
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button: Button = findViewById(R.id.buttonFazLogin)
        button.setOnClickListener {
            // Do something in response to button click
            onClickLogin()
        }
        val buttonA: Button = findViewById(R.id.buttonTA)
        buttonA.setOnClickListener {
            // Do something in response to button click
            proxTela()
        }
    }

    fun onClickLogin(){
        val login = findViewById<EditText>(R.id.editTextLogin).toString()
        val senha = findViewById<EditText>((R.id.editTextSenha)).toString()
        if(login=="gabriel" && senha=="123"){
            val intent = Intent(context,BemVindoActivity::class.java)
            val params = Bundle()
            params.putString("nome","Gabriel")
            intent.putExtras(params)
            startActivity(intent)
        }
        else{
            //toast("Login ou senha incorretos")
        }

    }
    fun proxTela(){
        val intent = Intent(context,TelaA::class.java)
        startActivity(intent)
    }

}