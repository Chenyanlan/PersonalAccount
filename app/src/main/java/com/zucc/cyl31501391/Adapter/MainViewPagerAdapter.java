package com.zucc.cyl31501391.Adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.zucc.cyl31501391.MainFragment;

import java.util.LinkedList;

public class MainViewPagerAdapter extends FragmentPagerAdapter {

    LinkedList<MainFragment>  fragments = new LinkedList<>();
    LinkedList<String> dates = new LinkedList<>();

    public MainViewPagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
        initFragments();
    }
    private void initFragments(){
        dates.add("2019-05-25");
        dates.add("2019-06-25");
        dates.add("2019-05-02");
        for(String date:dates){
            MainFragment fragment = new MainFragment(date);
            fragments.add(fragment);
        }
    }
    public int getLastIndex(){
        return fragments.size()-1;
    }
    @NonNull
    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }
}
