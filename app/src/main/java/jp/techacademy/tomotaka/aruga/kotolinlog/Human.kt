package jp.techacademy.tomotaka.aruga.kotolinlog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

open class Human : Animal, Thinkable {

    var hobby: String

    // 引数付きコンストラクタ
    constructor(name: String, age: Int, hobby: String) : super(name, age) {
        this.hobby = hobby
    }

    override fun say() {
        Log.d("kadai3-9", "私の名前は" + this.name + "です。" + "年は" + this.age + "歳です。")


    }

    override fun think() {
        Log.d("kadai3-9", "私は" + this.hobby + "について考える")
    }
}


