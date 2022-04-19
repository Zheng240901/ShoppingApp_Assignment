package com.example.assignment.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.assignment.databinding.FragmentOrderListingBinding

class orderListingFragment:Fragment() {
    private lateinit var binding: FragmentOrderListingBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        binding = FragmentOrderListingBinding.inflate(inflater, container, false)

        return binding.root
    }
}