package com.example.inc_dec

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.inc_dec.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportFragmentManager.beginTransaction().add(binding.fragmentContainer.id,MainFragment()).commit()

    }
}