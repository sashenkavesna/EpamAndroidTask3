package com.epam.androidlab.epamandroidtask3;

import android.os.Bundle;

public class SecondActivity extends MainActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.setActivityInfo(this.getLocalClassName(),ThirdActivity.class);
        super.setButtonText(getString(R.string.button_activity3_start));
        super.onCreate(savedInstanceState);
    }
}
