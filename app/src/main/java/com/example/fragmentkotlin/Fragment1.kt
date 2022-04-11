package com.example.fragmentkotlin

import android.app.Activity
import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.fragmentkotlin.databinding.Fragment1Binding

class Fragment1 : Fragment() {
    private lateinit var binding : Fragment1Binding
    private lateinit var activity : Activity
    private var communication : Communication? = null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = Fragment1Binding.inflate(inflater, container, false)
        binding.button.setOnClickListener {
            communication?.send(binding.editText.text.toString())
        }
        return binding.root
    }

    interface  Communication {
        fun send (nom : String?)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        activity = context as Activity
        if (activity is Communication) {
            communication = activity as Communication;
        }
    }

}