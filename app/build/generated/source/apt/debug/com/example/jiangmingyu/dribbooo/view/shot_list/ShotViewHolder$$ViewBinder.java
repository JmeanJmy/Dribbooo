// Generated code from Butter Knife. Do not modify!
package com.example.jiangmingyu.dribbooo.view.shot_list;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Finder;
import butterknife.internal.ViewBinder;
import java.lang.IllegalStateException;
import java.lang.Object;
import java.lang.Override;

public class ShotViewHolder$$ViewBinder<T extends ShotViewHolder> implements ViewBinder<T> {
  @Override
  public Unbinder bind(final Finder finder, final T target, Object source) {
    InnerUnbinder unbinder = createUnbinder(target);
    View view;
    view = finder.findRequiredView(source, 2131624123, "field 'cover'");
    target.cover = view;
    view = finder.findRequiredView(source, 2131624121, "field 'likeCount'");
    target.likeCount = finder.castView(view, 2131624121, "field 'likeCount'");
    view = finder.findRequiredView(source, 2131624122, "field 'bucketCount'");
    target.bucketCount = finder.castView(view, 2131624122, "field 'bucketCount'");
    view = finder.findRequiredView(source, 2131624120, "field 'viewCount'");
    target.viewCount = finder.castView(view, 2131624120, "field 'viewCount'");
    view = finder.findRequiredView(source, 2131624119, "field 'image'");
    target.image = finder.castView(view, 2131624119, "field 'image'");
    return unbinder;
  }

  protected InnerUnbinder<T> createUnbinder(T target) {
    return new InnerUnbinder(target);
  }

  protected static class InnerUnbinder<T extends ShotViewHolder> implements Unbinder {
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
      target.cover = null;
      target.likeCount = null;
      target.bucketCount = null;
      target.viewCount = null;
      target.image = null;
    }
  }
}
