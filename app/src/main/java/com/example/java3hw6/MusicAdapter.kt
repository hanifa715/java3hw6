package com.example.java3hw6



import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.example.java3hw6.databinding.ItemMusicBinding

class MusicAdapter(val list: ArrayList<Music>,val onClick:(position:Int)->Unit): Adapter<MusicAdapter.ViewHolder>() {
    inner class ViewHolder(private val binding: ItemMusicBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(){
            val item = list[adapterPosition]
            binding.tvSongTitle.text = item.songTitle
            binding.tvSinger.text = item.singer
            binding.tvTime.text = item.time
            binding.tvNumber.text = item.number.toString()

            itemView.setOnClickListener{
                onClick(adapterPosition)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(ItemMusicBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun getItemCount(): Int {
       return list.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind()
    }

}


