package com.example.kguney.bilgeadam_29_p1;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.HashSet;
import java.util.Set;

public class MainActivity extends AppCompatActivity {

    private Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                SharedPreferences sp = getSharedPreferences("personalInfo",MODE_PRIVATE);
                SharedPreferences.Editor e = sp.edit();

                e.putString("name", "Koray");
                e.putInt("age", 35);
                e.putFloat("height", 1.75f);
                e.putBoolean("marriage status", true);

                Set<String> friends = new HashSet<>();
                friends.add("Mert");
                friends.add("Ayşe");

                e.putStringSet("friends", friends);
                e.commit();

                Intent intent = new Intent(MainActivity.this, SecondActivity.class );
                startActivity(intent);
            }
        });


    }
}
