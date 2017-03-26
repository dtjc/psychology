// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package com.dt.psychology.dagger2.components;

import com.dt.psychology.dagger2.modules.ActivityModule;
import com.dt.psychology.dagger2.modules.AppModule;
import com.dt.psychology.dagger2.modules.FragmentModule;
import com.dt.psychology.ui.MyApplication;
import com.dt.psychology.ui.activities.ArticleActivity;
import com.dt.psychology.ui.activities.MainActivity;
import com.dt.psychology.ui.fragments.HomeFragment;
import com.dt.psychology.ui.fragments.PersonalFragment;
import dagger.internal.MembersInjectors;
import dagger.internal.Preconditions;

public final class DaggerAppComponent implements AppComponent {
  private DaggerAppComponent(Builder builder) {
    assert builder != null;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static AppComponent create() {
    return builder().build();
  }

  @Override
  public void inject(MyApplication myApplication) {
    MembersInjectors.<MyApplication>noOp().injectMembers(myApplication);
  }

  @Override
  public ActivityComponent plus(ActivityModule activityModule) {
    return new ActivityComponentImpl(activityModule);
  }

  public static final class Builder {
    private Builder() {}

    public AppComponent build() {
      return new DaggerAppComponent(this);
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This
     *     method is a no-op. For more, see https://google.github.io/dagger/unused-modules.
     */
    @Deprecated
    public Builder appModule(AppModule appModule) {
      Preconditions.checkNotNull(appModule);
      return this;
    }
  }

  private final class ActivityComponentImpl implements ActivityComponent {
    private final ActivityModule activityModule;

    private ActivityComponentImpl(ActivityModule activityModule) {
      this.activityModule = Preconditions.checkNotNull(activityModule);
    }

    @Override
    public void inject(MainActivity mainActivity) {
      MembersInjectors.<MainActivity>noOp().injectMembers(mainActivity);
    }

    @Override
    public void inject(ArticleActivity articleActivity) {
      MembersInjectors.<ArticleActivity>noOp().injectMembers(articleActivity);
    }

    @Override
    public FragmentComponent plus(FragmentModule fragmentModule) {
      return new FragmentComponentImpl(fragmentModule);
    }

    private final class FragmentComponentImpl implements FragmentComponent {
      private final FragmentModule fragmentModule;

      private FragmentComponentImpl(FragmentModule fragmentModule) {
        this.fragmentModule = Preconditions.checkNotNull(fragmentModule);
      }

      @Override
      public void inject(HomeFragment homeFragment) {
        MembersInjectors.<HomeFragment>noOp().injectMembers(homeFragment);
      }

      @Override
      public void inject(PersonalFragment personalFragment) {
        MembersInjectors.<PersonalFragment>noOp().injectMembers(personalFragment);
      }
    }
  }
}
