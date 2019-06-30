package com.example.kguney.bilgeadam_28_p2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private TextView textView;
    private TextView textView2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        textView = findViewById(R.id.hellotxt);
        textView2 = findViewById(R.id.korayinfo);

        String incomingMsg = getIntent().getStringExtra("hello");
//        String incomingName= getIntent().getStringExtra("name");
//        int incomingAge = getIntent().getIntExtra("age", 0);
//        double incomingSalary = getIntent().getDoubleExtra("salary", 0.0);
//        boolean mariageStatus = getIntent().getBooleanExtra("isMarried", false);
        Employee emp = (Employee) getIntent().getSerializableExtra("erkan");


        textView.setText(incomingMsg);
//        textView2.setText(incomingName+"-"+incomingAge+"-"+incomingSalary+"-"+mariageStatus);
        textView2.setText(emp.getName()+"-"+emp.getAge()+"-"+emp.getSalary()+"-"+emp.isMarried());

    }
}
