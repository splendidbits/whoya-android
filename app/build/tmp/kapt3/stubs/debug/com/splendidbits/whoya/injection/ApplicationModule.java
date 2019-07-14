package com.splendidbits.whoya.injection;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\b\u0010\t\u001a\u00020\u0003H\u0007J\b\u0010\n\u001a\u00020\bH\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/splendidbits/whoya/injection/ApplicationModule;", "", "application", "Lcom/splendidbits/whoya/main/WhoyaApplication;", "(Lcom/splendidbits/whoya/main/WhoyaApplication;)V", "ProvideResources", "Landroid/content/res/Resources;", "context", "Landroid/content/Context;", "provideApplication", "provideContext", "app_debug"})
@dagger.Module()
public final class ApplicationModule {
    private com.splendidbits.whoya.main.WhoyaApplication application;
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.splendidbits.whoya.main.WhoyaApplication provideApplication() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final android.content.Context provideContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final android.content.res.Resources ProvideResources(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    public ApplicationModule(@org.jetbrains.annotations.NotNull()
    com.splendidbits.whoya.main.WhoyaApplication application) {
        super();
    }
}