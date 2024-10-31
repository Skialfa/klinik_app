package com.mobiledimas.klinik_app


import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class stater_page : AppCompatActivity() {
    private lateinit var Btnget : Button
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_stater_page)

        Btnget = findViewById(R.id.btnget)

        Btnget.setOnClickListener(){
            val intent = Intent(this,login::class.java)
            startActivity(intent)
        }
    }
}