// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package com.dt.psychology.dagger2.modules;

import com.dt.psychology.presenter.activitis.ArticlePresenter;
import com.dt.psychology.presenter.activitis.ArticlePresenterImpl;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

public final class ActivityModule_ProvideArticlePresenterImplFactory
    implements Factory<ArticlePresenter> {
  private final ActivityModule module;

  private final Provider<ArticlePresenterImpl> articlePresenterProvider;

  public ActivityModule_ProvideArticlePresenterImplFactory(
      ActivityModule module, Provider<ArticlePresenterImpl> articlePresenterProvider) {
    assert module != null;
    this.module = module;
    assert articlePresenterProvider != null;
    this.articlePresenterProvider = articlePresenterProvider;
  }

  @Override
  public ArticlePresenter get() {
    return Preconditions.checkNotNull(
        module.provideArticlePresenterImpl(articlePresenterProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ArticlePresenter> create(
      ActivityModule module, Provider<ArticlePresenterImpl> articlePresenterProvider) {
    return new ActivityModule_ProvideArticlePresenterImplFactory(module, articlePresenterProvider);
  }
}