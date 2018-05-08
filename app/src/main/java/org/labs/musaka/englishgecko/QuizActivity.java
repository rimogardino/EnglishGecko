package org.labs.musaka.englishgecko;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class QuizActivity extends AppCompatActivity {

    private TextView mQuestionTextView;
    private RadioButton manswerOption1;
    private RadioButton manswerOption2;
    private RadioButton manswerOption3;
    private RadioButton manswerOption4;
    private Button mSubmit;
    private Map<String,String> questionAnswerDict = new HashMap<>();
    private Object[] dictionaryEntries;
    private int questionsPosition;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        questionsPosition = 0;

        mQuestionTextView = findViewById(R.id.tv_question_text);
        manswerOption1 = findViewById(R.id.radio_button_1);
        manswerOption2 = findViewById(R.id.radio_button_2);
        manswerOption3 = findViewById(R.id.radio_button_3);
        manswerOption4 = findViewById(R.id.radio_button_4);
        mSubmit = findViewById(R.id.button_subbmit_answer);

        for (int i=1;i<5;i++) {
            questionAnswerDict.put("Question " + String.valueOf(i),"True answer");
        }

        dictionaryEntries =  questionAnswerDict.keySet().toArray();




    }


    public void submitAnswer(View view) {
        if (questionsPosition >= 3) {
            return;
        }
        questionsPosition++;
        mQuestionTextView.setText(dictionaryEntries[questionsPosition].toString());
        manswerOption1.setText(questionAnswerDict.get(dictionaryEntries[questionsPosition].toString()));

    }
}
