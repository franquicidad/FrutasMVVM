package com.franco.frutasmvvm.Domain

import com.franco.frutasmvvm.Model.Fruits
import com.franco.frutasmvvm.data.FrutasDataSet

class FrutasUseCase {

    val fruitsDataSet:FrutasDataSet= FrutasDataSet()

    fun getListOfFrutas():List<Fruits>{
        return fruitsDataSet.createListFruits()
    }

}