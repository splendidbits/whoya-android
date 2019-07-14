package com.splendidbits.whoya.main

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import com.splendidbits.whoya.dao.CallDataRepository
import javax.inject.Inject


class FinishedCallBroadcastReceiver : BroadcastReceiver() {
    @Inject
    lateinit var repository: CallDataRepository

    override fun onReceive(context: Context?, intent: Intent?) {
        WhoyaApplication.graph.inject(this)

        val bundle = intent?.extras
        val number = bundle?.getString("incoming_number")
    }

}