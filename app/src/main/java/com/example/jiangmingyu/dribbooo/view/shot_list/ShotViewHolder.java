package com.example.jiangmingyu.dribbooo.view.shot_list;

import android.view.View;
import android.widget.TextView;

import com.example.jiangmingyu.dribbooo.R;
import com.example.jiangmingyu.dribbooo.view.base.BaseViewHolder;
import com.facebook.drawee.view.SimpleDraweeView;

import butterknife.BindView;

/**
 * Created by jiangmingyu on 2017/12/29.
 */

public class ShotViewHolder extends BaseViewHolder {
    @BindView(R.id.shot_clickable_cover) View cover;
    @BindView(R.id.shot_like_count) TextView likeCount;
    @BindView(R.id.shot_bucket_count) TextView bucketCount;
    @BindView(R.id.shot_view_count) TextView viewCount;
    @BindView(R.id.shot_image) SimpleDraweeView image;

    public ShotViewHolder(View itemView) {
        super(itemView);
    }
}
