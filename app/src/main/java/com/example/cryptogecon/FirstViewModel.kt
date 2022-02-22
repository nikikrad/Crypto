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

    fun <T : Any?> MutableLiveData<T>.default(initialValue: T) = apply { setValue(initialValue) }

    val liveData = MutableLiveData<String>().default("Initial value!")

    fun getResponse() {

        val retrofit = RetrofitInstance.getRetrofitInstance().create(ApiService::class.java)

        viewModelScope.launch {
            val getGecon = retrofit.getCrypto()
//            if (getGecon.isSuccessful) {
//            } else Log.e("TAG", "SOSI BIBU")
//            withContext(Dispatchers.Main) {
//                val gson = GsonBuilder().setPrettyPrinting().create()
//                val prettyJson = gson.toJson(
//                    JsonParser.parseString(
//                        getGecon.body()?.toString()
//                    )
//                )
//            }

//            val bodyGecon = getGecon.body()

//            liveData.postValue(bodyGecon.toString())
//            Log.e("TAG", liveData.value.toString())

        }


    }
}