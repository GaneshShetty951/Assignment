package com.example.ganeshshetty.assignment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by user on 10-07-2015.
 */
public class Myadapter extends FragmentPagerAdapter {
    public Myadapter(FragmentManager fm){
        super(fm);
    }
    @Override
    public Fragment getItem(int i) {
        switch (i){
            case 0 : return new ListFragment();
            case 1 : return new ImageFragment();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Override
    public CharSequence getPageTitle(int position){
        switch (position){
            case 0 : return "LIST";
            case 1 : return "IMAGE";
        }
        return super.getPageTitle(position);
    }
}
