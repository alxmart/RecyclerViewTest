package com.luizafmartinez.recyclerviewtest

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder

//Usar opção Adapter<VH>

//Adapter precisa saber qual é a classe que vai armazenar o item_lista.xml
class MensagemAdapter(
    private val lista: List<String>
) : Adapter<MensagemAdapter.MensagemViewHolder>() {

    //Esta é a classe que vai utilizar "item_lista.xml"
    inner class MensagemViewHolder(
        val itemView: View
    ) : ViewHolder(itemView) {
    }

    //onCreateViewHolder - Ao criar o ViewHolder - Criar a visualização
    // Converter o item_lista.xml para o tipo View
    // A partir do xml, cria uma view sempre que for necessário.
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MensagemViewHolder {
        val layoutInflater = LayoutInflater.from(
            parent.context
        )
        // Pega o xml e converte em um objeto View:
        val itemView = layoutInflater.inflate(
            R.layout.item_lista, parent, false
            // O próprio RecyclerView faz para nós...
           // ... pega a view e anexa dentro do item do RecyclerView
        )
        return MensagemViewHolder( itemView )
    }

    override fun onBindViewHolder(holder: MensagemViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    //GetItemCount -> Recupera a quantidade de itens
    override fun getItemCount(): Int {
        return lista.size
    }

}