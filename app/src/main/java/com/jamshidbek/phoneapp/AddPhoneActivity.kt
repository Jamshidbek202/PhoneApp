package com.jamshidbek.phoneapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.jamshidbek.phoneapp.Models.Phones
import com.jamshidbek.phoneapp.Utils.MySharedPrefarance
import kotlinx.android.synthetic.main.activity_add_phone.*

class AddPhoneActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_phone)

        MySharedPrefarance.init(this)

        val type = intent.getIntExtra("type", -1)

        btn_addPhone.setOnClickListener{
            val txt_name = edt_phoneName.text.toString().trim()
            val txt_features = edt_phoneFeatures.text.toString().trim()

            if (txt_name != "" && txt_features != "" && type != -1){
                val list = MySharedPrefarance.obektString
                list.add(Phones(type, txt_name, txt_features))
                MySharedPrefarance.obektString = list
                Toast.makeText(this, "Saved", Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show()
            }
        }
    }
}