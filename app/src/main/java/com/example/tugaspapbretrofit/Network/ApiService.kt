package com.example.tugaspapbretrofit.Network

import com.example.tugaspapbretrofit.Model.Hero
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET


// memanggil data dari server
interface ApiService {
 @GET("data.php")
 fun getHeroData():Call<Hero>
}