package com.example.kguney.bilgeadam_28_p5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class ResultActivity extends AppCompatActivity {

    private TextView textViewResult;
    private ImageView imageViewResult;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        textViewResult = findViewById(R.id.textViewResult);
        imageViewResult = findViewById(R.id.imageViewResult);
        button = findViewById(R.id.button3);

        boolean result = getIntent().getBooleanExtra("result", false);
        int resultInt = getIntent().getIntExtra("resultInt", 0);

        if(result){
            textViewResult.setText("You WIN !");
            imageViewResult.setImageResource(R.drawable.satisfied);
        } else {
            textViewResult.setText("You LOST !");
            imageViewResult.setImageResource(R.drawable.dissatisfied);
            Toast.makeText(ResultActivity.this, "The number was : " + resultInt , Toast.LENGTH_LONG).show();
        }



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(ResultActivity.this, GuessActivity.class);
                startActivity(intent);
                finish();
            }
        });


    }
}
