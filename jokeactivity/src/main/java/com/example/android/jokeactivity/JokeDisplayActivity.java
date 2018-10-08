package com.example.android.jokeactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokeDisplayActivity extends AppCompatActivity {

    public static String JOKE_KEY = "Joke key";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke_display);

        Intent intent = getIntent();

        String joke = intent.getStringExtra(JOKE_KEY);

        TextView jokeTextView = findViewById(R.id.joke_textview);
        jokeTextView.setText(joke);

    }
}
