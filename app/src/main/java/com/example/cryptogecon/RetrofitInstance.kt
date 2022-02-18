package com.example.cryptogecon

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.cryptogecon.R
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

internal class RetrofitInstance {

    companion object{
        private const val URL = "https://api.coingecko.com/api/v3/"

        fun getRetrofitInstance(): Retrofit{
            return Retrofit.Builder()
                .baseUrl(URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        }
    }

}