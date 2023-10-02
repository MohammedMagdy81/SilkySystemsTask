package com.example.silkysystemstask.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.silkysystemstask.adapters.HomeAdapter
import com.example.silkysystemstask.data.DataSource
import com.example.silkysystemstask.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {


    private lateinit var binding: FragmentHomeBinding

    private val homeAdapter by lazy { HomeAdapter(emptyList()) }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentHomeBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupData()


    }

    private fun setupData() {
        val itemsList = DataSource.homeItemList()
        homeAdapter.setData(itemsList)
        binding.homeRv.adapter= homeAdapter
    }

}