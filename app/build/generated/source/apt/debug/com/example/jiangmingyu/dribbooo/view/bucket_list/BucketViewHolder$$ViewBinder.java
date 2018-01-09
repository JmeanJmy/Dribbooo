// Generated code from Butter Knife. Do not modify!
package com.example.jiangmingyu.dribbooo.view.bucket_list;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Finder;
import butterknife.internal.ViewBinder;
import java.lang.IllegalStateException;
import java.lang.Object;
import java.lang.Override;

public class BucketViewHolder$$ViewBinder<T extends BucketViewHolder> implements ViewBinder<T> {
  @Override
  public Unbinder bind(final Finder finder, final T target, Object source) {
    InnerUnbinder unbinder = createUnbinder(target);
    View view;
    view = finder.findRequiredView(source, 2131624118, "field 'bucketLayout'");
    target.bucketLayout = view;
    view = finder.findRequiredView(source, 2131624115, "field 'bucketName'");
    target.bucketName = finder.castView(view, 2131624115, "field 'bucketName'");
    view = finder.findRequiredView(source, 2131624117, "field 'bucketShotCount'");
    target.bucketShotCount = finder.castView(view, 2131624117, "field 'bucketShotCount'");
    view = finder.findRequiredView(source, 2131624116, "field 'bucketChosen'");
    target.bucketChosen = finder.castView(view, 2131624116, "field 'bucketChosen'");
    return unbinder;
  }

  protected InnerUnbinder<T> createUnbinder(T target) {
    return new InnerUnbinder(target);
  }

  protected static class InnerUnbinder<T extends BucketViewHolder> implements Unbinder {
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
      target.bucketLayout = null;
      target.bucketName = null;
      target.bucketShotCount = null;
      target.bucketChosen = null;
    }
  }
}
