package com.example.appberita.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.appberita.R
import com.example.appberita.databinding.CardViewBeritaBinding
import com.example.appberita.model.ModelBerita
import kotlinx.android.synthetic.main.card_view_berita.view.*

class BeritaAdapter(var data: MutableList<ModelBerita>): RecyclerView.Adapter<BeritaAdapter.ViewHolder>() {

    // class holder
    inner class ViewHolder(val binding: CardViewBeritaBinding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(CardViewBeritaBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.apply {
            // put atribut model into variabel
            val (judul,desc,jurnalis,tanggal,image) = data[position]

            tvJudulBerita.text = judul
            tvDescBerita.text = desc
            tvNamaJurnalis.text = jurnalis
            tvTanggalBerita.text = tanggal
            for (img in image){
                ivImageBerita.setImageResource(img.images)
            }
        }
    }

    override fun getItemCount(): Int = data.size
}