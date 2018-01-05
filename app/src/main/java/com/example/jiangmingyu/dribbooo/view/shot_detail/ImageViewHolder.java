package com.example.jiangmingyu.dribbooo.view.shot_detail;

import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.facebook.drawee.view.SimpleDraweeView;

/**
 * Created by jiangmingyu on 2017/12/30.
 */

public class ImageViewHolder extends RecyclerView.ViewHolder {

    SimpleDraweeView image;
    public ImageViewHolder(View itemView) {
        super(itemView);
        image = (SimpleDraweeView) itemView;
    }
}
