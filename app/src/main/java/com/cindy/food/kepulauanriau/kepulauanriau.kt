package com.cindy.food.kepulauanriau

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.cindy.food.R

class kepulauanriau : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_sumatera)

        val banten = findViewById<Button>(R.id.KepulauanRiau)
        banten.setOnClickListener {
            val intent = Intent(this, ListKepulauanRiau::class.java)
            startActivity(intent)
        }
    }
}