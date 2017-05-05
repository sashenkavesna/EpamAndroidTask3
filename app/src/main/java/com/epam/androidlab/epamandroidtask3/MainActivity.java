package com.epam.androidlab.epamandroidtask3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private String buttonText = null;
    private String activityName = null;
    private Class startingActivityClass = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(activityName, getString(R.string.on_create));
        Button button = (Button) findViewById(R.id.button);
        button.setText(buttonText);
        button.setOnClickListener(new StartButtonClickListener(this, startingActivityClass));
    }


    protected void setActivityInfo(String activityName,Class startingActivityClass) {
        this.activityName = activityName;
        this.startingActivityClass = startingActivityClass;
    }

    protected void setButtonText(String buttonText){
        this.buttonText = buttonText;
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(this.getLocalClassName(), getString(R.string.on_start));
    }


    @Override
    protected void onPause() {
        super.onPause();
        Log.d(this.getLocalClassName(), getString(R.string.on_pause));
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(this.getLocalClassName(), getString(R.string.on_restart));
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(this.getLocalClassName(), getString(R.string.on_resume));
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(this.getLocalClassName(), getString(R.string.on_stop));
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(this.getLocalClassName(), getString(R.string.on_destroy));
    }

}
