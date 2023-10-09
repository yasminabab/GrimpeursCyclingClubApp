package com.example.gcccyclingapp;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Welcome extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.welcome_screen);

            String name = null;
            Bundle bundle = getIntent().getExtras();
            if(bundle.getString("name")!=null){
                name = bundle.getString("name");
            }

            TextView welcometxt = (TextView) findViewById(R.id.txtWelcome);
            String role = "admin";
            welcometxt.setText("Welcome " + name + " you are logged in as " + role);
        }


}