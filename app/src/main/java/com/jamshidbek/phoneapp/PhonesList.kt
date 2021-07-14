package com.jamshidbek.phoneapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jamshidbek.phoneapp.Adapter.ItemGridOnClick
import com.jamshidbek.phoneapp.Adapter.PhoneListAdapter
import com.jamshidbek.phoneapp.Models.Phones
import com.jamshidbek.phoneapp.Utils.MySharedPrefarance
import kotlinx.android.synthetic.main.activity_phones_list.*

class PhonesList : AppCompatActivity() {

    lateinit var phoneListAdapter: PhoneListAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_phones_list)

        val type = intent.getIntExtra("type", -1)

        MySharedPrefarance.init(this)

        val list = MySharedPrefarance.obektString

        var listSort = ArrayList<Phones>()

        for (phones in list) {
            if (phones.type == type){
                listSort.add(phones)
            }
        }

        phoneListAdapter = PhoneListAdapter(this, listSort, object :
            PhoneListAdapter.ItemClickListPhone {
            override fun onClick(phone: Phones, position: Int) {

            }
        })
        list_phones.adapter = phoneListAdapter
    }
}