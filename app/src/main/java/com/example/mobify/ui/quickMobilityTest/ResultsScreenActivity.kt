package com.example.mobify.ui.quickMobilityTest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.widget.Toolbar
import com.example.mobify.MainActivity
import com.example.mobify.R

class ResultsScreenActivity : AppCompatActivity() {
    private lateinit var resultsTextView: TextView
    private lateinit var finishButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_results_screen)

        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)

        resultsTextView = findViewById(R.id.resultsTextView)
        val results = intent.getStringExtra("results")
        resultsTextView.text = results

        finishButton = findViewById(R.id.finishButton)
        finishButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}