package com.splendidbits.whoya.injection

import com.splendidbits.whoya.activity.HostActivity
import com.splendidbits.whoya.fragment.HistoryFragment
import com.splendidbits.whoya.main.FinishedCallBroadcastReceiver
import com.splendidbits.whoya.main.WhoyaApplication
import dagger.Component

@Component(modules = [ApplicationModule::class, DataModule::class, ComponentModule::class])
interface AppComponent {
    fun inject(application: WhoyaApplication)

    fun inject(hostActivity: HostActivity)

    fun inject(historyFragment: HistoryFragment)

    fun inject(finishedCallBroadcastReceiver: FinishedCallBroadcastReceiver)
}