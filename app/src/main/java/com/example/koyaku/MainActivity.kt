package com.example.koyaku

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import kotlinx.android.synthetic.main.activity_main.*
import android.widget.Button

class MainActivity : AppCompatActivity() {
    var bellNum = 0
    var wmNum = 0
    var cherryNum = 0
    var chanceNum = 0
    var gameNum = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //ゲーム数のボタンを押したときの動作
        gameCnt.setOnClickListener {
            if(editText.text.toString().isNotEmpty()) {
                gameNum = Integer.parseInt(editText.text.toString())
                if (bellNum != 0) {
                    bellValue.setText(Integer.toString(gameNum / bellNum))
                }
                if (wmNum != 0) {
                    wmValue.setText(Integer.toString(gameNum / wmNum))
                }
                if (chanceNum != 0) {
                    cherryValue.setText(Integer.toString(gameNum / cherryNum))
                }
                if (chanceNum != 0) {
                    chanceValue.setText(Integer.toString(gameNum / chanceNum))
                }
            }
        }

        //カウンターの動作
        bellButton.setOnClickListener {
            bellNum += 1
            bellCnt.setText(Integer.toString(bellNum))
            bellValue.setText(Integer.toString(gameNum/bellNum))
        }
        wmButton.setOnClickListener {
            wmNum += 1
            wmCnt.setText(Integer.toString(wmNum))
            wmValue.setText(Integer.toString(gameNum/wmNum))
        }
        cherryButton.setOnClickListener {
            cherryNum += 1
            cherryCnt.setText(Integer.toString(cherryNum))
            cherryValue.setText(Integer.toString(gameNum/cherryNum))
        }
        chanceButton.setOnClickListener {
            chanceNum += 1
            chanceCnt.setText(Integer.toString(chanceNum))
            chanceValue.setText(Integer.toString(gameNum/chanceNum))
        }
    }
}
