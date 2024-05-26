package com.example.galeria

import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(), View.OnClickListener{
    var imageview:ImageView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val linearlayout = findViewById<LinearLayout>(R.id.linearlayout)
         imageview = findViewById<ImageView>(R.id.imageview)



        for(i in 0 ..10) {
            val localView = ImageView(this)
            localView.layoutParams = ViewGroup.LayoutParams(300,300)
            localView.scaleType = ImageView.ScaleType.CENTER_INSIDE
            val resID = resources.getIdentifier("img$i", "drawable",packageName)
            localView.setImageResource(resID)
            localView.setOnClickListener(this)
            linearlayout.addView(localView)
        }


    }

    override fun onClick(v: View?) {
        val localView = v as ImageView
        imageview?.setImageDrawable(localView.drawable)
    }
}

