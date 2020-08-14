package com.codepath.debuggingchallenges.activities;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.codepath.debuggingchallenges.R;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.codepath.debuggingchallenges.R;

public class MainActivity extends AppCompatActivity {

    private final static String TAG = "DateBug";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG, "create first view");
    }

    private void launchActivity(Class klass) {
        Log.i(TAG, "called Launch 2");
        Intent intent = new Intent(this, klass);
        startActivity(intent);
        Log.i(TAG, "finished Launch 2");
    }

    public void launchCurrentDayActivity(View view) {
        Log.i(TAG, "called Launch");
        launchActivity(CurrentDayActivity.class);
        Log.i(TAG, "finished Launch");
    }

    public void launchMoviesActivity(View view) {
        launchActivity(MoviesActivity.class);
    }

    public void launchChangeBackgroundActivity(View view) {
        launchActivity(ChangeBackgroundActivity.class);
    }

    public void launchToolbarActivity(View view) {
        launchActivity(ToolbarActivity.class);
    }
}
