package com.example.dashboard_ori.VertebrateFragment;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.dashboard_ori.R;

public class VBirdFragment extends Fragment {

    public VBirdFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_vbird, container, false);
    }

}
