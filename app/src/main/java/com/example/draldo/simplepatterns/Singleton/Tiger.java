package com.example.draldo.simplepatterns.Singleton;

import android.os.Bundle;
import android.util.Log;

/**
 * Created by Draldo on 22/08/2016.
 */
public class Tiger {

    private static final String TAG = "TAG_";
    private static Tiger instance;

    private Tiger() {

    }

    public static Tiger getInstance() {
        if (instance == null){
            instance = new Tiger();
        }
        return instance;
    }

    public void eat() {
        Log.d(TAG, "eat: " + this);
    }
}
