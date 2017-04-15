// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package com.dt.psychology.ui.activities;

import com.dt.psychology.presenter.activitis.WriteCommentPresenter;
import dagger.MembersInjector;
import javax.inject.Provider;

public final class WriteCommentActivity_MembersInjector
    implements MembersInjector<WriteCommentActivity> {
  private final Provider<WriteCommentPresenter> writeCommentPresenterProvider;

  public WriteCommentActivity_MembersInjector(
      Provider<WriteCommentPresenter> writeCommentPresenterProvider) {
    assert writeCommentPresenterProvider != null;
    this.writeCommentPresenterProvider = writeCommentPresenterProvider;
  }

  public static MembersInjector<WriteCommentActivity> create(
      Provider<WriteCommentPresenter> writeCommentPresenterProvider) {
    return new WriteCommentActivity_MembersInjector(writeCommentPresenterProvider);
  }

  @Override
  public void injectMembers(WriteCommentActivity instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.writeCommentPresenter = writeCommentPresenterProvider.get();
  }

  public static void injectWriteCommentPresenter(
      WriteCommentActivity instance,
      Provider<WriteCommentPresenter> writeCommentPresenterProvider) {
    instance.writeCommentPresenter = writeCommentPresenterProvider.get();
  }
}