// Generated code from Butter Knife. Do not modify!
package com.example.jiangmingyu.dribbooo.view.bucket_list;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Finder;
import butterknife.internal.ViewBinder;
import java.lang.IllegalStateException;
import java.lang.Object;
import java.lang.Override;

public class BucketListFragment$$ViewBinder<T extends BucketListFragment> implements ViewBinder<T> {
  @Override
  public Unbinder bind(final Finder finder, final T target, Object source) {
    InnerUnbinder unbinder = createUnbinder(target);
    View view;
    view = finder.findRequiredView(source, 2131558574, "field 'recyclerView'");
    target.recyclerView = finder.castView(view, 2131558574, "field 'recyclerView'");
    view = finder.findRequiredView(source, 2131558575, "field 'fab'");
    target.fab = finder.castView(view, 2131558575, "field 'fab'");
    return unbinder;
  }

  protected InnerUnbinder<T> createUnbinder(T target) {
    return new InnerUnbinder(target);
  }

  protected static class InnerUnbinder<T extends BucketListFragment> implements Unbinder {
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
      target.recyclerView = null;
      target.fab = null;
    }
  }
}
