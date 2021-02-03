package com.cindy.food.papuabarat

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.cindy.food.R
import com.cindy.food.papuabarat.ListPapuaBarat

class papuabarat : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_papua)

        val banten = findViewById<Button>(R.id.btnPapuaBarat)
        banten.setOnClickListener {
            val intent = Intent(this, ListPapuaBarat::class.java)
            startActivity(intent)
        }
    }
}