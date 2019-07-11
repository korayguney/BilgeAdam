package com.example.kguney.bilgeadam_29_p2;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView textViewCounter;
    private Button button;
    private int counter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SharedPreferences sp = getSharedPreferences("counter", MODE_PRIVATE);
        SharedPreferences.Editor e = sp.edit();

        counter = sp.getInt("counter", 0);

        textViewCounter = findViewById(R.id.textViewCounter);
        button = findViewById(R.id.button);
        e.putInt("counter" , ++counter);
        e.commit();

        textViewCounter.setText("Counter : " + String.valueOf(counter));

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Counter : " + counter, 5000).show();
            }
        });


    }
}
