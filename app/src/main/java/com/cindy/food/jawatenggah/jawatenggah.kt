package com.cindy.food.jawatenggah

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.cindy.food.R
import com.cindy.food.jawatenggah.ListJawaTengah

class jawatenggah  : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_jawa)

        val banten = findViewById<Button>(R.id.btnJawaTengah)
        banten.setOnClickListener {
            val intent = Intent(this, ListJawaTengah::class.java)
            startActivity(intent)
        }
    }
}