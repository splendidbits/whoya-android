package com.splendidbits.whoya.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001d\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fR-\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0010"}, d2 = {"Lcom/splendidbits/whoya/view/CallDataViewModel;", "Landroidx/lifecycle/ViewModel;", "dataRepository", "Lcom/splendidbits/whoya/dao/CallDataRepository;", "(Lcom/splendidbits/whoya/dao/CallDataRepository;)V", "liveData", "Lkotlinx/coroutines/Deferred;", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/splendidbits/whoya/model/CallData;", "getLiveData", "()Lkotlinx/coroutines/Deferred;", "liveData$delegate", "Lkotlin/Lazy;", "getCallData", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class CallDataViewModel extends androidx.lifecycle.ViewModel {
    private final kotlin.Lazy liveData$delegate = null;
    
    private final kotlinx.coroutines.Deferred<androidx.lifecycle.MutableLiveData<java.util.List<com.splendidbits.whoya.model.CallData>>> getLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getCallData(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super androidx.lifecycle.MutableLiveData<java.util.List<com.splendidbits.whoya.model.CallData>>> p0) {
        return null;
    }
    
    public CallDataViewModel(@org.jetbrains.annotations.NotNull()
    com.splendidbits.whoya.dao.CallDataRepository dataRepository) {
        super();
    }
}