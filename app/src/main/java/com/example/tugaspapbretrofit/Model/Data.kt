package com.example.tugaspapbretrofit.Model

import com.google.gson.annotations.SerializedName

data class Data(
    @SerializedName("id")
    val id: Int,
    @SerializedName("title")
    val title: String,
    @SerializedName("image")
    val image: String
)
