package com.example.toastandsnack

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Button
import android.widget.Toast
import com.example.toastandsnack.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    //@SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        //var btntoast = findViewById<Button>(R.id.btntoast)
        binding.btntoast.setOnClickListener {
            Toast.makeText(this,"Hola soy un toast", Toast.LENGTH_SHORT).show()
        }
        binding.btnsnack.setOnClickListener {
            Snackbar.make(it, "Hola soy un snackbar", Snackbar.LENGTH_SHORT).show()
        }


    }



}