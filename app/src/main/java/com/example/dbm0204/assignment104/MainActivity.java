package com.example.dbm0204.assignment104;

import android.app.ActionBar;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

/**
 * The mainActivity which extends FragmentActivity
 * and instantiates the actionbar
 */
public class MainActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupTabs();
    }

    private void setupTabs() {
        ActionBar actionBar = getActionBar();
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
        actionBar.setDisplayShowTitleEnabled(true);

        ActionBar.Tab tab1 = actionBar
                .newTab()
                .setText("First")
                .setIcon(R.drawable.audio)
                .setTabListener(
                        new FragmentTabListener<AudioTab>(R.id.frameLayoutAudio, this, "first",
                                AudioTab.class));

        actionBar.addTab(tab1);
        actionBar.selectTab(tab1);

        ActionBar.Tab tab2 = actionBar
                .newTab()
                .setText("Second")
                .setIcon(R.drawable.video)
                .setTabListener(
                        new FragmentTabListener<VideoTab>(R.id.frameLayoutVideo, this, "second",
                                VideoTab.class));

        actionBar.addTab(tab2);
    }
}
