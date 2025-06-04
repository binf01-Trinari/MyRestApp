package com.example.myrestapp_christiantrinari

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.security.MessageDigest
import android.util.Log

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)

        val nome = findViewById<EditText>(R.id.nome)
        val password = findViewById<EditText>(R.id.password)

        //credenziali
        val nomeAdmin = "christian"
        val passwordAdmin = sha256("123456789")

        val accedi = findViewById<Button>(R.id.accedi)
        accedi.setOnClickListener {
            val nomeStringa = nome.text.toString()
            val passwordStringa = password.text.toString()
            val passwordHash = sha256(passwordStringa)

            if(nomeStringa == nomeAdmin && passwordHash == passwordAdmin){
                val mioToast = Toast.makeText(this, "Login avvenuto!", Toast.LENGTH_LONG)
                mioToast.show()
                menuIntent()

            } else{
                val mioToast = Toast.makeText(this, "Credenziali errate!", Toast.LENGTH_LONG)
                mioToast.show()
            }
        }

    }

    private fun menuIntent(){
        val mioIntent = Intent(this, MenuActivity::class.java)
        startActivity(mioIntent)
    }

    private fun sha256(input: String): String {
        val bytes = MessageDigest.getInstance("SHA-256").digest(input.toByteArray())
        return bytes.joinToString("") { "%02x".format(it) }
    }

}