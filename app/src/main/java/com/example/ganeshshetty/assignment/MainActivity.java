package com.example.ganeshshetty.assignment;

import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity implements ActionBar.TabListener {
    ViewPager pager;
    ActionBar actionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pager = (ViewPager) findViewById(R.id.viewpager);
        Myadapter myadapter = new Myadapter(getSupportFragmentManager());
        pager.setAdapter(myadapter);
        pager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {

            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                Log.d("pager", "onpage scrolled");
            }

            @Override
            public void onPageSelected(int position) {
                Log.d("pager", "onpage selected");
                actionBar.setSelectedNavigationItem(position);
            }

            @Override
            public void onPageScrollStateChanged(int state) {
                Log.d("pager", "onpage scrolledstate changed");
            }
        });
        actionBar = getSupportActionBar();
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);

        ActionBar.Tab tab1 = actionBar.newTab();
        tab1.setText("Movies");
        tab1.setTabListener(this);

        ActionBar.Tab tab2 = actionBar.newTab();
        tab2.setText("Games");
        tab2.setTabListener(this);


        actionBar.addTab(tab1);
        actionBar.addTab(tab2);

    }

    @Override
    public void onTabSelected(ActionBar.Tab tab, FragmentTransaction ft) {
        pager.setCurrentItem(tab.getPosition());
    }

    @Override
    public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction ft) {

    }

    @Override
    public void onTabReselected(ActionBar.Tab tab, FragmentTransaction ft) {

    }
}
