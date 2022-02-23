package com.example.cryptogecon

data class DescriptionResponse(
    var id: String,
    var description: List<Description>
)

data class Description(
    var descriptions: String
)
