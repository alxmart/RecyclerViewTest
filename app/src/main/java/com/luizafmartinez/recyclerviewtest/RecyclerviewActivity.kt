package com.luizafmartinez.recyclerviewtest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class RecyclerviewActivity : AppCompatActivity() {

    private lateinit var rvLista: RecyclerView
    private lateinit var btnClique: Button
    private lateinit var mensagemAdapter: MensagemAdapter

   /* override fun onStart() {
        super.onStart()
        //Poderia buscar os dados atualizados apos user voltar para a tela
    }*/

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recyclerview)

        //val lista = listOf("Jamilton","Ana","Maria","Pedro")

        val lista = mutableListOf(
            Mensagem("Jamilton","Olá, tudo bem ?","10:45"),
            Mensagem("Ana","Te vi ontem... Lorem ipsum dolorem sit amet, dolor sit amet ipsum. Lorem ipsum dolorem sit amet, dolor sit amet ipsum.","00:45"),
            Mensagem("Maria","Não acredito...","06:03"),
            Mensagem("Pedro","Futebol hoje ?","15:32"),
        )

        rvLista = findViewById(R.id.rv_lista)
        btnClique = findViewById(R.id.btn_clique)

        //Configurar o adapter:
        //===============================================================
        //Tipo: MensagemAdapter , Adapter

        mensagemAdapter = MensagemAdapter { nome ->
            Toast.makeText(this, "Olá $nome", Toast.LENGTH_SHORT).show()
            val intent =  Intent(this, MainActivity::class.java)
            intent.putExtra("nome", nome)
            startActivity( intent )
        }

        mensagemAdapter.atualizarListaDados(
            lista
        )

        rvLista.adapter = mensagemAdapter

        //Configurar o layoutManager:
        //===============================================================

        rvLista.layoutManager = LinearLayoutManager(
            this,
            RecyclerView.VERTICAL,
            false
        )

        btnClique.setOnClickListener {

            mensagemAdapter.executarOperacao()

            /*
            lista.add(
                Mensagem("Nova Jamilton","Teste","17:12")
            )
            mensagemAdapter.atualizarListaDados( lista )
            */


        }

        /*rvLista.addItemDecoration(
            DividerItemDecoration(
                this,
                RecyclerView.VERTICAL
            )
        )*/

        //LinearLayoutManager ( Configurar via XML e via Código ) Define o layout que vamos utilizar
        /*rvLista.layoutManager = LinearLayoutManager(
            this,
            RecyclerView.VERTICAL,
            false
        ) */

        //GridLayoutManager
        /*rvLista.layoutManager = GridLayoutManager(
            this,
            2
        )*/

        //StaggeredGridLayoutManager
        /*rvLista.layoutManager = StaggeredGridLayoutManager(
            2,
            RecyclerView.VERTICAL
        )*/

    }
}