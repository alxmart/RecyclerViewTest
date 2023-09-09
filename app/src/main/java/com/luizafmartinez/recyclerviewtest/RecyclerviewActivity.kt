package com.luizafmartinez.recyclerviewtest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager

class RecyclerviewActivity : AppCompatActivity() {

    private lateinit var rvLista: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recyclerview)

        //val lista = listOf("Jamilton","Ana","Maria","Pedro")

        val lista = listOf(
            Mensagem("Jamilton","Olá, tudo bem ?","10:45"),
            Mensagem("Ana","Te vi ontem... Lorem ipsum dolorem sit amet, dolor sit amet ipsum. Lorem ipsum dolorem sit amet, dolor sit amet ipsum.","00:45"),
            Mensagem("Maria","Não acredito...","06:03"),
            Mensagem("Pedro","Futebol hoje ?","15:32"),
        )

        rvLista = findViewById(R.id.rv_lista)

        //Configurar o adapter:
        //===============================================================
        //Tipo: MensagemAdapter , Adapter
        rvLista.adapter = MensagemAdapter( lista ) { nome ->
            Toast.makeText(this, "Olá $nome", Toast.LENGTH_SHORT).show()

            val intent =  Intent(this, MainActivity::class.java)
            intent.putExtra("nome", nome)

            startActivity(
                intent
           )

        }

        //Configurar o layoutManager:
        //===============================================================

        //StaggeredGridLayoutManager
        /*rvLista.layoutManager = StaggeredGridLayoutManager(
            2,
            RecyclerView.VERTICAL
        )*/

        rvLista.layoutManager = LinearLayoutManager(
            this,
            RecyclerView.VERTICAL,
            false
        )

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