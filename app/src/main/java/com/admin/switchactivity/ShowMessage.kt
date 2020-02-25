package com.admin.switchactivity


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_show_message.*

class ShowMessage : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show_message)

        val msg = intent?.extras?.get(MainActivity.KEY_MESSAGE)

        text_showMessage.text = "hey $msg"

    }
}
