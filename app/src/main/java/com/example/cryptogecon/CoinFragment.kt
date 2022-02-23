package com.example.cryptogecon

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.cryptogecon.databinding.FragmentCoinBinding

class CoinFragment(var crypto: CryptoResponse) : Fragment() {

    lateinit var binding: FragmentCoinBinding
    lateinit var coinViewModel: CoinViewModel
    var responseBody: MutableList<DescriptionResponse> =
        emptyList<DescriptionResponse>().toMutableList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        coinViewModel = ViewModelProvider(this)[CoinViewModel::class.java]
        coinViewModel.getResponse()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCoinBinding.inflate(inflater, container, false)
        return super.onCreateView(inflater, container, savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//        coinViewModel.liveData.observe(viewLifecycleOwner, Observer {
//            it.forEach {
//                responseBody.add(it)
//                Log.e("KEK", it.toString())
//            }
//        })
    }

    override fun onDestroy() {
        super.onDestroy()
    }

}