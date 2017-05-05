package com.framgia.soundcloudmusic.main.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.framgia.soundcloudmusic.R;
import com.framgia.soundcloudmusic.main.model.Track;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by admin on 5/5/2017.
 */
public class TrackAdapter extends RecyclerView.Adapter<TrackAdapter.RecyclerViewHolder> {
    private List<Track> mListTrack = new ArrayList<>();
    private Context mContext;

    public TrackAdapter(List<Track> mListTrack, Context mContext) {
        this.mListTrack = mListTrack;
        this.mContext = mContext;
    }

    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater mInflater = LayoutInflater.from(parent.getContext());
        View mItemView = mInflater.inflate(R.layout.item_listview_chart, parent, false);
        return new RecyclerViewHolder(mItemView);
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {
        holder.mTextTitle.setText(mListTrack.get(position).getmTitle());
        holder.mTextUsername.setText(mListTrack.get(position).getmUserName());
        holder.mTextNumber.setText(position+1+"");
//        Picasso.
//            with(mContext).
//            load(String.valueOf(mListTrack.get(position).
//            getmArtWorkUrl())).into(holder.mImageArtwork);
    }

    @Override
    public int getItemCount() {
        return mListTrack.size();
    }

    public Track getItem(int position) {
        return mListTrack.get(position);
    }

    public class RecyclerViewHolder extends RecyclerView.ViewHolder {
        private TextView mTextNumber;
        private ImageView mImageArtwork;
        private TextView mTextTitle;
        private TextView mTextUsername;

        public RecyclerViewHolder(View itemView) {
            super(itemView);
            mTextNumber = (TextView) itemView.findViewById(R.id.text_number);
            mImageArtwork = (ImageView) itemView.findViewById(R.id.image_Artwork);
            mTextTitle = (TextView) itemView.findViewById(R.id.text_title);
            mTextUsername = (TextView) itemView.findViewById(R.id.text_username);
        }
    }
}
