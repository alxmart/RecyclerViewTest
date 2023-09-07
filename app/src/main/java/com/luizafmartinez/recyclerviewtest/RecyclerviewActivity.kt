package com.luizafmartinez.recyclerviewtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class RecyclerviewActivity : AppCompatActivity() {

    private lateinit var rvLista: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recyclerview)

        //val lista = listOf("Jamilton","Ana","Maria","Pedro")

        val lista = listOf(
            Mensagem("Jamilton","Olá, tudo bem ?","10:45"),
            Mensagem("Ana","Te vi ontem...","00:45"),
            Mensagem("Maria","Não acredito...","06:03"),
            Mensagem("Pedro","Futebol hoje ?","15:32"),
        )

        rvLista = findViewById(R.id.rv_lista)

        //Configurar o adapter:
        //===============================================================
        rvLista.adapter = MensagemAdapter(lista) //Tipo: MensagemAdapter , Adapter

        //Configurar o layoutManager:
        //===============================================================
        rvLista.layoutManager = LinearLayoutManager(this) //Define o layout que vamos utilizar

    }
}