package com.cindy.food.riau

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.cindy.food.R
import com.cindy.food.riau.ListRiau

class riau : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_sumatera)

        val banten = findViewById<Button>(R.id.btnRiau)
        banten.setOnClickListener {
            val intent = Intent(this, ListRiau::class.java)
            startActivity(intent)
        }
    }
}