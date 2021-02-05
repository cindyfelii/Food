package com.cindy.food.sumaterautara

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.cindy.food.R

class sumaterautara : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_sumatera)

        val banten = findViewById<Button>(R.id.Sumatera_Utara)
        banten.setOnClickListener {
            val intent = Intent(this, ListSumateraUtara::class.java)
            startActivity(intent)
        }
    }
}