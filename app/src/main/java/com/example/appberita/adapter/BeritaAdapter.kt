package com.example.appberita.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.appberita.R
import com.example.appberita.model.ModelBerita
import kotlinx.android.synthetic.main.card_view_berita.view.*

class BeritaAdapter(private val listBerita: ArrayList<ModelBerita>): RecyclerView.Adapter<BeritaAdapter.ViewHolder>() {

    // class holder
    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val judul = itemView.tvJudulBerita
        val deskripsi = itemView.tvDescBerita
        val jurnalis = itemView.tvNamaJurnalis
        val tanggal = itemView.tvTanggalBerita
        val gambar = itemView.ivImageBerita
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.card_view_berita, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.judul.text = listBerita[position].judulBer
        holder.deskripsi.text = listBerita[position].descBer
        holder.jurnalis.text = listBerita[position].jurnalisBer
        holder.tanggal.text = listBerita[position].tanggalBer
        holder.gambar.setImageResource(listBerita[position].imageBer)
    }

    override fun getItemCount(): Int {
        return listBerita.size
    }
}