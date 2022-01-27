package com.example.colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.util.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val view1 = findViewById<TextView>(R.id.box_one)
        val view2 = findViewById<TextView>(R.id.box_two)
        val view3 = findViewById<TextView>(R.id.box_three)
        val view4 = findViewById<TextView>(R.id.box_four)
        val view5 = findViewById<TextView>(R.id.box_five)
        val buttonBrown = findViewById<Button>(R.id.brown)
        val buttonGreen = findViewById<Button>(R.id.green)
        val buttonPurple = findViewById<Button>(R.id.purple)
        var color = Color.parseColor(randomColor())

        view1.setOnClickListener {
            view1.setBackgroundColor(color)
            color =  Color.parseColor(randomColor())
            }
        view2.setOnClickListener {
            view2.setBackgroundColor(color)
            color =  Color.parseColor(randomColor())
        }
        view3.setOnClickListener {
            view3.setBackgroundColor(color)
            color =  Color.parseColor(randomColor())
        }
        view4.setOnClickListener {
            view4.setBackgroundColor(color)
            color =  Color.parseColor(randomColor())
        }
        view5.setOnClickListener {
            view5.setBackgroundColor(color)
            color =  Color.parseColor(randomColor())
        }
        buttonBrown.setOnClickListener{
            color = resources.getColor(R.color.brown)
        }
        buttonGreen.setOnClickListener{
            color = resources.getColor(R.color.green)
        }
        buttonPurple.setOnClickListener{
            color = resources.getColor(R.color.purple)
        }
    }

    private fun randomColor(): String {
        val random = Random()
        val line = "0123456789ABCDEF"
        var color = ""
        for (i in 0..5) {
            val num = random.nextInt(15)
            color += line[num]
        }
        return "#$color"
    }
}