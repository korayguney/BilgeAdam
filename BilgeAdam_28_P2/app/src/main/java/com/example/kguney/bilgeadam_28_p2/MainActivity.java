package com.example.kguney.bilgeadam_28_p2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        button = findViewById(R.id.hellobtn);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, SecondActivity.class);

                /*
                    We can add extra parameters with this way
                 */
                intent.putExtra("hello", "Hello Android");
//                intent.putExtra("name", "Koray");
//                intent.putExtra("age", 36);
//                intent.putExtra("salary", 35500.70);
//                intent.putExtra("isMarried", true);

                Employee employee = new Employee("Erkan", 27, 15000.0, false);
                intent.putExtra("erkan", employee);

                startActivity(intent);



            }
        });

    }
}
