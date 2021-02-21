package com.example.ca1_11802090_cse225;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SurveyForm extends AppCompatActivity {

    private final String[] question = {
            "Which operating system do you use?",
            "Which Code editor do you use the most?",
            "In which programming language do you usually code?",
            "What is your domain among the following?"
    };


    private final String[][] options = {
            {"Linux","Windows","Macintosh","Android"},
            {"Vim","Visual Studio Code","Brackets","Sublime Text"},
            {"C++","Java","Kotlin","Python"},
            {"Machine Learning","Data Science","Web development","Cyber Security"}
    };
    private int i = 1;
    private int progress = 0;
    ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_survey);
        Button next = findViewById(R.id.next);
        progressBar = findViewById(R.id.progress_bar);
        progressBar.setProgress(0);
//        progressBar.set
        progressBar.setVisibility(View.INVISIBLE);
        progress = progressBar.getProgress();
        Button submit = findViewById(R.id.submit_);
        next.setOnClickListener(v -> {

            if(i<4){
                TextView text = findViewById(R.id.question);
                text.setText(question[i]);
                RadioButton option1 = findViewById(R.id.option1);
                RadioButton option2 = findViewById(R.id.option2);
                RadioButton option3 = findViewById(R.id.option3);
                RadioButton option4 = findViewById(R.id.option4);
                RadioGroup group = findViewById(R.id.group_);

                group.clearCheck();

                option1.setText(options[i][0]);
                option2.setText(options[i][1]);
                option3.setText(options[i][2]);
                option4.setText(options[i][3]);
                progress+=25;
                i++;
                progressBar.setProgress(progress);
                progressBar.setVisibility(View.VISIBLE);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            else {
                progress+=25;
                progressBar.setProgress(progress);
                Toast.makeText(getApplicationContext(),"Survey Completed Click Submitted",Toast.LENGTH_LONG).show();
                submit.setEnabled(true);
                next.setEnabled(false);
                submit.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        finish();
                    }
                });
            }
        });
    }
}
