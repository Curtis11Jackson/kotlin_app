package com.example.kotlin_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ProfileDetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile_details)

        val profile:Profile = intent.getParcelableExtra("profile")!!
        val nameTextView = findViewById<TextView>(R.id.name)
        val ageTextView = findViewById<TextView>(R.id.age)

        nameTextView.setText("Nom : ${profile?.name}")
        ageTextView.setText("Age : ${profile?.age}")
    }
}