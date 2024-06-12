package com.example.hello

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class FourtBirdActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_fourt_bird)

        val btnPrev5 = findViewById<ImageView>(R.id.btnPrev5)
        val btnNext5 = findViewById<ImageView>(R.id.btnNext5)


        btnPrev5.setOnClickListener {
            finish()
        }

        btnNext5.setOnClickListener {
            val intent = Intent( this,FithBirdActivity::class.java)
        }




    }
}