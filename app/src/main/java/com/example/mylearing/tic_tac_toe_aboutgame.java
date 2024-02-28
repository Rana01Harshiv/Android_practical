package com.example.mylearing;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class tic_tac_toe_aboutgame extends AppCompatActivity {

    TextView p1,p2;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tic_tac_toe_aboutgame);

        p1 = findViewById(R.id.pl1Name);
        p2 = findViewById(R.id.pl2Name);

        Intent intent = getIntent();
        if(intent != null){
            String pl1 = intent.getStringExtra("p1");
            String pl2 = intent.getStringExtra("p2");
            p1.setText("Welcome User1:"+pl1);
            p2.setText("Welcome User2:"+pl2);
        }










    }
}