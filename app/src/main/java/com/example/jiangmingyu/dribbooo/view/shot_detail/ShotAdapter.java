package com.example.jiangmingyu.dribbooo.view.shot_detail;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.jiangmingyu.dribbooo.R;
import com.example.jiangmingyu.dribbooo.model.Shot;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.interfaces.DraweeController;
import com.squareup.picasso.Picasso;

/**
 * Created by jiangmingyu on 2017/12/30.
 */

public class ShotAdapter extends RecyclerView.Adapter {

    private static final int VIEW_TYPE_SHOT_IMAGE = 0;
    private static final int VIEW_TYPE_SHOT_INFO = 1;

    private final Shot shot;
    public ShotAdapter(Shot shot){this.shot = shot;}
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view;
        switch(viewType){
            case VIEW_TYPE_SHOT_IMAGE:
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.shot_item_image, parent, false);
                return new ImageViewHolder(view);
            case VIEW_TYPE_SHOT_INFO:
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.shot_item_info, parent, false);
                return new InfoViewHolder(view);

            default:
                return null;
        }

    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        final int viewType = getItemViewType(position);
        switch (viewType) {
            case VIEW_TYPE_SHOT_IMAGE:
                // do nothing, we just show the image specified in shot_item_image.xml
//                Picasso.with(holder.itemView.getContext())
//                        .load(shot.getImageUrl())
//                        .placeholder(R.drawable.shot_placeholder)
//                        .into(((ImageViewHolder) holder).image);
                DraweeController controller = Fresco.newDraweeControllerBuilder()
                        .setUri(Uri.parse(shot.getImageUrl()))
                        .setAutoPlayAnimations(true)
                        .build();
                ((ImageViewHolder) holder).image.setController(controller);
                break;
            case VIEW_TYPE_SHOT_INFO:
                InfoViewHolder shotDetailViewHolder = (InfoViewHolder) holder;
                shotDetailViewHolder.title.setText(shot.title);
                shotDetailViewHolder.authorName.setText(shot.user.name);
                shotDetailViewHolder.description.setText(Html.fromHtml(
                        shot.description == null ? "" : shot.description));
//                shotDetailViewHolder.authorPicture.setImageURI(Uri.parse(shot.user.avatar_url));

                Picasso.with(holder.itemView.getContext())
                        .load(shot.user.avatar_url)
                        .placeholder(R.drawable.user_picture_placeholder)
                        .into((shotDetailViewHolder.authorPicture));

                shotDetailViewHolder.likeCount.setText(String.valueOf(shot.likes_count));
                shotDetailViewHolder.bucketCount.setText(String.valueOf(shot.buckets_count));
                shotDetailViewHolder.viewCount.setText(String.valueOf(shot.views_count));
                shotDetailViewHolder.shareButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        share(v.getContext());
                    }
                });
                break;
        }

    }

    private void share(Context context) {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_SEND);
        intent.putExtra(Intent.EXTRA_TEXT, shot.title + " " + shot.html_url);
        intent.setType("text/plain");
        context.startActivity(Intent.createChooser(intent,
                context.getString(R.string.share_shot)));
    }

    @Override
    public int getItemCount() {
        return 2;
    }

    @Override
    public int getItemViewType(int position) {
        if (position == 0) {
            return VIEW_TYPE_SHOT_IMAGE;
        } else {
            return VIEW_TYPE_SHOT_INFO;
        }
    }
}
