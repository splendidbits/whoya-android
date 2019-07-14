package com.splendidbits.whoya.dao;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\r0\fR\u0014\u0010\u0005\u001a\u00020\u0006X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0010"}, d2 = {"Lcom/splendidbits/whoya/dao/CallDataRepository;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "MAX_ENTIRES_TO_FETCH", "", "getMAX_ENTIRES_TO_FETCH", "()I", "getContext", "()Landroid/content/Context;", "getCallHistory", "Lkotlinx/coroutines/Deferred;", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/splendidbits/whoya/model/CallData;", "app_debug"})
public final class CallDataRepository {
    private final int MAX_ENTIRES_TO_FETCH = 50;
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    
    public final int getMAX_ENTIRES_TO_FETCH() {
        return 0;
    }
    
    /**
     * Get a list of
     * @return A LiveData list of CallLog entries
     */
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Deferred<androidx.lifecycle.MutableLiveData<java.util.List<com.splendidbits.whoya.model.CallData>>> getCallHistory() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    public CallDataRepository(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
}