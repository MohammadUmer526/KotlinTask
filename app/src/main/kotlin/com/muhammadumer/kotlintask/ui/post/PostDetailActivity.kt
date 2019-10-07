package com.muhammadumer.kotlintask.ui.post

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.muhammadumer.kotlintask.R

import kotlinx.android.synthetic.main.activity_item_body.*


class PostDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_item_body)

        // get the body of the item
        val getBody: String = intent.getStringExtra("body")
        item_body.setText(getBody)
    }
}
