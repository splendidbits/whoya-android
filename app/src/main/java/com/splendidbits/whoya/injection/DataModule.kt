package com.splendidbits.whoya.injection

import android.content.Context
import com.splendidbits.whoya.dao.CallDataRepository
import com.splendidbits.whoya.helper.PermissionsHelper
import dagger.Module
import dagger.Provides

@Module
class DataModule {
    @Provides
    fun provideRepository(context: Context): CallDataRepository{
        return CallDataRepository(context)
    }

    @Provides
    fun providePermissionsHelper(context: Context): PermissionsHelper{
        return PermissionsHelper()
    }
}
