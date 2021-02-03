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

class sulawesi: Fragment() {
    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstance: Bundle?
    ): View? {
        val i = inflater.inflate(R.layout.fragment_sulawesi, container, false)
        val panggilKalimantanUtara: Button = i.findViewById(R.id.SulawesiBarat)

        panggilKalimantanUtara.setOnClickListener {
            val intent = Intent(activity, Activity_ke4::class.java)
            startActivity(intent)
        }

        val panggilKalimantanBarat: Button = i.findViewById(R.id.SulawesiSelatan)

        panggilKalimantanBarat.setOnClickListener {
            val intent = Intent(activity, Activity_ke8::class.java)
            startActivity(intent)
        }
        val panggilKalimantanSelatan: Button = i.findViewById(R.id.SulawesiTengah)

        panggilKalimantanSelatan.setOnClickListener {
            val intent = Intent(activity, Activity_ke9::class.java)
            startActivity(intent)
        }
        val panggilKalimantanTengah: Button = i.findViewById(R.id.SulawesiTenggara)

        panggilKalimantanTengah.setOnClickListener {
            val intent = Intent(activity, Activity_ke10::class.java)
            startActivity(intent)
        }
        val panggilKalimantanTimur: Button = i.findViewById(R.id.SulawesiUtara)

        panggilKalimantanTimur.setOnClickListener {
            val intent = Intent(activity, Activity_ke11::class.java)
            startActivity(intent)
        }
        val panggilGorontalo: Button = i.findViewById(R.id.Gorontalo)

        panggilGorontalo.setOnClickListener {
            val intent = Intent(activity, Activity_ke11::class.java)
            startActivity(intent)
        }
        return i
    }

}
