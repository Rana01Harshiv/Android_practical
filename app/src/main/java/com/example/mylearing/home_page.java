package com.example.mylearing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class home_page extends AppCompatActivity {

    TextView user;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        user = findViewById(R.id.userTv);

        Intent  intent = getIntent();
        if(intent != null){
            String username = intent.getStringExtra("username");
            user.setText("Welcome User: "+username);
        }

    }
}