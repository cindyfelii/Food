package com.cindy.food.bandarlampung

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.cindy.food.R

class bandarlampung : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_sumatera)

        val banten = findViewById<Button>(R.id.Lampung)
        banten.setOnClickListener {
            val intent = Intent(this, ListBandarLampung::class.java)
            startActivity(intent)
        }
    }
}