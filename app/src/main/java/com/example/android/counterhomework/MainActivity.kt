package com.example.android.counterhomework

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatTextView

private const val COUNTER_KEY = "COUNTER_KEY"

class MainActivity : AppCompatActivity() {
    private lateinit var counter: AppCompatTextView
    private var counterValue = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        counter = findViewById(R.id.textView)
        if (savedInstanceState != null) {
            counterValue = savedInstanceState.getInt(COUNTER_KEY)
            counter.text = counterValue.toString()
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt(COUNTER_KEY, counterValue)
    }

    fun incrementCounter(view: View) {
        ++counterValue
        counter.text = counterValue.toString()
    }
}

//Ответы на вопросЫ:

//Question 1
//If you run the homework app before implementing onSaveInstanceState(), what happens if you rotate
// the device? Choose one:
//
//Answer: The counter is reset to 0, but the contents of the EditText is preserved.

//Question 2
//What Activity lifecycle methods are called when a device-configuration change (such as rotation) occurs?
// Choose one:
//
//Answer: Android shuts down your Activity by calling onPause(), onStop(), and onDestroy(),
// and then starts it over again, calling onCreate(), onStart(), and onResume().

//Question 3
//When in the Activity lifecycle is onSaveInstanceState() called? Choose one:
//
//Answer: onSaveInstanceState() is called before the onStop() method.

//Question 4
//Which Activity lifecycle methods are best to use for saving data before the Activity is finished
// or destroyed? Choose one:
//
//Answer: onPause() or onStop()