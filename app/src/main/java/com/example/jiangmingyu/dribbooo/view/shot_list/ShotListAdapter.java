package com.example.jiangmingyu.dribbooo.view.shot_list;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.jiangmingyu.dribbooo.R;
import com.example.jiangmingyu.dribbooo.model.Shot;
import com.example.jiangmingyu.dribbooo.utils.ModelUtils;
import com.example.jiangmingyu.dribbooo.view.shot_detail.ShotActivity;
import com.example.jiangmingyu.dribbooo.view.shot_detail.ShotFragment;
import com.google.gson.reflect.TypeToken;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by jiangmingyu on 2017/12/29.
 */

public class  ShotListAdapter extends RecyclerView.Adapter {
    private static final int VIEW_TYPE_SHOT = 1;
    private static final int VIEW_TYPE_LOADING = 2;
    private boolean showLoading;
    private LoadMoreListener loadMoreListener;
    private List<Shot> data;

    public ShotListAdapter(@NonNull List<Shot> data, LoadMoreListener loadMoreListener) {
        this.data = data;
        this.loadMoreListener = loadMoreListener;
        this.showLoading = true;
    }
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if (viewType == VIEW_TYPE_SHOT) {
            View view = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.list_item_shot, parent, false);
            return new ShotViewHolder(view);
        } else {
            View view = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.list_item_loading, parent, false);
            return new RecyclerView.ViewHolder(view) {};
        }
    }

    @Override
    public void onBindViewHolder(final RecyclerView.ViewHolder holder, int position) {
        final int viewType = getItemViewType(position);
        if (viewType == VIEW_TYPE_LOADING) {
            loadMoreListener.onLoadMore();
        } else {
            final Shot shot = data.get(position);

            ShotViewHolder shotViewHolder = (ShotViewHolder) holder;
            shotViewHolder.likeCount.setText(String.valueOf(shot.likes_count));
            shotViewHolder.bucketCount.setText(String.valueOf(shot.buckets_count));
            shotViewHolder.viewCount.setText(String.valueOf(shot.views_count));

            Picasso.with(holder.itemView.getContext())
                    .load(shot.getImageUrl())
                    .placeholder(R.drawable.shot_placeholder)
                    .into(shotViewHolder.image);
            Picasso.with(holder.itemView.getContext()).setLoggingEnabled(true);

            shotViewHolder.cover.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Context context = holder.itemView.getContext();
                    Intent intent = new Intent(context, ShotActivity.class);
                    intent.putExtra(ShotFragment.KEY_SHOT,
                            ModelUtils.toString(shot, new TypeToken<Shot>(){}));
                    intent.putExtra(ShotActivity.KEY_SHOT_TITLE, shot.title);
                    context.startActivity(intent);
                }
            });
        }
    }

    @Override
    public int getItemCount() {
        return showLoading ? data.size() + 1 : data.size();
    }

    @Override
    public int getItemViewType(int position) {
        return position < data.size()
                ? VIEW_TYPE_SHOT
                : VIEW_TYPE_LOADING;
    }

    public void append(@NonNull List<Shot> moreShots) {
        data.addAll(moreShots);
        notifyDataSetChanged();
    }

    public int getDataCount() {
        return data.size();
    }

    public void setShowLoading(boolean showLoading) {
        this.showLoading = showLoading;
        notifyDataSetChanged();
    }

    public interface LoadMoreListener {
        void onLoadMore();
    }
}
