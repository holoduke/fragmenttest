package com.test.fragment.gillis.testfragment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    public String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showFragmentA();
    }

    public void showFragmentA(){

        Log.d(TAG,"show fragment A");

        FragmentManager fm = getSupportFragmentManager();

        Log.d(TAG,"current fragment backstack count "+fm.getBackStackEntryCount());

        FragmentTransaction ft = fm.beginTransaction();

        Fragment f = new FragmentA();
        fm.popBackStackImmediate(null, FragmentManager.POP_BACK_STACK_INCLUSIVE);
        f.setRetainInstance(false);
        ft.replace(R.id.fragmenttarget, f);
        ft.commit();
    }

    public void showFragmentB(){

        Log.d(TAG,"show fragment B");

        FragmentManager fm = getSupportFragmentManager();

        Log.d(TAG,"current fragment backstack count "+fm.getBackStackEntryCount());

        FragmentTransaction ft = fm.beginTransaction();

        Fragment f = new FragmentB();
        f.setRetainInstance(false);
        ft.replace(R.id.fragmenttarget, f);
        ft.addToBackStack(null);
        ft.commit();
    }

    public void showFragmentC(){

        Log.d(TAG,"show fragment C");

        FragmentManager fm = getSupportFragmentManager();

        Log.d(TAG,"current fragment backstack count "+fm.getBackStackEntryCount());

        FragmentTransaction ft = fm.beginTransaction();

        Fragment f = new FragmentC();
        f.setRetainInstance(false);
        ft.replace(R.id.fragmenttarget, f);
        ft.addToBackStack(null);
        ft.commit();
    }
}
