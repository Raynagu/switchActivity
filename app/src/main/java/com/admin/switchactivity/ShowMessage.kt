package com.admin.switchactivity


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_show_message.*

class ShowMessage : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show_message)

        // get the data from intent
        val msg = intent?.extras?.get(MainActivity.KEY_MESSAGE)
        // show the received string in text view
        text_showMessage.text = "hey $msg"

    }
}
