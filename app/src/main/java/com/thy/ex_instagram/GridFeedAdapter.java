package com.thy.ex_instagram;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

/**
 * Created by alofo on 2018-03-19.
 */

public class GridFeedAdapter extends RecyclerView.Adapter {

    Context context;
    ArrayList<Feed> feeds;

    public GridFeedAdapter(Context context, ArrayList<Feed> feeds) {
        this.context = context;
        this.feeds = feeds;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View gridFeedView = LayoutInflater.from(context).inflate(R.layout.recycler_item_grid, parent, false);

        VH holder = new VH(gridFeedView);

        return holder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        VH vh = (VH)holder;

        Feed feed = feeds.get(position);

        vh.tvTitle.setText(feed.title);

        Glide.with(context).load(feed.getImageURL()).into(vh.imageView);
    }

    @Override
    public int getItemCount() {
        return feeds.size();
    }

    class VH extends RecyclerView.ViewHolder{

        TextView tvTitle;
        ImageView imageView;

        public VH(View itemView) {
            super(itemView);

            tvTitle = itemView.findViewById(R.id.tv_title);
            imageView = itemView.findViewById(R.id.iv_imgage);
        }
    }

}
