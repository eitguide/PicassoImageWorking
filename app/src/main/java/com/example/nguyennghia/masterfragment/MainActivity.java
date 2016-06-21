package com.example.nguyennghia.masterfragment;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.DatePicker;
import android.widget.ImageView;
import android.widget.TimePicker;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class MainActivity extends AppCompatActivity implements DatePickerDialog.OnDateSetListener, TimePickerDialog.OnTimeSetListener {

    private static final String TAG = "MainActivity";
    public static FragmentManager mManager;
    public static DemoFragment demoFragment = new DemoFragment();
    private ImageView ivView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ivView = (ImageView)findViewById(R.id.iv_view) ;


//
//        mManager.addOnBackStackChangedListener(new FragmentManager.OnBackStackChangedListener() {
//            @Override
//            public void onBackStackChanged() {
//                Log.i(TAG, "onBackStackChanged: Add");
//                Log.i(TAG, "onBackStackChanged:" + mManager.getFragments().size());
//            }
//        });
//
//        mManager.removeOnBackStackChangedListener(new FragmentManager.OnBackStackChangedListener() {
//            @Override
//            public void onBackStackChanged() {
//                Log.i(TAG, "onBackStackChanged: Remove");
//            }
//        });
//
//        mManager = getSupportFragmentManager();
//        FragmentTransaction transaction = mManager.beginTransaction();
//        transaction.add(R.id.fl_container, new DemoFragment(), "Demo");
//        transaction.addToBackStack("HIHI");
//        transaction.commit();

        Picasso.with(this).load("https://stssanfy.com/wp-content/uploads/2016/06/Clipboard-Buffer-in-Android-Studio-1.png").rotate(45).into(ivView);
//
//        MyBottomSheetDialogFragment d = new MyBottomSheetDialogFragment();
//        d.show(getSupportFragmentManager(), "Nghia");

//        TimePickerFragment d = new TimePickerFragment();
//        d.show(getFragmentManager(), "datePicker");

    }


    @Override
    public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
        Log.i(TAG, "onDateSet: ");
    }


    @Override
    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
        Log.i(TAG, "onTimeSet: ");
    }
}
