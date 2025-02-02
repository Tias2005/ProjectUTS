package com.example.projectuts

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat.startActivity
import com.example.projectuts.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonProduk.setOnClickListener {
            val intent = Intent(this, ProdukActivity::class.java)
            startActivity(intent)
        }

        binding.buttonKaryawan.setOnClickListener {
            val intent = Intent(this, KaryawanActivity::class.java)
            startActivity(intent)
        }

        binding.buttonSuplier.setOnClickListener {
            val intent = Intent(this, SuplierActivity::class.java)
            startActivity(intent)
        }
    }
}