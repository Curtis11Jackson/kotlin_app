package com.example.kotlin_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class NewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new)

        // Define my actions
        var action = intent.action

        // Category
        val isUserNew = intent.hasCategory("user")

        // Load the Extras
        val extras: Bundle? = intent.extras

        val name = extras?.getString("name")
        val age = extras?.getInt("age")

        val tags = "Logs"

        Log.i(tags, "action: $action, isUserNew: $isUserNew, name: $name, age: $age")
    }
}