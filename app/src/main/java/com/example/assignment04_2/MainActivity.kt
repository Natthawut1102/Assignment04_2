package com.example.assignment04_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            var credit1 = editTextNumber.text.toString()
            var credit2 = editTextNumber2.text.toString()
            var credit3 = editTextNumber3.text.toString()
            var credit4 = editTextNumber4.text.toString()
            var credit5 = editTextNumber5.text.toString()
            var point1 = editTextNumberDecimal.text.toString()
            var point2 = editTextNumberDecimal.text.toString()
            var point3 = editTextNumberDecimal.text.toString()
            var point4 = editTextNumberDecimal.text.toString()
            var point5 = editTextNumberDecimal.text.toString()

            if (credit1.isEmpty() || credit2.isEmpty() || credit3.isEmpty() || credit4.isEmpty() || credit5.isEmpty())
                return@setOnClickListener Toast.makeText(this@MainActivity, "Please Input All Text Box Before Press OK !!!", Toast.LENGTH_SHORT).show()

            if (point1.isEmpty() || point2.isEmpty() || point3.isEmpty() || point4.isEmpty() || point5.isEmpty())
                return@setOnClickListener Toast.makeText(this@MainActivity, "Please Input All Text Box Before Press OK !!!", Toast.LENGTH_SHORT).show()

            if (editTextTextPersonName.text.isEmpty() || editTextTextPersonName2.text.isEmpty() || editTextTextPersonName3.text.isEmpty() || editTextTextPersonName4.text.isEmpty() || editTextTextPersonName5.text.isEmpty())
                return@setOnClickListener Toast.makeText(this@MainActivity, "Please Input All Text Box Before Press OK !!!", Toast.LENGTH_SHORT).show()

            var total = credit1.toInt() + credit2.toInt() + credit3.toInt() + credit4.toInt() + credit5.toInt()
            textView14.text = total.toString()

            var sum = 0.0
            sum += (credit1.toDouble() * point1.toDouble())
            sum += (credit2.toDouble() * point2.toDouble())
            sum += (credit3.toDouble() * point3.toDouble())
            sum += (credit4.toDouble() * point4.toDouble())
            sum += (credit5.toDouble() * point5.toDouble())
            textView15.text = String.format("%.2f", sum / total)
        }

        button2.setOnClickListener {
            editTextNumber.text.clear()
            editTextNumber2.text.clear()
            editTextNumber3.text.clear()
            editTextNumber4.text.clear()
            editTextNumber5.text.clear()
            editTextNumberDecimal.text.clear()
            editTextNumberDecimal2.text.clear()
            editTextNumberDecimal3.text.clear()
            editTextNumberDecimal4.text.clear()
            editTextNumberDecimal5.text.clear()
            editTextTextPersonName.text.clear()
            editTextTextPersonName2.text.clear()
            editTextTextPersonName3.text.clear()
            editTextTextPersonName4.text.clear()
            editTextTextPersonName5.text.clear()
            textView14.text = ""
            textView15.text = ""
        }
    }
}