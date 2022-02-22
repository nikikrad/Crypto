package com.example.cryptogecon

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class FirstAdapter(
    private val coinList: List<CryptoResponse>
) : RecyclerView.Adapter<FirstAdapter.FirstViewHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): FirstViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val view = layoutInflater.inflate(R.layout.item_coin, parent, false)
        return FirstViewHolder(view)
    }

    override fun onBindViewHolder(holder: FirstViewHolder, position: Int) {
        holder.bind(coinList[position])
    }

    override fun getItemCount(): Int = coinList.size

    class FirstViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private val name: TextView = itemView.findViewById(R.id.tv_Name)
        private val avatar: ImageView = itemView.findViewById((R.id.iv_Avatar))
        private val symbol: TextView = itemView.findViewById(R.id.tv_Symbol)
        private val price: TextView = itemView.findViewById(R.id.tv_Price)

        fun bind(item: CryptoResponse) {
            name.text = item.name
            symbol.text = item.symbol
            price.text = item.price

            Glide.with(itemView)
                .load(item.image)
                .placeholder(R.drawable.ic_visibility)
                .into(avatar)
        }
    }
}