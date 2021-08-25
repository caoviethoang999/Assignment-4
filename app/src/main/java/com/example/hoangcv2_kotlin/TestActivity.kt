package com.example.hoangcv2_kotlin

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.util.*


class TestActivity : AppCompatActivity() {
    var txtTest:TextView?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)
        initView()
        showData()
    }
    fun initView(){
        txtTest=findViewById(R.id.txttest)
    }
    fun showData(){
        val intent=intent
        txtTest!!.setText(Arrays.toString(intent.getStringArrayExtra("test")))
    }
}