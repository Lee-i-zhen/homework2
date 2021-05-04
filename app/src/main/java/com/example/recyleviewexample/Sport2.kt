package com.example.recyleviewexample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment
import com.example.recyleviewexample.databinding.FragmentSport2Binding

class Sport2 : Fragment() {
    private lateinit var binding: FragmentSport2Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentSport2Binding.inflate(layoutInflater)
        val args = Sport2Args.fromBundle(requireArguments())
        binding.sportname2.text = args.name

        if(args.name == "Baseball")
        {
             binding.sportimage2.setImageResource(R.drawable.baseball_photo)
        }
        if(args.name == "Basketball")
        {
            binding.sportimage2.setImageResource(R.drawable.basketball_photo)
        }
        if(args.name == "Football")
        {
            binding.sportimage2.setImageResource(R.drawable.football_photo)
        }
        if(args.name == "Other")
        {
            binding.sportimage2.setImageResource(R.drawable.other_photo)
        }

        return binding.root
    }

}