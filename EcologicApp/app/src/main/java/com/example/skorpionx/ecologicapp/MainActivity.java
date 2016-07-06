package com.example.skorpionx.ecologicapp;

import android.content.Context;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private ViewPagerAdapter mSectionsPagerAdapter;
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);

        mSectionsPagerAdapter =new ViewPagerAdapter(getSupportFragmentManager());


        mViewPager = (ViewPager) findViewById(R.id.pager);
        mViewPager.setAdapter(mSectionsPagerAdapter);

    }


    public class ViewPagerAdapter extends FragmentPagerAdapter {

        final int PAGE_COUNT = 4;
        // Tab Titles
        private String tabtitles[] = new String[] { "Accommodation", "Transport", "Food","Consume" };
        Context context;

        public ViewPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public int getCount() {
            return PAGE_COUNT;
        }

        @Override
        public Fragment getItem(int position) {
            switch (position) {

                // Open FragmentTab1.java
                case 0:
                    AcommodationFragment fragmenttab1 = new AcommodationFragment();
                    return fragmenttab1;

                // Open FragmentTab2.java
                case 1:
                    TransportFragment fragmenttab2 = new TransportFragment();
                    return fragmenttab2;

                // Open FragmentTab3.java
                case 2:
                    FoodFragment fragmenttab3 = new FoodFragment();
                    return fragmenttab3;
                case 3:
                    ConsumeFragment fragmenttab4 = new ConsumeFragment();
                    return fragmenttab4;

            }
            return null;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return tabtitles[position];
        }
    }
}
