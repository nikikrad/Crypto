package com.example.cryptogecon

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

class CoinViewModel: ViewModel() {

    val liveData: MutableLiveData<List<DescriptionResponse>> = MutableLiveData()

    fun getResponse(){
        val retrofit = RetrofitInstance.getRetrofitInstance().create(ApiService::class.java)

//        viewModelScope.launch {
//            runBlocking {
//                val getDescription = retrofit.getDescription()
//                val bodyDescription = getDescription.body()
//                liveData.postValue(bodyDescription)
//            }
//        }
    }
}