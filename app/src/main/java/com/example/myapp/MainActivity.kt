package com.example.myapp

import android.os.Bundle
import android.view.LayoutInflater
import android.widget.FrameLayout
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val contentContainer: FrameLayout = findViewById(R.id.content_container)
        val homeLayout: LinearLayout = findViewById(R.id.home_layout)
        val profileLayout: LinearLayout = findViewById(R.id.profile_layout)
        val loginLayout: LinearLayout = findViewById(R.id.login_layout)

        // Inflate and set the default layout if needed
        val inflater = LayoutInflater.from(this)
        contentContainer.addView(inflater.inflate(R.layout.fragment_home, contentContainer, false))

        homeLayout.setOnClickListener {
            // Remove the current view and load the Home layout
            contentContainer.removeAllViews()
            contentContainer.addView(inflater.inflate(R.layout.fragment_home, contentContainer, false))
        }

        profileLayout.setOnClickListener {
            // Remove the current view and load the Profile layout
            contentContainer.removeAllViews()
            contentContainer.addView(inflater.inflate(R.layout.fragment_profile, contentContainer, false))
        }

        loginLayout.setOnClickListener {
            // Remove the current view and load the Profile layout
            contentContainer.removeAllViews()
            contentContainer.addView(inflater.inflate(R.layout.fragment_login, contentContainer, false))
        }

        //test


    }
}


