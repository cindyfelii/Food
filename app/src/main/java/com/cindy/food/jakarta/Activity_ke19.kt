package com.cindy.food.jakarta

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.cindy.food.R
import com.cindy.food.jakarta.DekorasiSpasiGambar
import com.cindy.food.jakarta.SumberData
import com.cindy.food.jakarta.ResepRecyclerAdapter
import kotlinx.android.synthetic.main.list_resep17.*

class Activity_ke19 : AppCompatActivity() {
    private  lateinit var resepAdapter: ResepRecyclerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.list_resep17)
        initRecyclerView()
        tambahDataSet()
    }
    private  fun tambahDataSet(){
        val data = SumberData.buatSetData()
        resepAdapter.submitList(data)
    }

    private fun initRecyclerView() {
        recyler_view.apply {
            layoutManager = LinearLayoutManager(this@Activity_ke19)
            val spacingAtas = DekorasiSpasiGambar(20)
            addItemDecoration(spacingAtas)
            resepAdapter = ResepRecyclerAdapter()
            adapter = resepAdapter
        }
    }
}