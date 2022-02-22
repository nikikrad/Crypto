package com.example.cryptogecon

data class CryptoResponse(
    var coins: List<Coin>
)

data class Coin(
    val id: String
)

