package com.jamshidbek.phoneapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.jamshidbek.phoneapp.Adapter.ItemGridOnClick
import com.jamshidbek.phoneapp.Adapter.TypeAdapter
import com.jamshidbek.phoneapp.Utils.MyData
import kotlinx.android.synthetic.main.activity_menu_grid.*

class MenuGridActivity : AppCompatActivity() {

    lateinit var typeAdapter: TypeAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_grid)

        typeAdapter = TypeAdapter(this, MyData.typeListName, object : ItemGridOnClick {
            override fun onClick(type: String, position: Int) {
                val intent = Intent(this@MenuGridActivity, PhonesList::class.java)
                intent.putExtra("type", position)
                startActivity(intent)
            }
        })

        grid_view.adapter = typeAdapter
    }
}