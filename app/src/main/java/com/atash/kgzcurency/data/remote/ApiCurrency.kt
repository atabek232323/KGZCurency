package com.atash.kgzcurency.data.remote

import com.atash.kgzcurency.model.Currency
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiCurrency {
    @GET("latest")
    suspend fun getCurrency(@Query("base")countryName:String):Response<Currency>

}
//https://api.exchangerate.host/latest?base=KGS