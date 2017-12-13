package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Pair;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.example.androidlibrary.AndroidJokeActivity;
import com.example.javajokelibrary.JavaJoke;


public class MainActivity extends AppCompatActivity {

    private static final String JOKE_EXTRA_KEY = "passed_joke";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new EndpointsAsyncTask().execute(new Pair<Context, String>(this, "Manfred"));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        return id == R.id.action_settings || super.onOptionsItemSelected(item);
    }

    public void tellJoke(View view) {
        JavaJoke javaLibrary = new JavaJoke();
        String whatJoke = javaLibrary.getBadJokes();
        Toast.makeText(this, whatJoke, Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, AndroidJokeActivity.class);
        intent.putExtra(JOKE_EXTRA_KEY, whatJoke);
        startActivity(intent);
    }
}