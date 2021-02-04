package com.cindy.food.yogya

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.cindy.food.R

class yogyakarta : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_jawa)

        val banten = findViewById<Button>(R.id.btnYogyakarta)
        banten.setOnClickListener {
            val intent = Intent(this, ListYogyakarta::class.java)
            startActivity(intent)
        }
    }
}