package org.labs.musaka.englishgecko;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class WordGroups extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_groups);
    }


    public void startQuiz(View view) {
        Intent intent = new Intent(this,QuizActivity.class);
        startActivity(intent);
    }
}
