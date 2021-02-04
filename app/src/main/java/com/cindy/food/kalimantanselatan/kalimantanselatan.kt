package com.cindy.food.kalimantanselatan

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.cindy.food.R
import com.cindy.food.kalimantanselatan.ListKalimantanSelatan

class kalimantanselatan : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_kalimantan)

        val banten = findViewById<Button>(R.id.kalimantanSelatan)
        banten.setOnClickListener {
            val intent = Intent(this, ListKalimantanSelatan::class.java)
            startActivity(intent)
        }
    }
}