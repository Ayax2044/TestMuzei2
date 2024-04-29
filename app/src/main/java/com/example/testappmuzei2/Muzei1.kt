package com.example.testappmuzei2

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Muzei1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_muzei1)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        //1
        val b1 = findViewById<Button>(R.id.button1)
        val radioGroup1 = findViewById<RadioGroup>(R.id.radioGroup1)
        val t1: TextView = findViewById(R.id.textView1)
        val im1: ImageView = findViewById(R.id.imageView1)
        //2
        val b2: Button = findViewById(R.id.button2)
        val t2: TextView = findViewById(R.id.textView2)
        val radioGroup2: RadioGroup = findViewById(R.id.radioGroup2)
        val im2: ImageView = findViewById(R.id.imageView2)
        //3
        val b3: Button = findViewById(R.id.button3)
        val t3: TextView = findViewById(R.id.textView3)
        val radioGroup3: RadioGroup = findViewById(R.id.radioGroup3)
        val im3: ImageView = findViewById(R.id.imageView3)
        //4
        val b4: Button = findViewById(R.id.button4)
        val t4: TextView = findViewById(R.id.textView4)
        val radioGroup4: RadioGroup = findViewById(R.id.radioGroup4)
        val im4: ImageView = findViewById(R.id.imageView4)
        //5
        val b5: Button = findViewById(R.id.button5)
        val t5: TextView = findViewById(R.id.textView5)
        val radioGroup5: RadioGroup = findViewById(R.id.radioGroup5)
        val im5: ImageView = findViewById(R.id.imageView5)


        //1

        b1.setOnClickListener {
            // Получаем выбранный RadioButton из RadioGroup
            val selectedOptionId = radioGroup1.checkedRadioButtonId
            val radioButton = findViewById<RadioButton>(selectedOptionId)

            // Проверяем правильность ответа
            if (selectedOptionId == R.id.radio1)
            {
                Toast.makeText(this, "Правильно!", Toast.LENGTH_SHORT).show()
                radioGroup1.visibility = View.GONE
                t1.visibility = View.GONE
                im1.visibility = View.GONE
                b1.visibility = View.GONE


                b2.visibility = View.VISIBLE
                t2.visibility = View.VISIBLE
                radioGroup2.visibility = View.VISIBLE
                im2.visibility = View.VISIBLE
            }
            else
            {
                Toast.makeText(this, "Неправильно, попробуйте еще раз.", Toast.LENGTH_SHORT).show()
            }
        }

        //2

        b2.setOnClickListener {
            // Получаем выбранный RadioButton из RadioGroup
            val selectedOptionId = radioGroup2.checkedRadioButtonId
            val radioButton = findViewById<RadioButton>(selectedOptionId)

            // Проверяем правильность ответа
            if (selectedOptionId == R.id.radio5)
            {
                Toast.makeText(this, "Правильно!", Toast.LENGTH_SHORT).show()
                radioGroup2.visibility = View.GONE
                t2.visibility = View.GONE
                im2.visibility = View.GONE
                b2.visibility = View.GONE


                b3.visibility = View.VISIBLE
                t3.visibility = View.VISIBLE
                radioGroup3.visibility = View.VISIBLE
                im3.visibility = View.VISIBLE
            }
            else
            {
                Toast.makeText(this, "Неправильно, попробуйте еще раз.", Toast.LENGTH_SHORT).show()
            }
        }

        //3

        b3.setOnClickListener {
            // Получаем выбранный RadioButton из RadioGroup
            val selectedOptionId = radioGroup3.checkedRadioButtonId
            val radioButton = findViewById<RadioButton>(selectedOptionId)

            // Проверяем правильность ответа
            if (selectedOptionId == R.id.radio7)
            {
                Toast.makeText(this, "Правильно!", Toast.LENGTH_SHORT).show()
                radioGroup3.visibility = View.GONE
                t3.visibility = View.GONE
                im3.visibility = View.GONE
                b3.visibility = View.GONE

                b4.visibility = View.VISIBLE
                t4.visibility = View.VISIBLE
                radioGroup4.visibility = View.VISIBLE
                im4.visibility = View.VISIBLE
            }
            else
            {
                Toast.makeText(this, "Неправильно, попробуйте еще раз.", Toast.LENGTH_SHORT).show()
            }
        }

        //4

        b4.setOnClickListener {
            // Получаем выбранный RadioButton из RadioGroup
            val selectedOptionId = radioGroup4.checkedRadioButtonId
            val radioButton = findViewById<RadioButton>(selectedOptionId)

            // Проверяем правильность ответа
            if (selectedOptionId == R.id.radio12)
            {
                Toast.makeText(this, "Правильно!", Toast.LENGTH_SHORT).show()
                radioGroup4.visibility = View.GONE
                t4.visibility = View.GONE
                im4.visibility = View.GONE
                b4.visibility = View.GONE

                b5.visibility = View.VISIBLE
                t5.visibility = View.VISIBLE
                radioGroup5.visibility = View.VISIBLE
                im5.visibility = View.VISIBLE
            }
            else
            {
                Toast.makeText(this, "Неправильно, попробуйте еще раз.", Toast.LENGTH_SHORT).show()
            }
        }

        //5

        b5.setOnClickListener {
            // Получаем выбранный RadioButton из RadioGroup
            val selectedOptionId = radioGroup5.checkedRadioButtonId
            val radioButton = findViewById<RadioButton>(selectedOptionId)

            // Проверяем правильность ответа
            if (selectedOptionId == R.id.radio14)
            {
                Toast.makeText(this, "Правильно!", Toast.LENGTH_SHORT).show()
                radioGroup5.visibility = View.GONE
                t5.visibility = View.GONE
                im5.visibility = View.GONE
                b5.visibility = View.GONE

                b1.visibility = View.VISIBLE
                t1.visibility = View.VISIBLE
                radioGroup1.visibility = View.VISIBLE
                im1.visibility = View.VISIBLE

            }
            else
            {
                Toast.makeText(this, "Неправильно, попробуйте еще раз.", Toast.LENGTH_SHORT).show()
            }
        }
    }
}