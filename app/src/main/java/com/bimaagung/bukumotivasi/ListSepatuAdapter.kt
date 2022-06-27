package com.bimaagung.bukumotivasi

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import kotlinx.android.synthetic.main.item_row_buku.view.*

class ListSepatuAdapter(var context: Context, private val listSepatu:ArrayList<Sepatu>) : RecyclerView.Adapter<ListSepatuAdapter.ListViewHolder>(){
    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ListSepatuAdapter.ListViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_row_buku, viewGroup, false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listSepatu.size
    }

    override fun onBindViewHolder(holder: ListSepatuAdapter.ListViewHolder, position: Int) {
        val (nama, brand, rating, harga, foto, fitur, size, manufaktur, warna, bahan) = listSepatu[position]
        Glide.with(holder.itemView.context)
            .load(foto)
            .apply(RequestOptions().override(75, 85))
            .into(holder.foto_produk)
        holder.tx_judul.text = nama
        holder.tx_brand.text = brand
        holder.tx_rating.text = rating
        holder.tx_harga.text = harga

        holder.itemView.detail_sepatu.setOnClickListener{
            var i = Intent(context, DetailSepatu::class.java)
            i.putExtra("nama",nama)
            i.putExtra("brand",brand)
            i.putExtra("rating",rating)
            i.putExtra("harga",harga)
            i.putExtra("foto",foto)
            i.putExtra("fitur",fitur)
            i.putExtra("size",size)
            i.putExtra("manufaktur",manufaktur)
            i.putExtra("warna",warna)
            i.putExtra("bahan",bahan)
            context.startActivity(i)
        }


    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tx_judul: TextView = itemView.findViewById(R.id.tx_judul)
        var tx_brand: TextView = itemView.findViewById(R.id.tx_brand)
        var tx_rating: TextView = itemView.findViewById(R.id.tx_rating)
        var tx_harga: TextView = itemView.findViewById(R.id.tx_harga)
        var foto_produk: ImageView = itemView.findViewById(R.id.foto_produk)
    }
}