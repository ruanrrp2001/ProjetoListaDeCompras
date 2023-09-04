package com.example.cafe.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.cafe.R
import com.example.cafe.model.Produtos

class AdapterProduto(private val context: Context, private val produtos:MutableList<Produtos>): RecyclerView.Adapter<AdapterProduto.ProdutoViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProdutoViewHolder {
        val itemlista = LayoutInflater.from(context).inflate(R.layout.cafe_itens,parent,false)
        val holder = ProdutoViewHolder(itemlista)
        return holder
    }

    override fun getItemCount(): Int = produtos.size

    override fun onBindViewHolder(holder: ProdutoViewHolder, position: Int) {
        holder.foto.setImageResource(produtos[position].foto)
        holder.nome.text = produtos[position].nome
        holder.valor.text = produtos[position].valor

    }

    inner class ProdutoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val foto = itemView.findViewById<ImageView>(R.id.fotoproduto)
        val nome = itemView.findViewById<TextView>(R.id.nomeproduto)
        val valor = itemView.findViewById<TextView>(R.id.valorproduto)

    }
}