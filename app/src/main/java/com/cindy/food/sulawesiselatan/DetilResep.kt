package com.cindy.food.sulawesiselatan

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.cindy.food.R
import kotlinx.android.synthetic.main.detil_resep.*

class DetilResep : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detil_resep)
        if (intent.hasExtra("namanya")){
            val nama : String = this.intent.getStringExtra("namanya").toString()
            val foto : String = this.intent.getStringExtra("fotonya").toString()
            val alat : String = this.intent.getStringExtra("alatnya").toString()
            val bahan : String = this.intent.getStringExtra("bahannya").toString()
            val cara : String = this.intent.getStringExtra("caranya").toString()
            setDetil(foto, nama, alat, bahan, cara)
        }
    }

    fun setDetil(foto: String, nama: String, alat:String, bahan: String, cara: String) {
        val requestOp = RequestOptions()
                .placeholder(R.drawable.ic_food)
                .error(R.drawable.ic_food)

        nama_resep.text = nama
        alat_resep.text = alat
        bahan_resep.text = bahan
        cara_resep.text = cara

        Glide.with(this)
                .load(foto)
                .apply(requestOp)
                //.centerCrop()
                .into(foto_detil)
    }
}