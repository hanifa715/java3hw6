package com.example.java3hw6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.java3hw6.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportFragmentManager.beginTransaction().add(R.id.container_music,MusicFragment()).commit()
        supportFragmentManager.beginTransaction().add(R.id.container,ImageFragment()).commit()
    }
}