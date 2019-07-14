package com.splendidbits.whoya.fragment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 %2\u00020\u0001:\u0001%B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0002J\u0012\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J$\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\u001a\u0010#\u001a\u00020\u001a2\u0006\u0010$\u001a\u00020\u001e2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006&"}, d2 = {"Lcom/splendidbits/whoya/fragment/HistoryFragment;", "Landroidx/fragment/app/Fragment;", "()V", "dataRepository", "Lcom/splendidbits/whoya/dao/CallDataRepository;", "getDataRepository", "()Lcom/splendidbits/whoya/dao/CallDataRepository;", "setDataRepository", "(Lcom/splendidbits/whoya/dao/CallDataRepository;)V", "permissionsHelper", "Lcom/splendidbits/whoya/helper/PermissionsHelper;", "getPermissionsHelper", "()Lcom/splendidbits/whoya/helper/PermissionsHelper;", "setPermissionsHelper", "(Lcom/splendidbits/whoya/helper/PermissionsHelper;)V", "recyclerAdapter", "Lcom/splendidbits/whoya/adapter/HistoryRecyclerAdapter;", "getRecyclerAdapter", "()Lcom/splendidbits/whoya/adapter/HistoryRecyclerAdapter;", "setRecyclerAdapter", "(Lcom/splendidbits/whoya/adapter/HistoryRecyclerAdapter;)V", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "observeCallLogData", "Lkotlinx/coroutines/Job;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "Companion", "app_debug"})
public final class HistoryFragment extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.splendidbits.whoya.dao.CallDataRepository dataRepository;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.splendidbits.whoya.adapter.HistoryRecyclerAdapter recyclerAdapter;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.splendidbits.whoya.helper.PermissionsHelper permissionsHelper;
    private androidx.recyclerview.widget.RecyclerView recyclerView;
    public static final com.splendidbits.whoya.fragment.HistoryFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.splendidbits.whoya.dao.CallDataRepository getDataRepository() {
        return null;
    }
    
    public final void setDataRepository(@org.jetbrains.annotations.NotNull()
    com.splendidbits.whoya.dao.CallDataRepository p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.splendidbits.whoya.adapter.HistoryRecyclerAdapter getRecyclerAdapter() {
        return null;
    }
    
    public final void setRecyclerAdapter(@org.jetbrains.annotations.NotNull()
    com.splendidbits.whoya.adapter.HistoryRecyclerAdapter p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.splendidbits.whoya.helper.PermissionsHelper getPermissionsHelper() {
        return null;
    }
    
    public final void setPermissionsHelper(@org.jetbrains.annotations.NotNull()
    com.splendidbits.whoya.helper.PermissionsHelper p0) {
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final kotlinx.coroutines.Job observeCallLogData() {
        return null;
    }
    
    public HistoryFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/splendidbits/whoya/fragment/HistoryFragment$Companion;", "", "()V", "newInstance", "Lcom/splendidbits/whoya/fragment/HistoryFragment;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.splendidbits.whoya.fragment.HistoryFragment newInstance() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}