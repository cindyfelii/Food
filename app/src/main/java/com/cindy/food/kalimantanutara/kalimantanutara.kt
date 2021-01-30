package com.cindy.food.kalimantanutara

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.cindy.food.R
import com.cindy.food.kalimantanutara.ListKalimantanUtara

class kalimantanutara : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_kalimantan)

        val banten = findViewById<Button>(R.id.btnkalimantanUtara)
        banten.setOnClickListener {
            val intent = Intent(this, ListKalimantanUtara::class.java)
            startActivity(intent)
        }
    }
}