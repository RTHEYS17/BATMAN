package com.example.weatherapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class change : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_change)
        val weeklyWeather = arrayOf(
            WeatherInfo("Sunny", 25),        // Sunday
            WeatherInfo("Cloudy", 20),       // Monday
            WeatherInfo("Rainy", 18),        // Tuesday
            WeatherInfo("Sunny", 22),        // Wednesday
            WeatherInfo("Thunderstorm", 19), // Thursday
            WeatherInfo("Cloudy", 21),       // Friday
            WeatherInfo("Sunny", 24)         // Saturday
        )

        // Define an array to hold the days of the week
        val daysOfWeek = arrayOf(
            "Sunday",
            "Monday",
            "Tuesday",
            "Wednesday",
            "Thursday",
            "Friday",
            "Saturday"
        )

        @SuppressLint("MissingInflatedId")
        fun onCreate(savedInstanceState: Bundle?) {
            setContentView(R.layout.activity_change)

            // Find the views by their IDs
            val dayInput = findViewById<EditText>(R.id.dayInput)
            val displayButton = findViewById<Button>(R.id.displayButton)
            val displayTextView = findViewById<TextView>(R.id.display)

            // Set an OnClickListener on the button
            displayButton.setOnClickListener {
                val day = dayInput.text.toString().capitalize()

                // Find the index of the day in the daysOfWeek array
                val index = daysOfWeek.indexOf(day)

                if (index != -1) {
                    // Get the corresponding weather information
                    val weather = weeklyWeather[index]
                    // Display the weather information
                    displayTextView.text = "$day: ${weather.condition}, ${weather.temperature}°C"
                } else {
                    // Display an error message if the day is not found
                    displayTextView.text = "Invalid day. Please enter a valid day of the week."
                }
            }
        }
    }
}



