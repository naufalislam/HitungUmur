package com.epale

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btHitung.setOnClickListener {
//            deklarasi edit tex
            var tahunlahir = etInputUmur.text.toString().toInt()

            //get tahun saaat ini dengan calender
            var tahun:Int = Calendar.getInstance().get(Calendar.YEAR)

            //set umur = tahun saat ini - tahun kelahiran kita
            var umur = 0
            if (tahunlahir.toInt() != null){
                    umur = tahun - tahunlahir
                //hasil
                tvUmur.text = "Umur = $umur tahun"
            }else{
                tvUmur.text = "tahun tidak valid"
            }


        }
    }
}
