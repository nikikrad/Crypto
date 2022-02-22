package com.example.cryptogecon

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.google.gson.GsonBuilder
import com.google.gson.JsonParser
import com.google.gson.internal.GsonBuildConfig
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class FirstViewModel : ViewModel() {


    val liveData: MutableLiveData<List<CryptoResponse>> = MutableLiveData()

    fun getResponse() {

        val retrofit = RetrofitInstance.getRetrofitInstance().create(ApiService::class.java)

        viewModelScope.launch {
            val getGecon = retrofit.getCrypto()
            val bodyGecon = getGecon.body()

            liveData.postValue(bodyGecon)
//            Log.e("TAG", liveData.value.toString())

        }


    }
}