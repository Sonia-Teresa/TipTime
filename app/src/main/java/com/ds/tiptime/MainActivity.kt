package com.ds.tiptime

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ds.tiptime.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var  binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        setContentView(R.layout.activity_main)
    }
}
