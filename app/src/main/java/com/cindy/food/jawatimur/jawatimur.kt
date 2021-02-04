package com.cindy.food.jawatimur

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.cindy.food.R

class jawatimur : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_jawa)

        val banten = findViewById<Button>(R.id.btnJawaTimur)
        banten.setOnClickListener {
            val intent = Intent(this, ListJawaTimur::class.java)
            startActivity(intent)
        }
    }
}