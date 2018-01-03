// Generated code from Butter Knife. Do not modify!
package com.example.jiangmingyu.dribbooo.dribbble.auth;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Finder;
import butterknife.internal.ViewBinder;
import java.lang.IllegalStateException;
import java.lang.Object;
import java.lang.Override;

public class AuthActivity$$ViewBinder<T extends AuthActivity> implements ViewBinder<T> {
  @Override
  public Unbinder bind(final Finder finder, final T target, Object source) {
    InnerUnbinder unbinder = createUnbinder(target);
    View view;
    view = finder.findRequiredView(source, 2131558559, "field 'progressBar'");
    target.progressBar = finder.castView(view, 2131558559, "field 'progressBar'");
    view = finder.findRequiredView(source, 2131558557, "field 'webView'");
    target.webView = finder.castView(view, 2131558557, "field 'webView'");
    view = finder.findRequiredView(source, 2131558558, "field 'toolbar'");
    target.toolbar = finder.castView(view, 2131558558, "field 'toolbar'");
    return unbinder;
  }

  protected InnerUnbinder<T> createUnbinder(T target) {
    return new InnerUnbinder(target);
  }

  protected static class InnerUnbinder<T extends AuthActivity> implements Unbinder {
    private T target;

    protected InnerUnbinder(T target) {
      this.target = target;
    }

    @Override
    public final void unbind() {
      if (target == null) throw new IllegalStateException("Bindings already cleared.");
      unbind(target);
      target = null;
    }

    protected void unbind(T target) {
      target.progressBar = null;
      target.webView = null;
      target.toolbar = null;
    }
  }
}
