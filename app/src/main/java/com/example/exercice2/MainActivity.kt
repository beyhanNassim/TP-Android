package com.example.exercice2

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // References to the buttons and the ImageView
        val imageView = findViewById<ImageView>(R.id.img)
        val redButton = findViewById<Button>(R.id.button)
        val greenButton = findViewById<Button>(R.id.button2)
        val blueButton = findViewById<Button>(R.id.button3)

        // Red button click listener
        redButton.setOnClickListener {
            imageView.setImageResource(R.drawable.android_red)
        }

        // Green button click listener
        greenButton.setOnClickListener {
            imageView.setImageResource(R.drawable.android_green)
        }

        // Blue button click listener
        blueButton.setOnClickListener {
            imageView.setImageResource(R.drawable.android_blue)
        }
    }
}
