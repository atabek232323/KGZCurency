package com.atash.kgzcurency.ui.main

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.atash.kgzcurency.model.Currency
import com.atash.kgzcurency.repazitory.Repazitory
import kotlinx.coroutines.launch
import retrofit2.Response
import javax.inject.Inject

class MainVievModel @Inject constructor (val repazitory : Repazitory):ViewModel() {
   val myCurrency:MutableLiveData<Response<Currency>> = MutableLiveData()
   fun getCurrent(base:String){
      viewModelScope.launch {
val result = repazitory.getCurrensy(base)
         myCurrency.value = result
      }

   }

}