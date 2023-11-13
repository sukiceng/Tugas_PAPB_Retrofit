package com.example.tugaspapbretrofit.Model

import com.google.gson.annotations.SerializedName

data class Hero(
    @SerializedName("result")
    val data: List<Data>
)
