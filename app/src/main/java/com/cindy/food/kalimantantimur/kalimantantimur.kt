package com.cindy.food.kalimantantimur

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.cindy.food.R
import com.cindy.food.kalimantantimur.ListKalimantanTimur

class kalimantantimur : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_kalimantan)

        val banten = findViewById<Button>(R.id.kalimantanTimur)
        banten.setOnClickListener {
            val intent = Intent(this, ListKalimantanTimur::class.java)
            startActivity(intent)
        }
    }
}