package com.example.fragmentkotlin

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.fragmentkotlin.databinding.Fragment2Binding

class Fragment2 : Fragment() {

    private lateinit var binding : Fragment2Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = Fragment2Binding.inflate(inflater);
        return binding.root
    }

    fun received (name : String?) {
        binding.fragment2TextView.text = name
    }

}