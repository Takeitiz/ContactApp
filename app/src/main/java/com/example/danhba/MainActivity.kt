package com.example.danhba

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val danhba = ArrayList<Items>()

        danhba.add(Items(R.drawable.j, "1", "Josefina Lehner", "16059719337", "josef@gmail.com"))
        danhba.add(Items(R.drawable.s, "2", "Stuart Vandervort II", "12794992386", "stuart@gmail.com"))
        danhba.add(Items(R.drawable.m, "3", "Maddison Russel", "13479466861", "russel@gmail.com"))
        danhba.add(Items(R.drawable.h, "4", "Halie Morar II", "16059714423", "morar2@gmail.com"))
        danhba.add(Items(R.drawable.k, "5", "Karelle Simonis", "12794992386", "simonis@gmail.com"))
        danhba.add(Items(R.drawable.h, "6", "Hannah Welch", "127458196482", "hannah@gmail.com"))
        danhba.add(Items(R.drawable.f, "7", "Fanny Frami", "137458196483", "fanny@gmail.com"))
        danhba.add(Items(R.drawable.e, "8", "Elfrieda Wisozk", "167458196925", "elfrieda@gmail.com"))

        val Recycleradapter = findViewById<RecyclerView>(R.id.main_rv)
        Recycleradapter.adapter = ItemAdapter(danhba)
        Recycleradapter.layoutManager = LinearLayoutManager(this)


    }
}