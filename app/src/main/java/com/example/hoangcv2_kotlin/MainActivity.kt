package com.example.hoangcv2_kotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {

    var btntask2: Button?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
        btntask2!!.setOnClickListener(this)

    }
    fun initView(){
        btntask2=findViewById(R.id.btntask2)
    }

    fun test() {
        val test = arrayOf(
            "Hello!",
            "Hi!",
            "Salut!",
            "Hallo!",
            "Ciao!",
            "Ahoj!",
            "YAH sahs!",
            "Bog!",
            "Hej!",
            "Czesc!",
            "Ní hảo!",
            "Kon’nichiwa!",
            "Annyeonghaseyo!",
            "Shalom!",
            "Sah-wahd-dee-kah!",
            "Merhaba!",
            "Hujambo!",
            "Olá!"
        )
        val intent = Intent(this@MainActivity, TestActivity::class.java)
        intent.putExtra("test", test)
        startActivity(intent)
    }

    override fun onClick(v: View?) {
        when(v!!.id){
            R.id.btntask2 -> {
                test()
            }
        }
    }
}