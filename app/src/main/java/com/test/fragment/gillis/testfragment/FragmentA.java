package com.test.fragment.gillis.testfragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by gillis on 02/02/2017.
 */

public class FragmentA extends Fragment {

    private String TAG = "A";
    @Override
    public View onCreateView(final LayoutInflater inflater, final ViewGroup container, final Bundle savedInstanceState) {

        Log.d(TAG,"create view fragment A");
        if (inflater == null){
            return LayoutInflater.from(getActivity()).inflate(R.layout.fragmenta, container, false);
        }
        return inflater.inflate(R.layout.fragmenta, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        Log.d(TAG,"on activity created fragment A");

        Button buttona = (Button)getView().findViewById(R.id.buttonA);
        buttona.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG,"click a");
                ((MainActivity)getActivity()).showFragmentA();
            }
        });

        Button buttonb = (Button)getView().findViewById(R.id.buttonB);
        buttonb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG,"click b");
                ((MainActivity)getActivity()).showFragmentB();
            }
        });

        Button buttonc = (Button)getView().findViewById(R.id.buttonC);
        buttonc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG,"click c");
                ((MainActivity)getActivity()).showFragmentC();
            }
        });
    }
}
