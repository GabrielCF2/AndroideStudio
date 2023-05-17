package com.example.olamundo


import android.content.ContentValues.TAG
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.util.Log
import android.widget.Toast


class MainActivity : DebugActivity() {
    private val TAG = "livro"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//
//        //Aula 2
////        log.v(TAG,"log de Verbose")
////        log.w(TAG, "log de aviso")
//        Log.v(TAG, "Visão criada")
//
//        val btLogin = findViewById<Button>(R.id.buttonFazLogin)
//        //
//        btLogin.setOnClickListener{
//            val tLogin = findViewById<TextView>(R.id.editTextLogin)
//            val tSenha = findViewById<TextView>(R.id.editTextSenha)
//            val login = tLogin.text.toString()
//            val senha = tSenha.text.toString()
//            if (login == "alexandre" && senha == "123") {
//                toast("Bem vindo, login realizado com sucesso")
//            } else {
//                toast("Login ou Senha incorretos!!")
//            }
//        }
////        val rollButton: Button = findViewById(R.id.roll_button)
////        rollButton.setOnClickListener { rollDice() }
////
////        val countButton: Button = findViewById(R.id.countup_button)
////        countButton.setOnClickListener { countUp() }
    }
//    private fun toast(mensagem: String, length: Int = Toast.LENGTH_SHORT){
//        Toast.makeText(this, mensagem, length).show()
//    }
//    private fun rollDice() {
//        val randomInt = (1..6).random()
//        val resultText: TextView = findViewById(R.id.result_text)
//        resultText.text = randomInt.toString()
//    }
//    private fun countUp() {
//        val resultText: TextView = findViewById(R.id.result_text)
//
//        // If text is the default "Hello World!" set that text to 1.
//        if (resultText.text == "Hello World!") {
//            resultText.text = "1"
//        } else {
//            // Otherwise, increment the number up to 6.
//            // The text value in resultText.text is an instance of the CharSequence class;
//            // it needs to be converted to a String object before it can be converted to an int.
//            var resultInt = resultText.text.toString().toInt()
//
//            if (resultInt < 6) {
//                resultInt++
//                resultText.text = resultInt.toString()
//            }
//        }
//    }
}