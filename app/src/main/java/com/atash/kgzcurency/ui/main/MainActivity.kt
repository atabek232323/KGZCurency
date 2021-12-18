package com.atash.kgzcurency.ui.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.atash.kgzcurency.R
import com.atash.kgzcurency.databinding.ActivityMainBinding
import com.atash.kgzcurency.repazitory.Repazitory
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    @Inject
    private lateinit var binding: ActivityMainBinding
    private lateinit var mainVievModel: MainVievModel
    private lateinit var mainVMProvider: MainVMProvider
    override fun onCreate(savedInstanceState : Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initViewModel()
        getFromApi()
    }

    private fun getFromApi() {
   mainVievModel.getCurrent("KGZ")
        mainVievModel.myCurrency.observe(this, Observer {
          tv_currency.text = it.body()!!.rates.EUR.toString()
        })
    }

    private fun initViewModel() {
   val repazitory = Repazitory()
        mainVMProvider = MainVMProvider(repazitory)
  mainVievModel = ViewModelProvider(this,mainVMProvider).get(MainVievModel::class.java)
    }
}