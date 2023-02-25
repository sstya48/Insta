package com.example.instagramstorysaver2023.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import com.example.instagramstorysaver2023.Adapter.PagerAdapter;
import com.example.instagramstorysaver2023.R;
import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    TabLayout include;
    TabItem mphoto,mvideo,mreel,mprofile,migtv;

    Toolbar toolbar;
    PagerAdapter pagerAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar=findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        mphoto=findViewById(R.id.photo);
        mvideo=findViewById(R.id.video);
        mreel=findViewById(R.id.reel);
        mprofile=findViewById(R.id.profilepic);
        migtv=findViewById(R.id.igtv);


        ViewPager viewPager=findViewById(R.id.frame_container);

        include=findViewById(R.id.include);

        pagerAdapter=new PagerAdapter(getSupportFragmentManager(),5);

        viewPager.setAdapter(pagerAdapter);

        include.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
                if (tab.getPosition() == 0 || tab.getPosition() == 1 || tab.getPosition() == 2 || tab.getPosition() == 3 || tab.getPosition() == 4) {

                    pagerAdapter.notifyDataSetChanged();
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(include));
    }
}