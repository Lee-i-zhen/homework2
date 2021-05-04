package com.example.recyleviewexample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.recyleviewexample.databinding.ActivityMainBinding
import com.example.recyleviewexample.databinding.FragmentMyBinding
import com.example.recyleviewexample.databinding.FragmentSportBinding


class sport : Fragment() {

    private lateinit var binding: FragmentSportBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentSportBinding.inflate(layoutInflater)
        return inflater.inflate(R.layout.fragment_sport, container, false)
    }

}