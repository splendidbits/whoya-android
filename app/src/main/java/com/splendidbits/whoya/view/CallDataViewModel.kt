package com.splendidbits.whoya.view

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.splendidbits.whoya.dao.CallDataRepository
import com.splendidbits.whoya.model.CallData

class CallDataViewModel(dataRepository: CallDataRepository) : ViewModel() {
    // TODO: Migrate to ViewLifecycleScope Pattern from:
    //  https://developer.android.com/topic/libraries/architecture/coroutines
    //  to integrate the ViewModel co-routines.

    // Lazy load the callData into the viewModel. Note, this is also
    // a co-routine function that performs asynchronously.
    private val liveData by lazy {
         dataRepository.getCallHistory()
    }

    suspend fun getCallData(): MutableLiveData<List<CallData>> {
        return liveData.await()
    }
}