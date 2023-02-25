package com.example.instagramstorysaver2023.Fragment;

import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.MediaController;
import android.widget.VideoView;

import com.example.instagramstorysaver2023.R;

public class ReelFragment extends Fragment {

    String URL="NULL";
    VideoView particular_reel;
    EditText get_reel_link;
    Button get_reel,downloadReel;
    private MediaController mediaController;
    String reelurl="1";
    private Uri uri2;



    public static ReelFragment newInstance() {
        ReelFragment fragment = new ReelFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_reel, container, false);

        get_reel_link=view.findViewById(R.id.get_reel_link);
        get_reel=view.findViewById(R.id.get_reel);
        downloadReel=view.findViewById(R.id.downloadReel);
        particular_reel=view.findViewById(R.id.particular_reel);
        mediaController=new MediaController(getContext());
        mediaController.setAnchorView(particular_reel);

        get_reel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        return view;
    }
}
