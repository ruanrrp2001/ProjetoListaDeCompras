package com.example.cafe

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.ListView
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.cafe.Adapter.AdapterProduto
import com.example.cafe.model.Produtos

class MainActivity : AppCompatActivity() {


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerview_produtos = findViewById<RecyclerView>(R.id.recyclerview_produtos)
        recyclerview_produtos.layoutManager = LinearLayoutManager(this)
        recyclerview_produtos.setHasFixedSize(true)

        val listadeprodutos: MutableList<Produtos> = mutableListOf()
        val adpterproduto = AdapterProduto(this,listadeprodutos)
        recyclerview_produtos.adapter = adpterproduto

        val produto1 = Produtos(
            R.drawable.blend,
            "BLend",
            "35R$"
        )

        listadeprodutos.add(produto1)

        val produto2 = Produtos(
            R.drawable.organico,
        "organico",
            "30R$"
        )

        listadeprodutos.add(produto2)


    }
}





