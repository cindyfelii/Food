package com.cindy.food.aceh

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.cindy.food.R

class aceh : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_sumatera)

        val banten = findViewById<Button>(R.id.Aceh)
        banten.setOnClickListener {
            val intent = Intent(this, ListAceh::class.java)
            startActivity(intent)
        }
    }
}