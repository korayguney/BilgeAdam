package com.example.kguney.bilgeadam_30_p3;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.ksoap2.SoapEnvelope;
import org.ksoap2.serialization.PropertyInfo;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;
import org.ksoap2.serialization.SoapSerializationEnvelope;
import org.ksoap2.transport.HttpTransportSE;
import org.xmlpull.v1.XmlPullParserException;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private EditText editText;
    private TextView textView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        textView = findViewById(R.id.textView2);
        editText = findViewById(R.id.editText);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String requestedInt = editText.getText().toString();

                Log.e("REQ : " , requestedInt);

                new WebServiceCall().execute(editText.getText().toString());
            }
        });
    }

    class WebServiceCall extends AsyncTask<String, Void, String> {

        @Override
        protected void onPostExecute(String s) {
            textView.setText("Squire : " + s);
        }

        @Override
        protected String doInBackground(String... strings) {
           String result = "";

            SoapObject soapObject = new SoapObject("http://test", "squire");

            PropertyInfo propertyInfo = new PropertyInfo();
            propertyInfo.setName("a");
            propertyInfo.setValue(strings[0]);
            propertyInfo.setType(String.class);

            soapObject.addProperty(propertyInfo);

            SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
            envelope.setOutputSoapObject(soapObject);

            HttpTransportSE httpTransportSE = new HttpTransportSE("http://localhost:8080/AndroidSOAPExample/services/AndroidWebService?wsdl");

            try {
                httpTransportSE.call("http://test/squire", envelope);
                SoapPrimitive soapPrimitive = (SoapPrimitive) envelope.getResponse();
                result = soapPrimitive.toString();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (XmlPullParserException e) {
                e.printStackTrace();
            }

            Log.e("TEST ---->  ", result );
            return result;
        }
    }


}
