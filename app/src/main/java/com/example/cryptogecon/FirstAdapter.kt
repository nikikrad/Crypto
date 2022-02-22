package com.example.cryptogecon

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class FirstAdapter(
    private val coinList: List<CryptoResponse>
): RecyclerView.Adapter<FirstAdapter.FirstViewHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): FirstAdapter.FirstViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val view =layoutInflater.inflate(R.layout.item_coin, parent, false)
        return FirstViewHolder(view)
    }

    override fun onBindViewHolder(holder: FirstViewHolder, position: Int) {
        holder.bind(coinList[position])
    }

    override fun getItemCount(): Int = coinList.size

    class FirstViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {


        fun bind(item: CryptoResponse){

        }

    }
}