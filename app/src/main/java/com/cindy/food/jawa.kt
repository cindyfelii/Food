package com.cindy.food

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.cindy.food.banten.Activity_ke2

class jawa: Fragment() {
    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstance: Bundle?
    ): View? {
        val i = inflater.inflate(R.layout.fragment_jawa, container, false)
        val panggilBanten: Button = i.findViewById(R.id.btnBanten)

        panggilBanten.setOnClickListener {
            val intent = Intent(activity, Activity_ke2::class.java)
            startActivity(intent)
        }
        return i
    }
}

