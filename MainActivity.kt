// MainActivity.kt

package com.example.nebulaschool

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.view.WindowManager

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Set the layout for the activity
        setContentView(R.layout.activity_main)

        // Enabling the liquid glass effect
        window.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS)
    }
}