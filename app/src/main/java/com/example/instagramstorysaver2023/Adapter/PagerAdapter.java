package com.example.instagramstorysaver2023.Adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.instagramstorysaver2023.Fragment.IGTVFragment;
import com.example.instagramstorysaver2023.Fragment.PhotoFragment;
import com.example.instagramstorysaver2023.Fragment.ProfilePicFragment;
import com.example.instagramstorysaver2023.Fragment.ReelFragment;
import com.example.instagramstorysaver2023.Fragment.VideoFragment;

public class PagerAdapter extends FragmentPagerAdapter {

    int tabcount;

    public PagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
        tabcount = behavior;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                return new PhotoFragment();
            case 1:
                return new VideoFragment();
            case 2:
                return new ReelFragment();
            case 3:
                return new IGTVFragment();
            case 4:
                return new ProfilePicFragment();

            default:
                return null;

        }
    }

    @Override
    public int getCount() {
        return tabcount;
    }
}
