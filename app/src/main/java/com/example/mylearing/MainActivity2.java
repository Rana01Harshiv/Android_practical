package com.example.mylearing;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    Button btn1;
    ListView listView;
    String[] teams = { "India","USA","China","Sri-lanka","Pakistan","South africa","Canada","England","Austrlia","Afganistan","Nepal","Bangladesh"};

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        btn1 = findViewById(R.id.toastbtn);
        listView = findViewById(R.id.listview1);

//        toast example
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity2.this, "The Button is clicked ", Toast.LENGTH_LONG).show();
            }
        });

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity2.this, android.R.layout.simple_dropdown_item_1line,teams);
        listView.setAdapter(adapter);
    }
}