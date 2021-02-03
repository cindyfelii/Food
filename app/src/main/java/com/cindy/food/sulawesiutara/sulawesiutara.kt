package com.cindy.food.sulawesiutara

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.cindy.food.R

class sulawesiutara : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_sulawesi)

        val banten = findViewById<Button>(R.id.SulawesiUtara)
        banten.setOnClickListener {
            val intent = Intent(this, ListSulawesiUtara::class.java)
            startActivity(intent)
        }
    }
}