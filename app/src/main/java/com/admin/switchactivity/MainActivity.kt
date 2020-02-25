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

        val message = edit_message.text
        btn_send_message.setOnClickListener {
            val intent = Intent(this, ShowMessage::class.java)
            intent.putExtra(KEY_MESSAGE, message)
            startActivity(intent)

            Toast.makeText(this, "message: $message", Toast.LENGTH_SHORT).show()
        }
    }
}
