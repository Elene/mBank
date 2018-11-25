package com.example.elenek.mbank.ui.main;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.elenek.mbank.R;

public class MainActivity extends AppCompatActivity {
    private ViewPager vpFragment;
    private TabLayout tlTabs;

    private MainViewPagerAdapter mainViewPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        vpFragment = findViewById(R.id.activity_main_vp_fragment);
        tlTabs = findViewById(R.id.activity_main_tl_tabs);

        mainViewPagerAdapter = new MainViewPagerAdapter(getSupportFragmentManager(), this);
        vpFragment.setAdapter(mainViewPagerAdapter);

       // vpFragment.setBackgroundResource(R.drawable.ic_day_bg);

        tlTabs.setupWithViewPager(vpFragment);
    }
}
