package com.cindy.food.sulawesiselatan

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.cindy.food.R

class sulawesiselatan : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_sulawesi)

        val banten = findViewById<Button>(R.id.SulawesiSelatan)
        banten.setOnClickListener {
            val intent = Intent(this, ListSulawesiSelatan::class.java)
            startActivity(intent)
        }
    }
}