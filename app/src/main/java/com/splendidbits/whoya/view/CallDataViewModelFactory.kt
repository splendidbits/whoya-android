package com.splendidbits.whoya.view

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.splendidbits.whoya.dao.CallDataRepository

class CallDataViewModelFactory constructor(val dataRepository: CallDataRepository) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        val modelClass = CallDataViewModel(dataRepository)
        return modelClass as T
    }
}