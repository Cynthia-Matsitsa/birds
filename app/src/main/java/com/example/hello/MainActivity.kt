package com.example.hello

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.hello.databinding.ActivityFithBirdBinding
import com.example.hello.databinding.ActivityMainBinding
import com.squareup.picasso.Picasso

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val btnNext = findViewById<ImageView>(R.id.btnNext)
        binding.btnNext.setOnClickListener {
            val intent = Intent(this, SecondBirdActivity::class.java)
            startActivity(intent)
        }

        Picasso
            .get()
            .load("data:image/jpeg;base64,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")

            .into(binding.imageView7)





    }
}