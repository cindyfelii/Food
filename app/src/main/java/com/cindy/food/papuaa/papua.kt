package com.cindy.food.papuaa

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.cindy.food.R
import com.cindy.food.papuaa.ListPapua

class papua : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_papua)

        val banten = findViewById<Button>(R.id.btnPapua)
        banten.setOnClickListener {
            val intent = Intent(this, ListPapua::class.java)
            startActivity(intent)
        }
    }
}