package com.framgia.soundcloudmusic.main;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.framgia.soundcloudmusic.R;
import com.framgia.soundcloudmusic.main.adapter.TrackAdapter;
import com.framgia.soundcloudmusic.main.model.Track;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerChart;
    private TrackAdapter mTrackAdapter;
    private List<Track> mListTrack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("home_soundcloud");

        mListTrack =new ArrayList<>();
        getListTrack(mListTrack);
        mRecyclerChart = (RecyclerView) findViewById(R.id.recycle_chart);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        mRecyclerChart.setLayoutManager(layoutManager);

        mTrackAdapter =new TrackAdapter(mListTrack,this);
        mRecyclerChart.setAdapter(mTrackAdapter);
	
    }

    private List<Track> getListTrack(List<Track> mList){
        for (int i=0;i<5;i++){
            mList.add(new Track("One thing "+i,"One direction "+i));
        }
        return mList;
    }
}
