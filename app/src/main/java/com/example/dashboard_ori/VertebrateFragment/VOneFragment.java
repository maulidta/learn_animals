package com.example.dashboard_ori.VertebrateFragment;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.dashboard_ori.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class VOneFragment extends Fragment {
    private Button btnTextInd, btnTextEng;

    public VOneFragment() {
        // Required empty public constructor

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_vone, container, false);
        btnTextInd = v.findViewById(R.id.changetextbtnInd);
        btnTextEng = v.findViewById(R.id.changetextbtnIng);
        return v;

    }

}
