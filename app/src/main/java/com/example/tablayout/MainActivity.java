package com.example.tablayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;
    TabLayout tabLayout;
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar=(Toolbar)findViewById(R.id.toolbar_id);
        setSupportActionBar(toolbar);
        viewPager=(ViewPager)findViewById(R.id.viewpager_id);
        ViewPagerAdapter adapter=new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new OneFragment(),"ITEM ONE");
        adapter.addFragment(new TwoFragment(),"ITEM TWO");
        adapter.addFragment(new TwoFragment(),"ITEM THREE");

        viewPager.setAdapter(adapter);
        tabLayout=(TabLayout)findViewById(R.id.tabLayout_id);
        tabLayout.setupWithViewPager(viewPager);

    }
}
