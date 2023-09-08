package com.luizafmartinez.recyclerviewtest

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder

//Usar opção Adapter<VH>

//Adapter precisa saber qual é a classe que vai armazenar o item_lista.xml
class MensagemAdapter(
    private val lista: List<Mensagem>
) : Adapter<MensagemAdapter.MensagemViewHolder>() {

    //Esta é a classe que vai utilizar "item_lista.xml"
    inner class MensagemViewHolder(
        val itemView: View
    ) : ViewHolder(itemView) {
        val textNome: TextView = itemView.findViewById(R.id.text_card_nome)
        val textUltima: TextView = itemView.findViewById(R.id.text_card_ultima)

        //val textNome: TextView = itemView.findViewById(R.id.text_nome)
        //val textUltima: TextView = itemView.findViewById(R.id.text_ultima)
        //val textHorario: TextView = itemView.findViewById(R.id.text_horario)
    }
    //onCreateViewHolder - Ao criar o ViewHolder - Criar a visualização

    // Converter o item_lista.xml para o tipo View
    // A partir do xml, cria uma view sempre que for necessário.
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MensagemViewHolder {
        val layoutInflater = LayoutInflater.from(
            parent.context
        )
        // Pega o xml e converte em um objeto View:
        /*val itemView = layoutInflater.inflate(
            R.layout.item_lista, parent, false
            // O próprio RecyclerView faz para nós...
           // ... pega a view e anexa dentro do item do RecyclerView
        )*/

        val itemView = layoutInflater.inflate(
            R.layout.item_cardview, parent, false
        )

        return MensagemViewHolder( itemView )
    }

    //onBindViewHolder -> Ao vincular os dados para a visualização.

    //Pega os dados e vincula em cada item de lista. É onde vai exibir os dados.
    override fun onBindViewHolder(mensagemViewHolder: MensagemViewHolder, position: Int) {
        val mensagem = lista[position]
        mensagemViewHolder.textNome.text = mensagem.nome
        mensagemViewHolder.textUltima.text = mensagem.ultima
        //mensagemViewHolder.textHorario.text = mensagem.horario
    }

    //GetItemCount -> Recupera a quantidade de itens
    override fun getItemCount(): Int {
        return lista.size
    }

}