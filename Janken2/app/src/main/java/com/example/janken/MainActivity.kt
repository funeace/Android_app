package com.example.janken

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*
import android.util.Log
import java.util.*
import kotlin.Array as Array1

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//      じゃんけんの手を作成(グー・チョキ・パー）
        val hands = arrayOf("ぐー","ちょき","ぱー")

//        じゃんけんのチェック用ファンクション
        fun checkJanken(my: Int, enemy: Int): Pair<String, String> {
            if(my == 0){  //goo
                if(enemy == 0)
                    return ("あいこ" to "#F0F0F0")
                else if(enemy == 1){
                    return ("かち" to "#FF0000")
                } else {
                    return ("まけ" to "#0000FF")
                }
            }else if( my == 1){ //scissors
                if(enemy == 0) { //
                    return Pair("まけ","#0000FF")
                } else if(enemy == 1){
                    return Pair("あいこ","#F0F0F0")
                } else {
                    return Pair("かち","#FF0000")
                }
            }else{ // paper
                if(enemy == 0) { //
                    return Pair("かち","#FF0000")
                } else if(enemy == 1){
                    return Pair("まけ","#0000FF")
                } else {
                    return Pair("あいこ","#F0F0F0")
                }
            }
        }
        rock.setOnClickListener{
            val n = Random().nextInt(3)
            val result = checkJanken(0,n)
            janken_result.text = result.first
            janken_result.setTextColor(Color.parseColor(result.second))
            text_janken.text = hands.get(0)
        }

        scissors.setOnClickListener{
            val n = Random().nextInt(3)
            val result = checkJanken(0,n)
            janken_result.text = result.first
            janken_result.setTextColor(Color.parseColor(result.second))
            text_janken.text = hands.get(1)
        }

        paper.setOnClickListener{
            val n = Random().nextInt(3)
            val result = checkJanken(0,n)
            janken_result.setTextColor(Color.parseColor(result.second))
            janken_result.text = result.first
            text_janken.text = hands.get(2)
        }
    }
}