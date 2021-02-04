package com.cindy.food.ntt

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.cindy.food.R
import com.cindy.food.ntt.DekorasiSpasiGambar
import com.cindy.food.ntt.SumberData
import com.cindy.food.ntt.ResepRecyclerAdapter
import kotlinx.android.synthetic.main.list_resep20.*

class Activity_ke22 : AppCompatActivity() {
    private  lateinit var resepAdapter: ResepRecyclerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.list_resep20)
        initRecyclerView()
        tambahDataSet()
    }
    private  fun tambahDataSet(){
        val data = SumberData.buatSetData()
        resepAdapter.submitList(data)
    }

    private fun initRecyclerView() {
        recyler_view.apply {
            layoutManager = LinearLayoutManager(this@Activity_ke22)
            val spacingAtas = DekorasiSpasiGambar(20)
            addItemDecoration(spacingAtas)
            resepAdapter = ResepRecyclerAdapter()
            adapter = resepAdapter
        }
    }
}