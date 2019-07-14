package com.splendidbits.whoya.fragment

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.splendidbits.whoya.R
import com.splendidbits.whoya.adapter.HistoryRecyclerAdapter
import com.splendidbits.whoya.dao.CallDataRepository
import com.splendidbits.whoya.helper.PermissionsHelper
import com.splendidbits.whoya.main.TAG
import com.splendidbits.whoya.main.WhoyaApplication
import com.splendidbits.whoya.model.CallData
import com.splendidbits.whoya.view.CallDataViewModel
import com.splendidbits.whoya.view.CallDataViewModelFactory
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import javax.inject.Inject


class HistoryFragment : Fragment() {
    @Inject
    lateinit var dataRepository: CallDataRepository

    @Inject
    lateinit var recyclerAdapter: HistoryRecyclerAdapter

    @Inject
    lateinit var permissionsHelper: PermissionsHelper

    private var recyclerView: RecyclerView? = null


    companion object {
        fun newInstance() = HistoryFragment()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        WhoyaApplication.graph.inject(this)

        observeCallLogData()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        return inflater.inflate(R.layout.fragment_call_data, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        recyclerView = view.findViewById(R.id.call_data_recycler_view)
        recyclerView?.layoutManager = LinearLayoutManager(context)
        recyclerView?.adapter = recyclerAdapter
    }

    private fun observeCallLogData() = GlobalScope.launch {
        if (permissionsHelper.hasCallLogPermission(activity!!)) {
            val viewModelFactory = CallDataViewModelFactory(dataRepository)
            val callDataViewModel = ViewModelProviders.of(
                this@HistoryFragment, viewModelFactory)[CallDataViewModel::class.java]

            // TODO: Perhaps migrate the async behavior into the ViewModel itself
            withContext(Dispatchers.Main) {
                callDataViewModel.getCallData().observe(this@HistoryFragment, Observer<List<CallData>> {
                    Log.d(TAG, "Retrieved ${it.count()} Call Logs from Phone")
                    recyclerAdapter.addCallData(callData = it)
                })
            }
        }
    }
}
