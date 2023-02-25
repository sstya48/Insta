package com.example.instagramstorysaver2023.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.instagramstorysaver2023.R;


public class IGTVFragment extends Fragment {


    public IGTVFragment() {
        // Required empty public constructor
    }

    public static IGTVFragment newInstance() {
        IGTVFragment fragment = new IGTVFragment();
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

        View view= inflater.inflate(R.layout.fragment_i_g_t_v, container, false);

        return view;
    }
}