package com.cindy.food

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.cindy.food.riau.Activity_ke3

class sumatera: Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstance: Bundle?
    ): View? {
        val i = inflater.inflate(R.layout.fragment_sumatera, container, false)
        val panggilRiau: Button = i.findViewById(R.id.btnRiau)

        panggilRiau.setOnClickListener {
            val intent = Intent(activity, Activity_ke3::class.java)
            startActivity(intent)
        }
        return i
    }
}