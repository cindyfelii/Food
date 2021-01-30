package com.cindy.food

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toolbar: Toolbar = findViewById(R.id.toolbar_awal)
        setSupportActionBar(toolbar)
        supportActionBar!!.title = ""

        val tabLayout: TabLayout = findViewById(R.id.tab_layout)
        val viewPager: ViewPager = findViewById(R.id.view_pager)
        val viewPagerAdapter = ViewPagerAdapter(supportFragmentManager)

        viewPagerAdapter.tambahFragment(sumatera(), "Sumatera")
        viewPagerAdapter.tambahFragment(jawa(), "Jawa")
        viewPagerAdapter.tambahFragment(kalimantan(), "Kalimantan")
        viewPagerAdapter.tambahFragment(sulawesi(), "Sulawesi")
        viewPagerAdapter.tambahFragment(papua(), "Papua")
        viewPager.adapter = viewPagerAdapter
        tabLayout.setupWithViewPager(viewPager)
    }

    internal class ViewPagerAdapter(fragmentManager: FragmentManager): FragmentPagerAdapter(
        fragmentManager, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT
    ) {

        private val fragments: ArrayList<Fragment>
        private val juduls: ArrayList<String>

        init {
            fragments = ArrayList()
            juduls = ArrayList()
        }

        override fun getCount(): Int {
            return fragments.size
        }

        override fun getItem(position: Int): Fragment {
            return fragments[position]
        }

        fun tambahFragment(fragment: Fragment, judul: String) {
            fragments.add(fragment)
            juduls.add(judul)
        }

        override fun getPageTitle(position: Int): CharSequence? {
            return juduls[position]
        }
    }
}