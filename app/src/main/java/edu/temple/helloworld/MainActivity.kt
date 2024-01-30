package edu.temple.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    // Declare view properties - the first one is done for you
    lateinit var displayTextView: TextView
    lateinit var click : Button
    lateinit var edit: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize with views defined in Layout - the first one is done for you
        displayTextView = findViewById(R.id.displayTextView)
        click = findViewById(R.id.clickMeButton)
        edit = findViewById(R.id.nameEditText)
        
        // Respond to button click event per specifications
        click.setOnClickListener{
            val name =edit.text.toString()
            displayTextView.text= "Hello, $name"
        }

    }
}