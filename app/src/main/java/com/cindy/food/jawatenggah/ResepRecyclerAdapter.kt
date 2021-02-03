package com.cindy.food.jawatenggah

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.cindy.food.R
import com.cindy.food.jawatenggah.DetilResep
import com.cindy.food.jawatenggah.ListObjResep
import kotlinx.android.synthetic.main.layout_list_jawatenggah.view.*

class ResepRecyclerAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    private  var items: List<ListObjResep> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return ResepViewHolder(
                LayoutInflater.from(parent.context).inflate(R.layout.layout_list_jawatenggah, parent, false)
        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when(holder) {
            is ResepViewHolder -> {
                holder.bind(items.get(position))
                holder.klik.setOnClickListener {
                    holder.kalau_diklik(items.get(position))
                }
            }
        }
    }
    fun submitList(listResep: List<ListObjResep>){
        items = listResep
    }

    override fun getItemCount(): Int {
        return items.size
    }

    class ResepViewHolder constructor(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val foto_detil : ImageView = itemView.gambar_resep
        val nama : TextView = itemView.nama_resep
        //        val alat : TextView = itemView.alat_resep
//        val bahan : TextView = itemView.bahan_resep
//        val cara : TextView = itemView.cara_resep
        val klik : RelativeLayout = itemView.findViewById(R.id.rl_klik)

        fun bind(listObjResep: ListObjResep) {
            nama.setText(listObjResep.nama)
//            alat.setText(listObjResep.alat)
//            bahan.setText(listObjResep.bahan)
//            cara.setText(listObjResep.cara)

            val requestOp = RequestOptions()
                    .placeholder(R.drawable.ic_food)
                    .error(R.drawable.ic_food)

            Glide.with(itemView.context)
                    .applyDefaultRequestOptions(requestOp)
                    .load(listObjResep.foto)
                    .into(foto_detil)
        }
        fun kalau_diklik(get: ListObjResep) {
            val position:Int = adapterPosition
            Toast.makeText(itemView.context, "Kamu memilih : ${get.nama}",
                    Toast.LENGTH_SHORT)
                    .show()

            val intent = Intent(itemView.context, DetilResep::class.java)
            intent.putExtra("namanya", get.nama)
            intent.putExtra("fotonya", get.foto)
            intent.putExtra("alatnya", get.alat)
            intent.putExtra("bahannya", get.bahan)
            intent.putExtra("caranya", get.cara)
            itemView.context.startActivity(intent)
        }
    }
}