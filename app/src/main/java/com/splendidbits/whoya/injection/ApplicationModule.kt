package com.splendidbits.whoya.injection

import android.content.Context
import android.content.res.Resources
import com.splendidbits.whoya.main.WhoyaApplication
import dagger.Module
import dagger.Provides
import javax.inject.Singleton


@Module
class ApplicationModule(private var application: WhoyaApplication) {
    @Provides
    @Singleton
    fun provideApplication(): WhoyaApplication {
        return application
    }

    @Provides
    fun provideContext(): Context {
        return application.applicationContext
    }

    @Provides
    fun ProvideResources(context: Context): Resources {
        return context.resources
    }
}
