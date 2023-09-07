package com.luizafmartinez.recyclerviewtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class RecyclerviewActivity : AppCompatActivity() {

    private lateinit var rvLista: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recyclerview)

        val lista = listOf<String>()

        rvLista = findViewById(R.id.rv_lista)

        //Configurar o adapter:
        //===============================================================
        rvLista.adapter = MensagemAdapter() //Tipo: MensagemAdapter , Adapter

        //Configurar o layoutManager:
        //===============================================================
        //rvLista.layoutManager   //Define o layout que vamos utilizar






    }
}