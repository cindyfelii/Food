package com.cindy.food.banten

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.cindy.food.R

class banten : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_jawa)

        val banten = findViewById<Button>(R.id.btnBanten)
        banten.setOnClickListener {
            val intent = Intent(this, ListBanten::class.java)
            startActivity(intent)
        }
    }
}