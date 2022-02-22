package com.example.cryptogecon

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import android.widget.LinearLayout
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.cryptogecon.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {

    lateinit var binding: FragmentFirstBinding
    lateinit var firstViewModel: FirstViewModel
    var responseBody: MutableList<String> = emptyList<String>().toMutableList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        firstViewModel = ViewModelProvider(this)[FirstViewModel::class.java]
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        firstViewModel.getResponse()
        firstViewModel.liveData.observe(viewLifecycleOwner, Observer {
//            responseBody.add()
            it.forEach {
                Log.e("KEK", it.toString())
            }
//            Log.e("KEK", responseBody.toString())
//            Log.e("KEK", responseBody.get(0).toString())
        })
        Thread.sleep(2000)

//        val Adapter = FirstAdapter()
//        binding.rvCrypto.layoutManager =
//            LinearLayoutManager(activity?.applicationContext, LinearLayoutManager.VERTICAL, false)
//        binding.rvCrypto.adapter = Adapter
    }

    override fun onDestroy() {
        super.onDestroy()
    }

}