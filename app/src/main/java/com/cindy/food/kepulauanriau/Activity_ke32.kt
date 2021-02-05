package com.cindy.food.kepulauanriau

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.cindy.food.R
import com.cindy.food.kepulauanriau.DekorasiSpasiGambar
import com.cindy.food.kepulauanriau.SumberData
import com.cindy.food.kepulauanriau.ResepRecyclerAdapter
import kotlinx.android.synthetic.main.list_resep30.*

class Activity_ke32 : AppCompatActivity() {
    private  lateinit var resepAdapter: ResepRecyclerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.list_resep30)
        initRecyclerView()
        tambahDataSet()
    }
    private  fun tambahDataSet(){
        val data = SumberData.buatSetData()
        resepAdapter.submitList(data)
    }

    private fun initRecyclerView() {
        recyler_view.apply {
            layoutManager = LinearLayoutManager(this@Activity_ke32)
            val spacingAtas = DekorasiSpasiGambar(20)
            addItemDecoration(spacingAtas)
            resepAdapter = ResepRecyclerAdapter()
            adapter = resepAdapter
        }
    }
}