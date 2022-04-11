package com.example.fragmentkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.fragmentkotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), Fragment1.Communication {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }

    override fun send(nom: String?) {
        binding.activityTextView.text = nom
        val fragment2 = supportFragmentManager.findFragmentById(R.id.fragmentContainerView2) as Fragment2
        fragment2.received(nom)
    }
}