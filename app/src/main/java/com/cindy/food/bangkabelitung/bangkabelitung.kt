package com.cindy.food.bangkabelitung

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.cindy.food.R

class bangkabelitung : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_sumatera)

        val banten = findViewById<Button>(R.id.BagkaBelitung)
        banten.setOnClickListener {
            val intent = Intent(this, ListBangkaBelitung::class.java)
            startActivity(intent)
        }
    }
}