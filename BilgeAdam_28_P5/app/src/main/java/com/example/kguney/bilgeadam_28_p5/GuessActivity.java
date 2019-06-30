package com.example.kguney.bilgeadam_28_p5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class GuessActivity extends AppCompatActivity {

    private TextView textViewGuess;
    private TextView textViewHelp;
    private EditText editTextGuess;
    private Button button;
    private int counter = 5;
    private int randomNumber;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guess);

        textViewGuess = findViewById(R.id.textViewGuess);
        textViewHelp = findViewById(R.id.textViewHelp);
        editTextGuess = findViewById(R.id.editTextGuess);
        button = findViewById(R.id.button2);

        Random random = new Random();
        randomNumber = random.nextInt(101);

        Log.e("random" , String.valueOf("RANDOM : " + randomNumber));

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                counter = counter-1;

                int guess = Integer.parseInt(editTextGuess.getText().toString());

                if(counter != 0){

                    if(guess == randomNumber){
                        Intent intent = new Intent(GuessActivity.this, ResultActivity.class);
                        intent.putExtra("result" , true);
                        startActivity(intent);
                        finish();
                    }

                    if(guess > randomNumber) {
                        textViewHelp.setText("Descrease");
                        textViewGuess.setText("Remained guess : " + counter);
                    }

                    if(guess < randomNumber) {
                        textViewHelp.setText("Increase");
                        textViewGuess.setText("Remained guess : " + counter);
                    }

                } else {
                    Intent intent = new Intent(GuessActivity.this, ResultActivity.class);
                    intent.putExtra("result" , false);
                    intent.putExtra("resultInt" , randomNumber);
                    startActivity(intent);
                    finish();
                }

                editTextGuess.setText("");

            }
        });


    }
}
