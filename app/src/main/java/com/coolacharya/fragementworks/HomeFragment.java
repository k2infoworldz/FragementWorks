package com.coolacharya.fragementworks;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class HomeFragment extends Fragment {

    private static final String TAG = HomeFragment.class.getSimpleName();

    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        Log.d(TAG, "The onAttach() event");
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "The onCreate() event");

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        Log.d(TAG, "The onCreateView() event");
        return view;
    }


    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Log.d(TAG, "The onViewCreated() event");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d(TAG, "The onStart() event");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d(TAG, "The onResume() event");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d(TAG, "The onPause() event");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d(TAG, "The onStop() event");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "The onDestroy() event");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d(TAG, "The onDestroyView() event");
    }

    @Override
    public void onDetach() {
        super.onDetach();

        Log.d(TAG, "The onDetach() event");
    }
}
