package com.example.instagramstorysaver2023.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.instagramstorysaver2023.R;

public class ProfilePicFragment extends Fragment {


    public ProfilePicFragment() {
        // Required empty public constructor
    }


    public static ProfilePicFragment newInstance() {
        ProfilePicFragment fragment = new ProfilePicFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_profile_pic, container, false);

        return view;
    }
}