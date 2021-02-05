package com.cindy.food.sumateraselatan

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.cindy.food.R

class sumateraselatan : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_sumatera)

        val banten = findViewById<Button>(R.id.Sumatera_Selatan)
        banten.setOnClickListener {
            val intent = Intent(this, ListSumateraSelatan::class.java)
            startActivity(intent)
        }
    }
}