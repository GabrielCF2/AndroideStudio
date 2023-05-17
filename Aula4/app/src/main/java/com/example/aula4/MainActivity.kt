package com.example.aula4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
//    private val TAG = "livro"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
//        Log.v(TAG,"Visão criada")
//        val btLogin = findViewById<Button>(R.id.button)
//        btLogin.setOnClickListener{
//            val tLogin = findViewById<TextView>(R.id.editTextTextPersonName)
//            val tSenha= findViewById<TextView>(R.id.editTextTextPassword)
//            val login = tLogin.text.toString()
//            val senha = tSenha.text.toString()
//
//            if(login == "gabriel" && senha == "123"){
//                toast("Bem vindo, login realizado com sucesso")
//            }else{
//                toast("Login ou senha incorretos!!")
//            }
//        }
    }
//    private fun toast(mensagem: String, length: Int = Toast.LENGTH_SHORT){
//        Toast.makeText(this,mensagem,length).show()
//    }
}