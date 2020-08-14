package com.franco.frutasmvvm.UI

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.franco.frutasmvvm.Model.Fruits
import com.franco.frutasmvvm.R
import com.franco.frutasmvvm.viewModel.VModel

class MainActivity : AppCompatActivity() {

    private lateinit var vModel:VModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        vModel=ViewModelProviders.of(this).get(VModel::class.java)

        val fruitsObserver=Observer<List<Fruits>>{
            Log.d("Frutas",it.toString())
        }

        vModel.getListOfFruitsLiveData().observe(this,fruitsObserver)
    }
}