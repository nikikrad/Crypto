package com.example.cryptogecon

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.cryptogecon.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {

    lateinit var itemCoin: CryptoResponse
    lateinit var binding: FragmentFirstBinding
    lateinit var firstViewModel: FirstViewModel
    var responseBody: MutableList<CryptoResponse> = emptyList<CryptoResponse>().toMutableList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        firstViewModel = ViewModelProvider(this)[FirstViewModel::class.java]
        firstViewModel.getResponse()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        firstViewModel.liveData.observe(viewLifecycleOwner, Observer {
            it.forEach {
                responseBody.add(it)
            }
        })

        val Adapter = FirstAdapter(responseBody, { description -> itemClickListener(description)})
        binding.rvCrypto.layoutManager =
            LinearLayoutManager(activity?.applicationContext, LinearLayoutManager.VERTICAL, false)
        binding.rvCrypto.adapter = Adapter
    }

    private fun itemClickListener(crypto: CryptoResponse) {
        itemCoin = crypto
        (activity as MainActivity).openFragment(CoinFragment(itemCoin))
    }

    override fun onDestroy() {
        super.onDestroy()
    }

}