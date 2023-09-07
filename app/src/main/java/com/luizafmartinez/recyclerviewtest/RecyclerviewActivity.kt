package com.luizafmartinez.recyclerviewtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class RecyclerviewActivity : AppCompatActivity() {

    private lateinit var rvLista: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recyclerview)

        rvLista = findViewById(R.id.rv_lista)

    }
}