package com.example.anudeepgogineni.termtest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView question = findViewById(R.id.flashcard_question);
        final TextView answer = findViewById(R.id.flashcard_answer);
        final TextView correctChoice = findViewById(R.id.correctChoice);
        final TextView wrongChoice1 = findViewById(R.id.wrongChoice1);
        final TextView wrongChoice2 = findViewById(R.id.wrongChoice2);
        final ImageView vToggle = findViewById(R.id.visibility);

        question.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                question.setVisibility(View.INVISIBLE);
                answer.setVisibility(View.VISIBLE);
                correctChoice.setVisibility(View.INVISIBLE);
                wrongChoice1.setVisibility(View.INVISIBLE);
                wrongChoice2.setVisibility(View.INVISIBLE);
            }
        });

        answer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answer.setVisibility(View.INVISIBLE);
                question.setVisibility(View.VISIBLE);
                correctChoice.setVisibility(View.VISIBLE);
                wrongChoice1.setVisibility(View.VISIBLE);
                wrongChoice2.setVisibility(View.VISIBLE);
            }
        });

        correctChoice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                correctChoice.setBackgroundColor(getResources().getColor(R.color.correctChoiceColor, null));
            }
        });

        wrongChoice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                correctChoice.setBackgroundColor(getResources().getColor(R.color.correctChoiceColor, null));
                wrongChoice1.setBackgroundColor(getResources().getColor(R.color.wrongChoiceColor, null));
            }
        });

        wrongChoice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                correctChoice.setBackgroundColor(getResources().getColor(R.color.correctChoiceColor, null));
                wrongChoice2.setBackgroundColor(getResources().getColor(R.color.wrongChoiceColor, null));
            }
        });

        vToggle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int visibility = correctChoice.getVisibility();
                if(visibility == View.VISIBLE) {
                    correctChoice.setVisibility(View.INVISIBLE);
                    wrongChoice1.setVisibility(View.INVISIBLE);
                    wrongChoice2.setVisibility(View.INVISIBLE);
                    vToggle.setImageResource(R.mipmap.ic_launcher_visible_foreground);
                }
                else{
                    correctChoice.setVisibility(View.VISIBLE);
                    wrongChoice1.setVisibility(View.VISIBLE);
                    wrongChoice2.setVisibility(View.VISIBLE);
                    vToggle.setImageResource(R.mipmap.ic_launcher_invisible_foreground);
                }
            }
        });
    }
}
