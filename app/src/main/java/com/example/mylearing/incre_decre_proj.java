package com.example.mylearing;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class incre_decre_proj extends AppCompatActivity {

    Button ibtn,dbtn;
    EditText inum;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_incre_decre_proj);

        ibtn = findViewById(R.id.btn1);
        dbtn = findViewById(R.id.btn2);
        inum = findViewById(R.id.numTv);


        ibtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int res = Integer.parseInt(inum.getText().toString());
                inum.setText(String.valueOf(++res));

            }
        });

        dbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int res = Integer.parseInt(inum.getText().toString());
                inum.setText(String.valueOf(--res));
            }
        });





    }
}