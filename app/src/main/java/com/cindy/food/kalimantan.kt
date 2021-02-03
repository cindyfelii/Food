package com.cindy.food

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.cindy.food.kalimantanbarat.Activity_ke8
import com.cindy.food.kalimantanselatan.Activity_ke9
import com.cindy.food.kalimantantengah.Activity_ke10
import com.cindy.food.kalimantantimur.Activity_ke11
import com.cindy.food.kalimantanutara.Activity_ke4
import com.cindy.food.papuaa.Activity_ke6
import com.cindy.food.papuabarat.Activity_ke7

class kalimantan :Fragment() {
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

        val panggilKalimantanBarat: Button = i.findViewById(R.id.kalimantanBarat)

        panggilKalimantanBarat.setOnClickListener {
            val intent = Intent(activity, Activity_ke8::class.java)
            startActivity(intent)
        }
        val panggilKalimantanSelatan: Button = i.findViewById(R.id.kalimantanSelatan)

        panggilKalimantanSelatan.setOnClickListener {
            val intent = Intent(activity, Activity_ke9::class.java)
            startActivity(intent)
        }
        val panggilKalimantanTengah: Button = i.findViewById(R.id.kalimantanTengah)

        panggilKalimantanTengah.setOnClickListener {
            val intent = Intent(activity, Activity_ke10::class.java)
            startActivity(intent)
        }
        val panggilKalimantanTimur: Button = i.findViewById(R.id.kalimantanTimur)

        panggilKalimantanTimur.setOnClickListener {
            val intent = Intent(activity, Activity_ke11::class.java)
            startActivity(intent)
        }
        return i
    }

}
