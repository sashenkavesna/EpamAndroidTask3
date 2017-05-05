package com.epam.androidlab.epamandroidtask3;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;


public class StartButtonClickListener implements View.OnClickListener {
    private Context context;
    private Class activity;

    StartButtonClickListener(Context context, Class activity) {
        this.context = context;
        this.activity = activity;
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(context, activity);
        context.startActivity(intent);
    }
}
