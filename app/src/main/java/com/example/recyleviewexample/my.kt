package com.example.recyleviewexample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.recyleviewexample.databinding.FragmentMyBinding
import java.util.ArrayList
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyleviewexample.databinding.ActivityMainBinding


class my : Fragment() {
    private lateinit var binding: FragmentMyBinding
    private val ballList = ArrayList<Balls>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentMyBinding.inflate(layoutInflater)
        //setup our initial data
        initBallList()
        //configure
        val layoutManager = LinearLayoutManager(this)

        binding.recycleView.layoutManager = layoutManager
        val adapter = BallAdapter(ballList) //pass by reference
        binding.recycleView.adapter = adapter
        binding.recycleView.addItemDecoration(
            DividerItemDecoration(
                this,
                DividerItemDecoration.VERTICAL
            )
        )  //add a divider line


        return binding.root
    }

    private fun initBallList()//data class裡的格式
    {
        repeat(6) {
            ballList.add(Balls("Baseball", R.drawable.baseball))
            ballList.add(Balls("Basketball", R.drawable.basketball))
            ballList.add(Balls("Football", R.drawable.football))
            ballList.add(Balls("Other", R.drawable.other))
        }

    }

}
