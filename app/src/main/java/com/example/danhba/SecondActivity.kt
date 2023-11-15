package com.example.danhba

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val thumb = intent.getIntExtra("thumb", 0)
        val id = intent.getStringExtra("id")
        val name = intent.getStringExtra("name")
        val email = intent.getStringExtra("email")
        val number = intent.getStringExtra("number")

        findViewById<ImageView>(R.id.thumbImageView).setImageResource(thumb)
        findViewById<TextView>(R.id.idTextView).text = "ID: " + id
        findViewById<TextView>(R.id.nameTextView).text = "Tên: " + name
        findViewById<TextView>(R.id.numberTextView).text = "Phone number: " + number
        findViewById<TextView>(R.id.emailTextView).text = "Email: " + email
    }
}