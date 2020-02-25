package com.admin.switchactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    companion object{
        const val KEY_MESSAGE = "message"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // store the entered text into local variable
        val message = edit_message.text

        btn_send_message.setOnClickListener {
            //prepare the intent
            val intent = Intent(this, ShowMessage::class.java)
            //store the string data into intent
            intent.putExtra(KEY_MESSAGE, message)
            //call startActivity() to move to the next activity/screen
            startActivity(intent)

            Toast.makeText(this, "message: $message", Toast.LENGTH_SHORT).show()
        }
    }
}
