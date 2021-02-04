package com.cindy.food.jakarta

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.cindy.food.R

class jawabarat : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_jawa)

        val banten = findViewById<Button>(R.id.btnJakarta)
        banten.setOnClickListener {
            val intent = Intent(this, ListJakarta::class.java)
            startActivity(intent)
        }
    }
}