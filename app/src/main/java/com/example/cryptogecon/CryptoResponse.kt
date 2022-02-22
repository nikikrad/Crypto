package com.example.cryptogecon

import com.google.gson.annotations.SerializedName

data class CryptoResponse(
    var id: String,
    var name: String,
    var symbol: String,
    var image: String,
    @SerializedName("current_price")
    var price: String
)


