package com.example.kguney.bilgeadam_29_p3;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText username, password;
    private Button buttonLogin;
    private SharedPreferences sp;
    private SharedPreferences.Editor e;
    private String usernameStr;
    private String passwordStr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonLogin = findViewById(R.id.buttonLogin);
        username = findViewById(R.id.editTextUsername);
        password = findViewById(R.id.editTextPassword);
        sp = getSharedPreferences("logininfo",MODE_PRIVATE);
        e = sp.edit();

        usernameStr = sp.getString("username", "no username");
        passwordStr = sp.getString("password", "no password");

        if(usernameStr.equals("admin") && passwordStr.equals("1234")){
            startActivity(new Intent(MainActivity.this, SecondActivity.class));
        }

            buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(username.getText().toString().equals("admin") && password.getText().toString().equals("1234")){

                    e.putString("username", username.getText().toString());
                    e.putString("password", password.getText().toString());
                    e.commit();

                    startActivity(new Intent(MainActivity.this, SecondActivity.class));
                } else {
                    Toast.makeText(MainActivity.this ,"Username or password is invalid", 5000).show();
                }
            }
        });






    }
}
