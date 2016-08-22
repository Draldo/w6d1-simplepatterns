package com.example.draldo.simplepatterns.Factory;

import android.util.Log;

/**
 * Created by Draldo on 22/08/2016.
 */
public class Fish implements Animal{

    private static final String TAG = "FishTAG_";

    @Override
    public void eat() {
        Log.d(TAG, "eat: " + this);
    }

    @Override
    public void sleep() {
        Log.d(TAG, "sleep: " + this);
    }

    public void swim() {
        Log.d(TAG, "swim: " + this);
    }
}
