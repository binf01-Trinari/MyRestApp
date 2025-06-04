package com.example.myrestapp_christiantrinari

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_menu)

        val netflix = findViewById<ImageButton>(R.id.netflix)
        netflix.setOnClickListener {
            netflixIntent()
        }
    }

    private fun netflixIntent(){
        val mioIntent = Intent(this, WebViewActivity::class.java)
        startActivity(mioIntent)
    }
}