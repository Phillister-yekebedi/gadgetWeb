package com.example.recyclerviews

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerviews.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()
        displayNamesList()
    }

    fun displayNamesList(){
        var names = listOf("Yekebedi","Ruth","Ssaru","Sarah","Cynthia",
            "Rebecca","Miriam","Linet", "Jacinta", "Dosantos", "Mercy","Joyce","Abigael")
        binding.rvName.layoutManager = LinearLayoutManager(this)
        val namesadapter = NamesRvAdapter(names)
        binding.rvName.adapter = namesAdapter
    }
}