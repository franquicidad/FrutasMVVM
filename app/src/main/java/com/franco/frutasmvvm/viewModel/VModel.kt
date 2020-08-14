package com.franco.frutasmvvm.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.franco.frutasmvvm.Domain.FrutasUseCase
import com.franco.frutasmvvm.Model.Fruits

class VModel: ViewModel() {

    private  val  listData=MutableLiveData<List<Fruits>>()

    val fruitsUseCase=FrutasUseCase()

    init {
        /**
         * Obtiene la lista de fruits cuando instanciemos el view Model.
         */
        getListOfFruits()
    }

    fun setListData(listFruits:List<Fruits>){
        listData.value=listFruits
    }

    fun getListOfFruits(){
        setListData(fruitsUseCase.getListOfFrutas())
    }

    fun getListOfFruitsLiveData():LiveData<List<Fruits>>{
        return  listData
    }
}