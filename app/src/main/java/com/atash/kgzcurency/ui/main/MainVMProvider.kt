package com.atash.kgzcurency.ui.main

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.atash.kgzcurency.repazitory.Repazitory
import javax.inject.Inject

class MainVMProvider @Inject constructor(val repazitory: Repazitory): ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
      return MainVievModel(repazitory) as T
    }
}