package com.cindy.food.kalimantanbarat

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.cindy.food.R
import com.cindy.food.kalimantanutara.ListKalimantanUtara
import com.cindy.food.papuabarat.ListPapuaBarat

class kalimantanbarat : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_kalimantan)

        val banten = findViewById<Button>(R.id.kalimantanBarat)
        banten.setOnClickListener {
            val intent = Intent(this, ListKalimantanBarat::class.java)
            startActivity(intent)
        }
    }
}