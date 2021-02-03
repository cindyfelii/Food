package com.cindy.food.kalimantantengah

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.cindy.food.R
import com.cindy.food.kalimantantengah.ListKalimantanTengah

class kalimantantengah : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_kalimantan)

        val banten = findViewById<Button>(R.id.kalimantanTengah)
        banten.setOnClickListener {
            val intent = Intent(this, ListKalimantanTengah::class.java)
            startActivity(intent)
        }
    }
}