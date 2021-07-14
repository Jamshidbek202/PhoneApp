package com.jamshidbek.phoneapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.jamshidbek.phoneapp.Utils.MyData
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loadData()

        btn_menu.setOnClickListener {
            startActivity(Intent(this, MenuGridActivity::class.java))
        }

        btn_add.setOnClickListener{
            startActivity(Intent(this, AddActivity::class.java))
        }
    }

    private fun loadData(){
        MyData.typeListName.add("iPhone")
        MyData.typeListName.add("Samsung")
        MyData.typeListName.add("Mi")
        MyData.typeListName.add("Sony")
        MyData.typeListName.add("Huawei")
        MyData.typeListName.add("Artel")
    }
}