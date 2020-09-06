package com.example.omikuzi_app

import android.graphics.Color
import android.graphics.Color.RED
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        idを指定して、ClickListenerを呼び出している
        getOmikujiButton.setOnClickListener{
//            Log.v("MainActivity", "Button clicked!")
//            引数以下の数字で乱数が作られる
//            val n = Random().nextInt(5)
            val results = arrayOf("大吉","中吉","吉","小吉","凶")
            val n = Random().nextInt(results.count());

            if(n ==0){
//              resultTextView.setTextColor(RED)
                resultTextView.setTextColor(Color.parseColor("#FF0000"))
                resultTextView.setTextColor(Color.argb(255,255,0,0))
            }else{
                resultTextView.setTextColor(Color.parseColor("#808080"))
            }
//            resultTextViewの値を更新
            resultTextView.text = results.get(n)
        }
    }
}