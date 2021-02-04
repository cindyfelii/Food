package com.cindy.food

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.cindy.food.papuaa.Activity_ke6
import com.cindy.food.papuabarat.Activity_ke7

class papua: Fragment() {
    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstance: Bundle?
    ): View? {
        val i = inflater.inflate(R.layout.fragment_papua, container, false)
        val panggilPapua: Button = i.findViewById(R.id.btnPapua)

        panggilPapua.setOnClickListener {
            val intent = Intent(activity, Activity_ke6::class.java)
            startActivity(intent)
        }

        val panggilPapuaBarat: Button = i.findViewById(R.id.btnPapuaBarat)

        panggilPapuaBarat.setOnClickListener {
            val intent = Intent(activity, Activity_ke7::class.java)
            startActivity(intent)
        }
        return i
    }

}

