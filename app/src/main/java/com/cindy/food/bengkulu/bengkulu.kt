package com.cindy.food.bengkulu

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.cindy.food.R

class bengkulu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_sumatera)

        val banten = findViewById<Button>(R.id.Bengkulu)
        banten.setOnClickListener {
            val intent = Intent(this, ListBengkulu::class.java)
            startActivity(intent)
        }
    }
}