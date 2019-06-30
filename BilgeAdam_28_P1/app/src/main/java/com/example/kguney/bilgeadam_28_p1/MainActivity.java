package com.example.kguney.bilgeadam_28_p1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.e("MainActivity", "onCreate initialized");

        button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);

            }
        });



    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.e("MainActivity", "onStart initialized");

    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.e("MainActivity", "onResume initialized");

    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.e("MainActivity", "onPause initialized");

    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.e("MainActivity", "onStop initialized");


    }

    @Override
    protected void onRestart() {
        super.onRestart();

        Log.e("MainActivity", "onRestart initialized");


    }


    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.e("MainActivity", "onDestroy initialized");

    }


}

