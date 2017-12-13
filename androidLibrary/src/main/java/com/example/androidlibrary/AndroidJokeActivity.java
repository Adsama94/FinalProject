package com.example.androidlibrary;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class AndroidJokeActivity extends AppCompatActivity {

    private static final String JOKE_EXTRA_KEY = "passed_joke";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android_joke);
        TextView jokeTv = (TextView) findViewById(R.id.passed_joke_tv);
        String passedJoke = getIntent().getStringExtra(JOKE_EXTRA_KEY);
        jokeTv.setText(passedJoke);
    }
}