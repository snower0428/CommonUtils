package com.example.leihui.commutils;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;

import com.github.lh.utils.ScreenUtil;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DisplayMetrics metrics = ScreenUtil.getScreenSize(this);
        float density = ScreenUtil.getDeviceDensity(this);
        Log.d(TAG, "Width: " + metrics.widthPixels + " Height: " + metrics.heightPixels);
        Log.d(TAG, "------------------------------------------------------------");
        Log.d(TAG, "Density: " + density);
    }
}
