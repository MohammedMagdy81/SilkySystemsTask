package com.example.silkysystemstask

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.silkysystemstask.adapters.HomePagerAdapter
import com.example.silkysystemstask.databinding.ActivityMainBinding
import com.example.silkysystemstask.ui.HomeFragment
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setUpTabsWithViewPager()

    }
    private fun setUpTabsWithViewPager() {
        val categories = arrayListOf(
            HomeFragment(),
            HomeFragment(),
            HomeFragment(),
            HomeFragment(),

        )
        binding.homeViewPager.isUserInputEnabled = false
        val tabsAdapter = HomePagerAdapter(lifecycle, supportFragmentManager, categories)
        binding.homeViewPager.adapter = tabsAdapter

        TabLayoutMediator(binding.homeTablayout, binding.homeViewPager) { tab, position ->
            when (position) {
                0 -> tab.text = getString(R.string.today)
                1 -> tab.text = getString(R.string.this_week)
                2 -> tab.text = getString(R.string.this_month)
                3 -> tab.text = getString(R.string.this_year)
            }

        }.attach()
    }
}