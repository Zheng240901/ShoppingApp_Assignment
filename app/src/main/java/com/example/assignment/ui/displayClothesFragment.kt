package com.example.assignment.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.assignment.databinding.FragmentDisplayClothesBinding



class displayClothesFragment : Fragment() {

    private lateinit var binding: FragmentDisplayClothesBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        binding = FragmentDisplayClothesBinding.inflate(inflater, container, false)

        return binding.root
    }

}