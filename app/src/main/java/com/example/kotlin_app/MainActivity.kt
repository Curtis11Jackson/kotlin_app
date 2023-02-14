package com.example.kotlin_app

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    // Button
    val button = findViewById<Button>(R.id.start_new_activity_btn)
    // Action
    button.setOnClickListener{
        val intent = Intent(this, NewActivity::class.java)

        // Add action
        intent.action = Intent.ACTION_VIEW

        // Add category
        intent.addCategory("user")

        // Add Extra
        intent.putExtra("name", "value")
        intent.putExtra("age", 31)

        startActivity(intent)
    }

        // New button for parcelable
        var profile = Profile("Alban", 25)
        val buttonParcelable = findViewById<Button>(R.id.my_profile_btn)
        buttonParcelable.setOnClickListener{
            val intentProfile = Intent(this, ProfileDetailsActivity::class.java)
            intentProfile.putExtra("profile", profile)
            startActivity(intentProfile)
        }





    // Log
    val tag = "MainActivity"
    Log.v(tag, "Verbose message")
    Log.d(tag, "Debug message")
    Log.println(Log.ASSERT, tag, "Assert message")
    }
}