package com.luizafmartinez.recyclerviewtest

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder

//Usar opção Adapter<VH>

//Adapter precisa saber qual é a classe que vai armazenar o item_lista.xml
class MensagemAdapter : Adapter<MensagemAdapter.MensagemViewHolder>() {
    //Esta é a classe que vai utilizar "item_lista.xml"
    inner class MensagemViewHolder(
        val itemView: View
    ) : ViewHolder(itemView) {
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MensagemViewHolder {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: MensagemViewHolder, position: Int) {
        TODO("Not yet implemented")
    }
}