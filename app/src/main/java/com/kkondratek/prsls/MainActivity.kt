package com.kkondratek.prsls

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun playButtonPressed(view: View?) {
        val intent = Intent(this, GameplayActivity::class.java)
        startActivity(intent)
    }
}
