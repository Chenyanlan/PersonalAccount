package com.zucc.cyl31501391;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;

import com.robinhood.ticker.TickerUtils;
import com.robinhood.ticker.TickerView;
import com.zucc.cyl31501391.Adapter.MainViewPagerAdapter;
import com.zucc.cyl31501391.Bean.RecordBean;

public class MainActivity extends AppCompatActivity {
    private TickerView tickerView;
    private ViewPager viewPager;
    private MainViewPagerAdapter pagerAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setElevation(0);

        viewPager =(ViewPager) findViewById(R.id.viewpager);
        pagerAdapter = new MainViewPagerAdapter(getSupportFragmentManager());
        pagerAdapter.notifyDataSetChanged();
        viewPager.setAdapter(pagerAdapter);
        viewPager.setCurrentItem(pagerAdapter.getLastIndex());

    }
}
