package com.example.ca1_11802090_cse225;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.widget.Button;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        androidx.appcompat.widget.Toolbar t = findViewById(R.id.t1);
        setSupportActionBar(t);
        Button tel = findViewById(R.id.tel);
        Button email = findViewById(R.id.email);
        Button git = findViewById(R.id.githu);
        Button rate = findViewById(R.id.rate_my_app);
        Button survey = findViewById(R.id.survey);


        tel.setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", "+919454900674", null));
            startActivity(intent);
        });

        email.setOnClickListener(v -> {
            Intent intent = new Intent();
            intent.setData(Uri.fromParts("mailto","sunnyt0225@gmail.com",null));
            startActivity(intent);
        });
        git.setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("https://github.com/deadshot674gam"));
            startActivity(intent);
        });

        survey.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), SurveyForm.class);
            startActivity(intent);
        });

        rate.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), RateActivity.class);
            startActivity(intent);
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu1,menu);
        return super.onCreateOptionsMenu(menu);

    }
}