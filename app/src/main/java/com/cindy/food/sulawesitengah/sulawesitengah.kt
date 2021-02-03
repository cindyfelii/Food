package com.cindy.food.sulawesitengah

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.cindy.food.R

class sulawesitengah : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_sulawesi)

        val banten = findViewById<Button>(R.id.SulawesiTengah)
        banten.setOnClickListener {
            val intent = Intent(this, ListSulawesiTengah::class.java)
            startActivity(intent)
        }
    }
}