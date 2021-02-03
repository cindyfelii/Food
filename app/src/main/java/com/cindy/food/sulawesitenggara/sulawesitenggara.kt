package com.cindy.food.sulawesitenggara

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.cindy.food.R

class sulawesitenggara : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_sulawesi)

        val banten = findViewById<Button>(R.id.SulawesiTenggara)
        banten.setOnClickListener {
            val intent = Intent(this, ListSulawesiTenggara::class.java)
            startActivity(intent)
        }
    }
}