package com.dewakoding.tutorialapplink

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dewakoding.tutorialapplink.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btnPindah.setOnClickListener {
            val str = "dewakoding://main2"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(str))
            startActivity(intent)
        }

        binding.btnPindah3.setOnClickListener {
            val str = "dewakoding://main3"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(str))
            startActivity(intent)
        }
    }
}