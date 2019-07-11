package com.example.kguney.bilgeadam_29_p1;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Set;

public class SecondActivity extends AppCompatActivity {

    private TextView textView;
    private Button buttonDelete, buttonUpdate;
    private SharedPreferences sp;
    private SharedPreferences.Editor e;
    private String name;
    private int age;
    private  float height;
    private Set<String> friends;
    private StringBuilder sb;
    private boolean marriageStatus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        buttonDelete = findViewById(R.id.buttonDelete);
        buttonUpdate = findViewById(R.id.buttonUpdate);
        textView = findViewById(R.id.textViewResult);

        sp = getSharedPreferences("personalInfo", MODE_PRIVATE);
        e = sp.edit();

        name = sp.getString("name", "no name");
        age = sp.getInt("age", 0);
        height = sp.getFloat("height", 1.0f);
        marriageStatus = sp.getBoolean("marriage status", false);

        friends = sp.getStringSet("friends", null);

        sb = new StringBuilder();

        for (String f: friends) {
            sb.append(f +" ");
        }

        textView.setText("Name : " + name + ", Age : " + age + ", Height : " + height + ", Marriage : " + marriageStatus + ", Friends : " + sb.toString());

        buttonDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e.remove("name");
                e.commit();

                name = sp.getString("name", "No name");

                textView.setText("Name : " + name + ", Age : " + age + ", Height : " + height + ", Marriage : " + marriageStatus + ", Friends : " + sb.toString());


            }
        });

        buttonUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                e.putInt("age", 25);
                e.commit();

                age = sp.getInt("age", 0);

                textView.setText("Name : " + name + ", Age : " + age + ", Height : " + height + ", Marriage : " + marriageStatus + ", Friends : " + sb.toString());
            }
        });

    }
}
