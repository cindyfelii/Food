package com.cindy.food

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.cindy.food.bali.Activity_ke20
import com.cindy.food.banten.Activity_ke2
import com.cindy.food.jakarta.Activity_ke19
import com.cindy.food.jawabarat.Activity_ke18
import com.cindy.food.jawatenggah.Activity_ke5
import com.cindy.food.jawatimur.Activity_ke21
import com.cindy.food.kalimantanutara.Activity_ke4
import com.cindy.food.ntb.Activity_ke23
import com.cindy.food.ntt.Activity_ke22
import com.cindy.food.yogya.Activity_ke24

class jawa : Fragment() {
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

        val panggilJawaTenggah: Button = i.findViewById(R.id.btnJawaTengah)

        panggilJawaTenggah.setOnClickListener {
            val intent = Intent(activity, Activity_ke5::class.java)
            startActivity(intent)
        }
        val panggilJakarta: Button = i.findViewById(R.id.btnJakarta)

        panggilJakarta.setOnClickListener {
            val intent = Intent(activity, Activity_ke19::class.java)
            startActivity(intent)
        }
        val panggilJawaBarat: Button = i.findViewById(R.id.btnJawaBarat)

        panggilJawaBarat.setOnClickListener {
            val intent = Intent(activity, Activity_ke18::class.java)
            startActivity(intent)
        }
        val panggilBali: Button = i.findViewById(R.id.btnBali)

        panggilBali.setOnClickListener {
            val intent = Intent(activity, Activity_ke20::class.java)
            startActivity(intent)
        }
        val panggilJawaTimur: Button = i.findViewById(R.id.btnJawaTimur)

        panggilJawaTimur.setOnClickListener {
            val intent = Intent(activity, Activity_ke21::class.java)
            startActivity(intent)
        }
        val panggilNTT: Button = i.findViewById(R.id.btnNusaTenggaraTimur)

        panggilNTT.setOnClickListener {
            val intent = Intent(activity, Activity_ke22::class.java)
            startActivity(intent)
        }
        val panggilNTB: Button = i.findViewById(R.id.btnNusaTenggaraBarat)

        panggilNTB.setOnClickListener {
            val intent = Intent(activity, Activity_ke23::class.java)
            startActivity(intent)
        }
        val panggilYogyakarta: Button = i.findViewById(R.id.btnYogyakarta)

        panggilYogyakarta.setOnClickListener {
            val intent = Intent(activity, Activity_ke24::class.java)
            startActivity(intent)
        }
        return i
    }

    }

