package com.cindy.food.gorontalo

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.cindy.food.R

class gorontalo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_sulawesi)

        val banten = findViewById<Button>(R.id.Gorontalo)
        banten.setOnClickListener {
            val intent = Intent(this, ListGorontalo::class.java)
            startActivity(intent)
        }
    }
}