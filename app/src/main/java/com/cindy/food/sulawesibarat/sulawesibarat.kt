package com.cindy.food.sulawesibarat

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.cindy.food.R

class sulawesibarat : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_sulawesi)

        val banten = findViewById<Button>(R.id.SulawesiBarat)
        banten.setOnClickListener {
            val intent = Intent(this, ListSulawesiBarat::class.java)
            startActivity(intent)
        }
    }
}