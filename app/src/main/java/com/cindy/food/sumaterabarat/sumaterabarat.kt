package com.cindy.food.sumaterabarat

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.cindy.food.R

class sumaterabarat : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_sumatera)

        val banten = findViewById<Button>(R.id.Sumatera_Barat)
        banten.setOnClickListener {
            val intent = Intent(this, ListSumateraBarat::class.java)
            startActivity(intent)
        }
    }
}