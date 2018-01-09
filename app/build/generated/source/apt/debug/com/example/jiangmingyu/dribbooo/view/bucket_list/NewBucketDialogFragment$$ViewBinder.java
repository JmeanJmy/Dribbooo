// Generated code from Butter Knife. Do not modify!
package com.example.jiangmingyu.dribbooo.view.bucket_list;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Finder;
import butterknife.internal.ViewBinder;
import java.lang.IllegalStateException;
import java.lang.Object;
import java.lang.Override;

public class NewBucketDialogFragment$$ViewBinder<T extends NewBucketDialogFragment> implements ViewBinder<T> {
  @Override
  public Unbinder bind(final Finder finder, final T target, Object source) {
    InnerUnbinder unbinder = createUnbinder(target);
    View view;
    view = finder.findRequiredView(source, 2131624109, "field 'bucket_name'");
    target.bucket_name = finder.castView(view, 2131624109, "field 'bucket_name'");
    view = finder.findRequiredView(source, 2131624110, "field 'bucket_description'");
    target.bucket_description = finder.castView(view, 2131624110, "field 'bucket_description'");
    return unbinder;
  }

  protected InnerUnbinder<T> createUnbinder(T target) {
    return new InnerUnbinder(target);
  }

  protected static class InnerUnbinder<T extends NewBucketDialogFragment> implements Unbinder {
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
      target.bucket_name = null;
      target.bucket_description = null;
    }
  }
}
