package com.jamshidbek.phoneapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jamshidbek.phoneapp.Adapter.ItemGridOnClick
import com.jamshidbek.phoneapp.Adapter.TypeAdapter
import com.jamshidbek.phoneapp.Utils.MyData
import kotlinx.android.synthetic.main.activity_phones_list.*

class AddActivity : AppCompatActivity() {

    lateinit var typeAdapter: TypeAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_phones_list)

        typeAdapter = TypeAdapter(this, MyData.typeListName, object : ItemGridOnClick{
            override fun onClick(type: String, position: Int) {
                val intent = Intent(this@AddActivity, AddPhoneActivity::class.java)
                intent.putExtra("type", position)
                startActivity(intent)
            }
        })

        list_phones.adapter = typeAdapter
    }
}