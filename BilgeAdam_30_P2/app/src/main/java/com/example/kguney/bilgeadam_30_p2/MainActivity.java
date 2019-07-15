package com.example.kguney.bilgeadam_30_p2;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    class CallWebService extends AsyncTask<String, Void, String> {

        @Override
        protected void onPostExecute(String s) {


        }

        @Override
        protected String doInBackground(String... strings) {

            








            return null;
        }




    }


}
