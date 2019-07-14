package com.splendidbits.whoya.injection

import android.content.Context
import com.splendidbits.whoya.adapter.HistoryRecyclerAdapter
import dagger.Module
import dagger.Provides


@Module
class ComponentModule {
    @Provides
    fun provideRecyclerAdapter(context: Context): HistoryRecyclerAdapter {
        return HistoryRecyclerAdapter(context)
    }
}