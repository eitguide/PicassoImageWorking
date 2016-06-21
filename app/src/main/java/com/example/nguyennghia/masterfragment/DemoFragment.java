package com.example.nguyennghia.masterfragment;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.FloatRange;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by NguyenNghia on 6/21/2016.
 */
public class DemoFragment extends Fragment {
    private static final String TAG = "DemoFragment";
    private static final boolean DEBUG = false;
    public static FragmentManager mManager;
    private View mRootView;
    private Button btnAdd;
    private Button btnRemove;
    private List<String> backStackName = new ArrayList<>();
    static int index = 0;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.i(TAG, "onAttach: ");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(TAG, "onCreate: ");
    }


    @Override
    public void onSaveInstanceState(Bundle outState) {
        Log.i(TAG, "onSaveInstanceState: ");
        super.onSaveInstanceState(outState);
    }

    @Override
    public void onViewStateRestored(@Nullable Bundle savedInstanceState) {
        super.onViewStateRestored(savedInstanceState);
        Log.i(TAG, "onViewStateRestored: ");
    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.i(TAG, "onActivityCreated: ");

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Log.i(TAG, "onCreateView: ");
        mRootView = inflater.inflate(R.layout.fragment_layout, container, false);
        for (int i = 0; i < 100; i++) {
            backStackName.add("item " + i);
        }
        return mRootView;

    }

    @Override
    public void onViewCreated(final View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Log.i(TAG, "onViewCreated: ");

        btnAdd = (Button) view.findViewById(R.id.btn_add);
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG, "onClick: " + this);
                view.setBackgroundColor(Color.BLUE);

                FragmentTransaction tran = MainActivity.mManager.beginTransaction();
               // tran.add(R.id.fl_container, new DemoFragment(), "Detail");
                Log.i(TAG, "onClick: " + backStackName.get(index));
                tran.addToBackStack(backStackName.get(index));
                tran.commit();
                index++;


                Log.i(TAG, "onClick: " + MainActivity.mManager.getBackStackEntryCount());
                for (int i = 0; i < MainActivity.mManager.getBackStackEntryCount(); i++) {
                    Log.i(TAG, "onClick: " + MainActivity.mManager.getBackStackEntryAt(i));
                }

            }

        });

        btnRemove = (Button) view.findViewById(R.id.btn_remove);
        btnRemove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.mManager.popBackStackImmediate();

//                Fragment frag = MainActivity.mManager.findFragmentByTag("Detail");
//                Log.i(TAG, "onClick: " + frag);
//                if (frag != null) {
//                    FragmentTransaction tran = MainActivity.mManager.beginTransaction();
//                    tran.remove(frag);
//                    tran.commit();
//                }
//
                Log.i(TAG, "onClick: " + MainActivity.mManager.getBackStackEntryCount());
            }
        });
    }

        @Override
        public void onStart () {
            super.onStart();
            Log.i(TAG, "onStart: ");
        }

        @Override
        public void onResume () {
            super.onResume();
            Log.i(TAG, "onResume: ");
        }

        @Override
        public void onPause () {
            super.onPause();
            Log.i(TAG, "onPause: ");
        }

        @Override
        public void onStop () {
            super.onStop();
            Log.i(TAG, "onStop: ");
        }

        @Override
        public void onDestroyView () {
            super.onDestroyView();
            Log.i(TAG, "onDestroyView: ");
        }

        @Override
        public void onDestroy () {
            Log.i(TAG, "onDestroy: ");
            Log.i(TAG, "onDestroy: " + MainActivity.mManager.getBackStackEntryCount());
            super.onDestroy();
        }

        @Override
        public void onDetach () {
            Log.i(TAG, "onDetach: ");
            super.onDetach();
        }
    }

