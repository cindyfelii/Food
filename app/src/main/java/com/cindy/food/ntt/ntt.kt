package com.cindy.food.ntt

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.cindy.food.R

class ntt : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_jawa)

        val banten = findViewById<Button>(R.id.btnNusaTenggaraTimur)
        banten.setOnClickListener {
            val intent = Intent(this, ListNTT::class.java)
            startActivity(intent)
        }
    }
}