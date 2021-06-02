package br.com.renancorredato.santanderdevweek.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import br.com.renancorredato.santanderdevweek.data.Conta
import br.com.renancorredato.santanderdevweek.data.local.FakeData

class MainViewModel : ViewModel(){

    private val mutableLiveData:MutableLiveData<Conta> = MutableLiveData()

    fun buscarContaCliente() : LiveData<Conta>{
        mutableLiveData.value = FakeData().getlocalData()

        return mutableLiveData
    }

}