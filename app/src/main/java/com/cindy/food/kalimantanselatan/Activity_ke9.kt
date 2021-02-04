package com.cindy.food.kalimantanselatan

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.cindy.food.R
import com.cindy.food.kalimantanselatan.DekorasiSpasiGambar
import com.cindy.food.kalimantanselatan.SumberData
import com.cindy.food.kalimantanselatan.ResepRecyclerAdapter
import kotlinx.android.synthetic.main.list_resep3.*

class Activity_ke9 : AppCompatActivity() {
    private  lateinit var resepAdapter: ResepRecyclerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.list_resep3)
        initRecyclerView()
        tambahDataSet()
    }
    private  fun tambahDataSet(){
        val data = SumberData.buatSetData()
        resepAdapter.submitList(data)
    }

    private fun initRecyclerView() {
        recyler_view.apply {
            layoutManager = LinearLayoutManager(this@Activity_ke9)
            val spacingAtas = DekorasiSpasiGambar(20)
            addItemDecoration(spacingAtas)
            resepAdapter = ResepRecyclerAdapter()
            adapter = resepAdapter
        }
    }
}