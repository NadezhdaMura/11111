package com.example.tvshow.data

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.VideoView
import androidx.recyclerview.widget.RecyclerView
import com.example.tvshow.R
import kotlinx.android.synthetic.main.tvshow_item.view.*

class TvShowAdapter (private val movieList : List<TvShowItem>) : RecyclerView.Adapter<TvShowAdapter
.TvShowViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TvShowViewHolder{
        val itemView = LayoutInflater.from(parent.context).inflate(
            R.layout.tvshow_item,
            parent,false)
        return TvShowViewHolder(itemView)
    }
    override fun onBindViewHolder(holder: TvShowViewHolder, position: Int) {
        val currentItem = TvShowList[position]
        val ListOfTvShow = listOf(R.raw.midsomer_murders,R.raw.criminal_minds)
            val videoView = holder.imageView.findViewById<VideoView>(R.id.videoView)


        holder.imageView.setImageResource(currentItem.TvShowPicture)
        holder.textView1.text = currentItem.name
        holder.textView2.text = currentItem.genre
        holder.year.text = currentItem.year.toString()


    }
    override fun getItemCount() = TvShowlist.size
    class TvShowViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
        val imageView = itemView.imageView
        val textView1 = itemView.textView1
        val textView2 = itemView.textView2
        val year = itemView.tvShowYear
    }
}
