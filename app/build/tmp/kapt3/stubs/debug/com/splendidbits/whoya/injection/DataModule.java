package com.splendidbits.whoya.injection;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\t"}, d2 = {"Lcom/splendidbits/whoya/injection/DataModule;", "", "()V", "providePermissionsHelper", "Lcom/splendidbits/whoya/helper/PermissionsHelper;", "context", "Landroid/content/Context;", "provideRepository", "Lcom/splendidbits/whoya/dao/CallDataRepository;", "app_debug"})
@dagger.Module()
public final class DataModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.splendidbits.whoya.dao.CallDataRepository provideRepository(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.splendidbits.whoya.helper.PermissionsHelper providePermissionsHelper(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    public DataModule() {
        super();
    }
}