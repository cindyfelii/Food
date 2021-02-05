package com.cindy.food.jambi

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.cindy.food.R

class jambi : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_sumatera)

        val banten = findViewById<Button>(R.id.Jambi)
        banten.setOnClickListener {
            val intent = Intent(this, ListJambi::class.java)
            startActivity(intent)
        }
    }
}