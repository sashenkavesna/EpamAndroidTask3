package com.epam.androidlab.epamandroidtask3;

import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

import java.util.List;

public class ThirdActivity extends MainActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.setActivityInfo(this.getLocalClassName(),SecondActivity.class);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
    }
}
