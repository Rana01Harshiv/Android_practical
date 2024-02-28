package com.example.mylearing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class tic_tac_toe extends AppCompatActivity {

    Button abbtn;
    EditText p1,p2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tic_tac_toe);


        abbtn = findViewById(R.id.aboutBtn);
        p1 = findViewById(R.id.player1Edt);
        p2 = findViewById(R.id.player2Edt);


        abbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String pl1 = p1.getText().toString();
                String pl2 = p2.getText().toString();

                Intent intent = new Intent(tic_tac_toe.this,tic_tac_toe_aboutgame.class);
                intent.putExtra("p1",pl1);
                intent.putExtra("p2",pl2);
                startActivity(intent);










//                String pl1 = p1.getText().toString();
//                String pl2 = p2.getText().toString();
//
//                Intent intent = new Intent(tic_tac_toe.this,tic_tac_toe_aboutgame.class);
//
//                intent.putExtra("p1",pl1);
//                intent.putExtra("p2",pl2);
//
//                startActivity(intent);
            }
        });
    }
}