package com.example.tugaspapbretrofit.Model

import com.google.gson.annotations.SerializedName

// memanggil data sesuai dengan id pada API yang dimiliki
data class Data(
    @SerializedName("id")
    val id: Int,
    @SerializedName("title")
    val title: String,
    @SerializedName("image")
    val image: String
)
