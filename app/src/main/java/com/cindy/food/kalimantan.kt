package com.cindy.food

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.cindy.food.kalimantanutara.Activity_ke4

class kalimantan: Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstance: Bundle?
    ): View? {
        val i = inflater.inflate(R.layout.fragment_kalimantan, container, false)
        val panggilKalimantanUtara: Button = i.findViewById(R.id.btnkalimantanUtara)

        panggilKalimantanUtara.setOnClickListener {
            val intent = Intent(activity, Activity_ke4::class.java)
            startActivity(intent)
        }
        return i
    }
}