package com.cindy.food

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.cindy.food.aceh.Activity_ke26
import com.cindy.food.bali.Activity_ke20
import com.cindy.food.bandarlampung.Activity_ke31
import com.cindy.food.bangkabelitung.Activity_ke30
import com.cindy.food.banten.Activity_ke2
import com.cindy.food.bengkulu.Activity_ke33
import com.cindy.food.jakarta.Activity_ke19
import com.cindy.food.jambi.Activity_ke29
import com.cindy.food.jambi.jambi
import com.cindy.food.jawabarat.Activity_ke18
import com.cindy.food.jawatenggah.Activity_ke5
import com.cindy.food.jawatimur.Activity_ke21
import com.cindy.food.kepulauanriau.Activity_ke32
import com.cindy.food.ntb.Activity_ke23
import com.cindy.food.ntt.Activity_ke22
import com.cindy.food.riau.Activity_ke3
import com.cindy.food.sumaterabarat.Activity_ke27
import com.cindy.food.sumateraselatan.Activity_ke28
import com.cindy.food.sumaterautara.Activity_ke25
import com.cindy.food.yogya.Activity_ke24

class sumatera : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstance: Bundle?
    ): View? {
        val i = inflater.inflate(R.layout.fragment_sumatera, container, false)
        val panggilSumateraUtara: Button = i.findViewById(R.id.Sumatera_Utara)

        panggilSumateraUtara.setOnClickListener {
            val intent = Intent(activity, Activity_ke25::class.java)
            startActivity(intent)
        }

        val panggilAceh: Button = i.findViewById(R.id.Aceh)

        panggilAceh.setOnClickListener {
            val intent = Intent(activity, Activity_ke26::class.java)
            startActivity(intent)
        }
        val panggilKepulauanRiau: Button = i.findViewById(R.id.KepulauanRiau)

        panggilKepulauanRiau.setOnClickListener {
            val intent = Intent(activity, Activity_ke32::class.java)
            startActivity(intent)
        }
        val panggilRiau: Button = i.findViewById(R.id.btnRiau)

        panggilRiau.setOnClickListener {
            val intent = Intent(activity, Activity_ke3::class.java)
            startActivity(intent)
        }
        val panggilSumateraBarat: Button = i.findViewById(R.id.Sumatera_Barat)

        panggilSumateraBarat.setOnClickListener {
            val intent = Intent(activity, Activity_ke27::class.java)
            startActivity(intent)
        }
        val panggilSumateraSelatan: Button = i.findViewById(R.id.Sumatera_Selatan)

        panggilSumateraSelatan.setOnClickListener {
            val intent = Intent(activity, Activity_ke28::class.java)
            startActivity(intent)
        }
        val panggilJambi: Button = i.findViewById(R.id.Jambi)

        panggilJambi.setOnClickListener {
            val intent = Intent(activity, Activity_ke29::class.java)
            startActivity(intent)
        }
        val panggilBangkaBelitung: Button = i.findViewById(R.id.BagkaBelitung)

        panggilBangkaBelitung.setOnClickListener {
            val intent = Intent(activity, Activity_ke30::class.java)
            startActivity(intent)
        }
        val panggilLampung: Button = i.findViewById(R.id.Lampung)

        panggilLampung.setOnClickListener {
            val intent = Intent(activity, Activity_ke31::class.java)
            startActivity(intent)
        }
        val panggilBengkulu: Button = i.findViewById(R.id.Bengkulu)

        panggilBengkulu.setOnClickListener {
            val intent = Intent(activity, Activity_ke33::class.java)
            startActivity(intent)
        }
        return i
    }

}