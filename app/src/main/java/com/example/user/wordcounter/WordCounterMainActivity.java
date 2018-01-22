package com.example.user.wordcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class WordCounterMainActivity extends AppCompatActivity {

    EditText questionEditText;
    Button calculateButton;
    TextView answerText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_counter_main);

        questionEditText = findViewById(R.id.question);
        calculateButton = findViewById(R.id.button);
        answerText = findViewById(R.id.answer);
    }

//    public void onShakeButtonClicked(View button){
//        String question = questionEditText.getText().toString();
//        Log.d(getClass().toString(), "The question asked was: " + question);
//        WordCounter  wordCounter = new WordCounter(new answer());
//        String answer = wordCounter.countAnswer();
//        answerText.setText(answer);
//    }
}
