package jp.techacademy.tomotaka.aruga.kotolinlog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tarou = Human("太郎", 20, "読書")      // 名前をポチ、年齢3歳で、Dogのインスタンスを作る

        tarou.say()

        val dokusyo = Human("太郎", 20, hobby = "読書")

        dokusyo.think()
    }
}