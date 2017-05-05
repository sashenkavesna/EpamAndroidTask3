package com.epam.androidlab.epamandroidtask3;

import android.os.Bundle;
import android.widget.RelativeLayout;

public class FirstActivity extends MainActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.setActivityInfo(this.getLocalClassName(),SecondActivity.class);
        super.setButtonText(getString(R.string.button_activity2_start));
        super.onCreate(savedInstanceState);
    }

}
