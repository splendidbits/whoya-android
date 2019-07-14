package com.splendidbits.whoya.injection;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH&\u00a8\u0006\f"}, d2 = {"Lcom/splendidbits/whoya/injection/AppComponent;", "", "inject", "", "hostActivity", "Lcom/splendidbits/whoya/activity/HostActivity;", "historyFragment", "Lcom/splendidbits/whoya/fragment/HistoryFragment;", "finishedCallBroadcastReceiver", "Lcom/splendidbits/whoya/main/FinishedCallBroadcastReceiver;", "application", "Lcom/splendidbits/whoya/main/WhoyaApplication;", "app_debug"})
@dagger.Component(modules = {com.splendidbits.whoya.injection.ApplicationModule.class, com.splendidbits.whoya.injection.DataModule.class, com.splendidbits.whoya.injection.ComponentModule.class})
public abstract interface AppComponent {
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.splendidbits.whoya.main.WhoyaApplication application);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.splendidbits.whoya.activity.HostActivity hostActivity);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.splendidbits.whoya.fragment.HistoryFragment historyFragment);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.splendidbits.whoya.main.FinishedCallBroadcastReceiver finishedCallBroadcastReceiver);
}