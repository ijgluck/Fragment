package com.ijeoma.fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ijeoma.fragment.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}