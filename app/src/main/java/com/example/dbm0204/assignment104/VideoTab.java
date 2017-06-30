package com.example.dbm0204.assignment104;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by dbm0204 on 6/30/17.
 */

public class VideoTab extends Fragment {
    @Override
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup container, Bundle savedInstanceState){
        View view = layoutInflater.inflate(R.layout.video_fragment,container,false);

        TextView audioTextView = (TextView)view.findViewById(R.id.videoTextView);
        audioTextView.setText("Video Fragment");
        return  view;
    }
}
