package com.cindy.food.bali

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.cindy.food.R

class bali : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_jawa)

        val banten = findViewById<Button>(R.id.btnBali)
        banten.setOnClickListener {
            val intent = Intent(this, ListBali::class.java)
            startActivity(intent)
        }
    }
}