package com.example.kguney.bilgeadam_29_p3;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private TextView textView;
    private Button button;
    private SharedPreferences sp;
    private SharedPreferences.Editor e;
    private String usernameStr;
    private String passwordStr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        textView = findViewById(R.id.textView);
        button = findViewById(R.id.buttonLogout);

        sp = getSharedPreferences("logininfo",MODE_PRIVATE);
        e = sp.edit();
        usernameStr = sp.getString("username", "no username");
        passwordStr = sp.getString("password", "no password");

        textView.setText("Username : " + usernameStr + " , password : " + passwordStr);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e.remove("username");
                e.remove("password");
                e.commit();

                startActivity(new Intent(SecondActivity.this, MainActivity.class));
                finish();

            }
        });

    }
}
