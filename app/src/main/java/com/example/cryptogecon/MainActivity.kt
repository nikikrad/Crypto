package com.example.cryptogecon

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.telecom.Call
import android.util.Log
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import okhttp3.Dispatcher

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val retrofit = RetrofitInstance.getRetrofitInstance().create(ApiService::class.java)

        CoroutineScope(Dispatchers.IO).launch {
            val getGecon = retrofit.getCrypto()
            Log.e("TAG", getGecon.body().toString())

        }
    }
}