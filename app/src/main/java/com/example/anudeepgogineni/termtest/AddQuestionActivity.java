package com.example.anudeepgogineni.termtest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

public class AddQuestionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_question_view);

        final EditText question = findViewById(R.id.newQuestion);
        final EditText answer = findViewById(R.id.newAnswer);
        final ImageView save = findViewById(R.id.save);
        final ImageView cancel = findViewById(R.id.cancel);

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String newQuestion = question.getText().toString();
                String newAnswer = answer.getText().toString();
                if(newQuestion.length()>0 && newAnswer.length()>0) {
                    openMainActivity(newQuestion, newAnswer);
                }
            }
        });

        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainActivity();
            }
        });
    }

    private void openMainActivity(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    private void openMainActivity(String question, String answer) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("Question", question);
        intent.putExtra("Answer", answer);
        startActivity(intent);
    }
}
