package com.example.myrestapp_christiantrinari

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)

        val accedi = findViewById<Button>(R.id.accedi)
        accedi.setOnClickListener {
            menuIntent()
        }
    }

    private fun menuIntent(){
        val mioIntent = Intent(this, MenuActivity::class.java)
        startActivity(mioIntent)
    }
}