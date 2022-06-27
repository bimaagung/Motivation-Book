package com.bimaagung.bukumotivasi

import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_about.*
import kotlinx.android.synthetic.main.activity_main.*


class About : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        datatoolbar.setNavigationIcon(R.drawable.ic_arrow_back_black_24dp)

        datatoolbar.setNavigationOnClickListener{
            onBackPressed()
        }

    }


}
