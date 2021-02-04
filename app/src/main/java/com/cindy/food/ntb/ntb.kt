package com.cindy.food.ntb

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.cindy.food.R

class ntb : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_jawa)

        val banten = findViewById<Button>(R.id.btnNusaTenggaraBarat)
        banten.setOnClickListener {
            val intent = Intent(this, ListNTB::class.java)
            startActivity(intent)
        }
    }
}