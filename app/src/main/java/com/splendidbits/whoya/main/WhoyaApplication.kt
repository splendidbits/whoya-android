package com.splendidbits.whoya.main

import androidx.multidex.MultiDexApplication
import com.splendidbits.whoya.injection.*

class WhoyaApplication : MultiDexApplication() {

    companion object {
        @JvmStatic
        lateinit var graph: AppComponent
    }

    override fun onCreate() {
        super.onCreate()
        graph = DaggerAppComponent
            .builder()
            .componentModule(ComponentModule())
            .applicationModule(ApplicationModule(this))
            .dataModule(DataModule())
            .build()

        graph.inject(this)
    }
}