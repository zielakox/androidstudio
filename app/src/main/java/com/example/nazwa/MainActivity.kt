package com.example.nazwa

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var textView0: TextView
    private lateinit var textView1: TextView
    private lateinit var textView2: TextView
    private lateinit var textView3: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView0 = findViewById(R.id.textView0)
        textView0.text = "Witam Towarzyszy"


        textView1 = findViewById(R.id.textView1)
        textView2 = findViewById(R.id.textView2)
        textView3 = findViewById(R.id.textView3)

        val myButton: Button = findViewById(R.id.myButton)
        val button1: Button = findViewById(R.id.button1)
        val button2: Button = findViewById(R.id.button2)

        myButton.setOnClickListener {
            textView1.text = "Hello World"
        }

        button1.setOnClickListener {
            textView2.text = "Michal Pacholski"
        }

        button2.setOnClickListener {
            textView3.text = "Goodbye"
        }
    }
}
