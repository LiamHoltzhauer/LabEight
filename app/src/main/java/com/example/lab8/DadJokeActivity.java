package com.example.lab8;
import androidx.appcompat.widget.Toolbar;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DadJokeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dad_joke);

        // Set up the Toolbar for DadJokeActivity
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // Display the dad joke
        TextView jokeTextView = findViewById(R.id.jokeTextView);
        jokeTextView.setText("Why don't skeletons fight each other? They don't have the guts.");
    }
}