// Generated code from Butter Knife. Do not modify!
package com.example.jiangmingyu.dribbooo.view.shot_detail;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Finder;
import butterknife.internal.ViewBinder;
import java.lang.IllegalStateException;
import java.lang.Object;
import java.lang.Override;

public class InfoViewHolder$$ViewBinder<T extends InfoViewHolder> implements ViewBinder<T> {
  @Override
  public Unbinder bind(final Finder finder, final T target, Object source) {
    InnerUnbinder unbinder = createUnbinder(target);
    View view;
    view = finder.findRequiredView(source, 2131624150, "field 'title'");
    target.title = finder.castView(view, 2131624150, "field 'title'");
    view = finder.findRequiredView(source, 2131624152, "field 'description'");
    target.description = finder.castView(view, 2131624152, "field 'description'");
    view = finder.findRequiredView(source, 2131624149, "field 'authorPicture'");
    target.authorPicture = finder.castView(view, 2131624149, "field 'authorPicture'");
    view = finder.findRequiredView(source, 2131624151, "field 'authorName'");
    target.authorName = finder.castView(view, 2131624151, "field 'authorName'");
    view = finder.findRequiredView(source, 2131624121, "field 'likeCount'");
    target.likeCount = finder.castView(view, 2131624121, "field 'likeCount'");
    view = finder.findRequiredView(source, 2131624120, "field 'viewCount'");
    target.viewCount = finder.castView(view, 2131624120, "field 'viewCount'");
    view = finder.findRequiredView(source, 2131624122, "field 'bucketCount'");
    target.bucketCount = finder.castView(view, 2131624122, "field 'bucketCount'");
    view = finder.findRequiredView(source, 2131624146, "field 'likeButton'");
    target.likeButton = finder.castView(view, 2131624146, "field 'likeButton'");
    view = finder.findRequiredView(source, 2131624147, "field 'bucketButton'");
    target.bucketButton = finder.castView(view, 2131624147, "field 'bucketButton'");
    view = finder.findRequiredView(source, 2131624148, "field 'shareButton'");
    target.shareButton = finder.castView(view, 2131624148, "field 'shareButton'");
    return unbinder;
  }

  protected InnerUnbinder<T> createUnbinder(T target) {
    return new InnerUnbinder(target);
  }

  protected static class InnerUnbinder<T extends InfoViewHolder> implements Unbinder {
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
      target.title = null;
      target.description = null;
      target.authorPicture = null;
      target.authorName = null;
      target.likeCount = null;
      target.viewCount = null;
      target.bucketCount = null;
      target.likeButton = null;
      target.bucketButton = null;
      target.shareButton = null;
    }
  }
}
