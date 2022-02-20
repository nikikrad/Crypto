package com.example.cryptogecon

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class FirstViewModel(application: Application) : AndroidViewModel(application) {

    lateinit var liveData: MutableLiveData<String>
    lateinit var supportData: MutableList<String>

    init {
        getResponse()
    }

    fun getResponse() {

        val retrofit = RetrofitInstance.getRetrofitInstance().create(ApiService::class.java)

        CoroutineScope(Dispatchers.IO).launch {
            val getGecon = retrofit.getCrypto()
            val bodyGecon = getGecon.body()
            liveData.value = bodyGecon.toString()

//            if (getGecon.isSuccessful) {
//                if (bodyGecon != null) {
//                    for(i in 0 until bodyGecon.count()){
//                        liveData.value = supportData
//                        liveData.value = bodyGecon[i].id
//                    }
//                }
//            }
        }


    }
}