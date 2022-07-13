package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<ImageButton>(R.id.Wavebutton)
        button.setOnClickListener {
            Log.v("hello world","ButtonClicked")
            Toast.makeText(this, "HI!! pleasure to meet you", Toast.LENGTH_SHORT).show()
        }
    }

}