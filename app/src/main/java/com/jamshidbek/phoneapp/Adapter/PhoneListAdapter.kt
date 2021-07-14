package com.jamshidbek.phoneapp.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.jamshidbek.phoneapp.Models.Phones
import com.jamshidbek.phoneapp.R
import kotlinx.android.synthetic.main.item_phone_list.view.*


class PhoneListAdapter(context: Context, val list: List<Phones>, var ItemClickListPhotos: ItemClickListPhone) : ArrayAdapter<Phones>(context, R.layout.item_phone_list, list) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        val itemView: View
        if (convertView != null) {
            itemView = convertView
        } else {
            itemView =
                LayoutInflater.from(parent.context).inflate(R.layout.item_phone_list, parent, false)
        }
        itemView.txt_item_phone.text = list[position].name
        itemView.card_item_phone.setOnClickListener {
            ItemClickListPhotos.onClick(list[position], position)
        }
        return itemView
    }

    interface ItemClickListPhone{
        fun onClick(phone:Phones, position: Int)
    }
}