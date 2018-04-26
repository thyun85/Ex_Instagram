package com.thy.ex_instagram;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import org.w3c.dom.Text;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Created by alofo on 2018-03-16.
 */

public class FeedAdapter extends RecyclerView.Adapter {

    Context context;
    ArrayList<Feed> feeds;

    public FeedAdapter(Context context, ArrayList<Feed> feeds) {
        this.context = context;
        this.feeds = feeds;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(context);
        View feedView = inflater.inflate(R.layout.recycler_item, parent, false);

        VH holder = new VH(feedView);

        return holder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        VH vh = (VH)holder;

        Feed feed = feeds.get(position);

        vh.tvTitle.setText(feed.title);
        vh.tvLocation.setText(feed.location);
        vh.tvMessage.setText(feed.message);
        vh.tvTimes.setText(feed.times);

        Glide.with(context).load(feed.icon).into(vh.ivIcon);
        Glide.with(context).load(feed.getImageURL()).into(vh.imageView);

    }

    @Override
    public int getItemCount() {
        return feeds.size();
    }

    class VH extends RecyclerView.ViewHolder{

        CircleImageView ivIcon;
        TextView tvTitle, tvLocation, tvMessage, tvTimes;
        ImageView imageView;

        public VH(View itemView) {
            super(itemView);

            ivIcon = itemView.findViewById(R.id.iv_icon);
            tvTitle = itemView.findViewById(R.id.tv_title);
            tvLocation = itemView.findViewById(R.id.tv_location);
            tvMessage = itemView.findViewById(R.id.tv_message);
            tvTimes = itemView.findViewById(R.id.tv_times);
            imageView = itemView.findViewById(R.id.iv_imgage);
        }
    }
}
