package com.atash.kgzcurency.data.remote

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetroCurrency {
    val retrofit by lazy {
        Retrofit.Builder().baseUrl("https://api.exchangerate.host/").addConverterFactory(GsonConverterFactory.create()).build()
    }
    val api by lazy {
      retrofit.create(ApiCurrency::class.java)
    }
}