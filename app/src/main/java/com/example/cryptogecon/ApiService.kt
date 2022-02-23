package com.example.cryptogecon

import com.example.cryptogecon.CryptoResponse
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

    @GET("coins/markets?vs_currency=usd")
    suspend fun getCrypto(): Response<List<CryptoResponse>>

    @GET("coins/bitcoin")
    suspend fun getDescription(): Response<List<DescriptionResponse>>

}