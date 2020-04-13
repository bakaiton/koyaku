package com.example.koyaku

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import android.widget.Button

class MainActivity : AppCompatActivity() {
    var bellNum = 0
    var wmNum = 0
    var cherryNum = 0
    var chanceNum = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        bellButton.setOnClickListener {
            bellNum += 1
            bellCnt.setText(Integer.toString(bellNum))
        }
        wmButton.setOnClickListener {
            wmNum += 1
            wmCnt.setText(Integer.toString(wmNum))
        }
        cherryButton.setOnClickListener {
            cherryNum += 1
            cherryCnt.setText(Integer.toString(cherryNum))
        }
        chanceButton.setOnClickListener {
            chanceNum += 1
            chanceCnt.setText(Integer.toString(chanceNum))
        }
    }
}
