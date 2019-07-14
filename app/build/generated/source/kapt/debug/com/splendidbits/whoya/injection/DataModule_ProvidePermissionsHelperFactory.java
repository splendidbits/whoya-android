// Generated by Dagger (https://dagger.dev).
package com.splendidbits.whoya.injection;

import android.content.Context;
import com.splendidbits.whoya.helper.PermissionsHelper;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DataModule_ProvidePermissionsHelperFactory implements Factory<PermissionsHelper> {
  private final DataModule module;

  private final Provider<Context> contextProvider;

  public DataModule_ProvidePermissionsHelperFactory(DataModule module,
      Provider<Context> contextProvider) {
    this.module = module;
    this.contextProvider = contextProvider;
  }

  @Override
  public PermissionsHelper get() {
    return providePermissionsHelper(module, contextProvider.get());
  }

  public static DataModule_ProvidePermissionsHelperFactory create(DataModule module,
      Provider<Context> contextProvider) {
    return new DataModule_ProvidePermissionsHelperFactory(module, contextProvider);
  }

  public static PermissionsHelper providePermissionsHelper(DataModule instance, Context context) {
    return Preconditions.checkNotNull(instance.providePermissionsHelper(context), "Cannot return null from a non-@Nullable @Provides method");
  }
}
