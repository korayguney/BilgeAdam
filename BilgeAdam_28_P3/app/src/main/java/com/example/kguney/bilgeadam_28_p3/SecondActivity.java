package com.example.kguney.bilgeadam_28_p3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        textView = findViewById(R.id.namedsp);
        String incomingName = getIntent().getStringExtra("name");
        textView.setText("Hello " + incomingName);

    }
}
