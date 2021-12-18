package com.atash.kgzcurency.repazitory

import com.atash.kgzcurency.data.remote.RetroCurrency
import com.atash.kgzcurency.model.Currency
import retrofit2.Response

class Repazitory {
    suspend fun getCurrensy(base:String):Response<Currency>{
     return RetroCurrency.api.getCurrency(base)
    }
}