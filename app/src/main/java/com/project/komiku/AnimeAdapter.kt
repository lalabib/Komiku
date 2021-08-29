package com.project.komiku

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.project.komiku.activity.DetailActivity

class AnimeAdapter (val listAnime: ArrayList<Anime>) : RecyclerView.Adapter<AnimeAdapter.ListViewHolder>() {
    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater
            .from(viewGroup.context)
            .inflate(R.layout.animelist, viewGroup,false )
        return ListViewHolder(view)
    }
    override fun getItemCount(): Int {
        return listAnime.size
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val (name, genre, photo, sinopsis) = listAnime[position]

        Glide.with(holder.itemView.context)
            .load(photo)
            .apply(RequestOptions())
            .into(holder.imgPhoto)

        holder.tvName.text = name
        holder.tvGenre.text = genre


        val mContext = holder.itemView.context

        holder.itemView.setOnClickListener {
            val moveDetail = Intent(mContext, DetailActivity::class.java)
            moveDetail.putExtra(DetailActivity.EXTRA_PHOTO, photo)
            moveDetail.putExtra(DetailActivity.EXTRA_NAME, name)
            moveDetail.putExtra(DetailActivity.EXTRA_GENRE, genre)
            moveDetail.putExtra(DetailActivity.EXTRA_SINOPSIS, sinopsis)
            mContext.startActivity(moveDetail)
        }
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_name)
        var tvGenre: TextView = itemView.findViewById(R.id.tv_genre)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
    }
}