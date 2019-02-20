package com.erikfloresq.recyclerviewdemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
    }

    fun init() {
        var list = mutableListOf(User("erik",23,"photo"), User("erik",25,"photo"))
        mainRecycler.adapter = UserAdapter(list)
    }
}
