package com.example.ca1_11802090_cse225;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RatingBar;

public class RateActivity extends AppCompatActivity {

    private RatingBar rs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rate);
        rs = findViewById(R.id.ratebar);
        rs.setNumStars(5);
        float rating = rs.getRating();


    }
}