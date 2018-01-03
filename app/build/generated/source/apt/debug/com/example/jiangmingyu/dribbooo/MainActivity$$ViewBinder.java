// Generated code from Butter Knife. Do not modify!
package com.example.jiangmingyu.dribbooo;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Finder;
import butterknife.internal.ViewBinder;
import java.lang.IllegalStateException;
import java.lang.Object;
import java.lang.Override;

public class MainActivity$$ViewBinder<T extends MainActivity> implements ViewBinder<T> {
  @Override
  public Unbinder bind(final Finder finder, final T target, Object source) {
    InnerUnbinder unbinder = createUnbinder(target);
    View view;
    view = finder.findRequiredView(source, 2131558558, "field 'toolbar'");
    target.toolbar = finder.castView(view, 2131558558, "field 'toolbar'");
    view = finder.findRequiredView(source, 2131558556, "field 'navigationView'");
    target.navigationView = finder.castView(view, 2131558556, "field 'navigationView'");
    view = finder.findRequiredView(source, 2131558554, "field 'drawerLayout'");
    target.drawerLayout = finder.castView(view, 2131558554, "field 'drawerLayout'");
    return unbinder;
  }

  protected InnerUnbinder<T> createUnbinder(T target) {
    return new InnerUnbinder(target);
  }

  protected static class InnerUnbinder<T extends MainActivity> implements Unbinder {
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
      target.toolbar = null;
      target.navigationView = null;
      target.drawerLayout = null;
    }
  }
}
