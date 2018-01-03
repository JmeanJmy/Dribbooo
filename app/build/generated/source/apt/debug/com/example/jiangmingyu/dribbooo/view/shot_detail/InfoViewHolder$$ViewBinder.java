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
    view = finder.findRequiredView(source, 2131558611, "field 'title'");
    target.title = finder.castView(view, 2131558611, "field 'title'");
    view = finder.findRequiredView(source, 2131558613, "field 'description'");
    target.description = finder.castView(view, 2131558613, "field 'description'");
    view = finder.findRequiredView(source, 2131558610, "field 'authorPicture'");
    target.authorPicture = finder.castView(view, 2131558610, "field 'authorPicture'");
    view = finder.findRequiredView(source, 2131558612, "field 'authorName'");
    target.authorName = finder.castView(view, 2131558612, "field 'authorName'");
    view = finder.findRequiredView(source, 2131558582, "field 'likeCount'");
    target.likeCount = finder.castView(view, 2131558582, "field 'likeCount'");
    view = finder.findRequiredView(source, 2131558581, "field 'viewCount'");
    target.viewCount = finder.castView(view, 2131558581, "field 'viewCount'");
    view = finder.findRequiredView(source, 2131558583, "field 'bucketCount'");
    target.bucketCount = finder.castView(view, 2131558583, "field 'bucketCount'");
    view = finder.findRequiredView(source, 2131558607, "field 'likeButton'");
    target.likeButton = finder.castView(view, 2131558607, "field 'likeButton'");
    view = finder.findRequiredView(source, 2131558608, "field 'bucketButton'");
    target.bucketButton = finder.castView(view, 2131558608, "field 'bucketButton'");
    view = finder.findRequiredView(source, 2131558609, "field 'shareButton'");
    target.shareButton = finder.castView(view, 2131558609, "field 'shareButton'");
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
