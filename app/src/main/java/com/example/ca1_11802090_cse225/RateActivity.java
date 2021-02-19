package com.example.ca1_11802090_cse225;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class RateActivity extends AppCompatActivity {
    String[] question = {
            "Which operating system do you use?",
            "Which Code editor do you use the most?",
            "In which programming language do you usually code?",
            "What is your domain among the following?"
    };

    String[][] options = {
            {"Linux","Windows","Macintosh","Android"},
            {"Vim","Visual Studio Code","Brackets","Sublime Text"},
            {"C++","Java","Kotlin","Python"},
            {"Machine Learning","Data Science","Web development","Cyber Security"}
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rate);
        Button next = findViewById(R.id.next);

    }
}
