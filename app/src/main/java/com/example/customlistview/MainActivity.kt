package com.example.customlistview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var listView = findViewById<ListView>(R.id.listView) as ListView
        var informacoes: ArrayList<Estacionamento> = ArrayList()
        informacoes.add(Estacionamento("FKO-3030","10/10/2020","10:14"))
        listView.adapter = CustomAdapter(applicationContext,informacoes)
    }
}
