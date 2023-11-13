package com.example.tugaspapbretrofit.Model

import com.google.gson.annotations.SerializedName

// menampung data dari API kedalam List agar bisa dibaca di aplikasi
data class Hero(
    @SerializedName("result")
    val data: List<Data>
)
