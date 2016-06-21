package com.example.nguyennghia.masterfragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by NguyenNghia on 6/21/2016.
 */
public class FragmentDetail extends Fragment {
    private static final String TAG = "FragmentDetail";
    private Button btnInfo;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_detail, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        btnInfo = (Button) view.findViewById(R.id.btn_info);
        btnInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG, "onClick: " + MainActivity.mManager);
                Log.i(TAG, "onClick:  " + MainActivity.mManager.getBackStackEntryCount());
                Log.i(TAG, "onClick: " + MainActivity.mManager.findFragmentByTag("Demo"));

                Log.i(TAG, "onClick: " + DemoFragment.mManager);
                Log.i(TAG, "onClick: " + DemoFragment.mManager.getBackStackEntryCount());


                Log.i(TAG, "onClick: " + this);
                Log.i(TAG, "onClick: " + getChildFragmentManager());
                Log.i(TAG, "onClick: " + getFragmentManager());
                Log.i(TAG, "onClick: " + getParentFragment());
                Log.i(TAG, "onClick: " + DemoFragment.mManager.findFragmentByTag("Detail"));
            }
        });
    }
}
