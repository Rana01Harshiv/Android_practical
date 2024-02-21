package com.example.mylearing;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    Button btn1;
    ListView listView;
    Spinner spinner;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        btn1 = findViewById(R.id.toastbtn);
        listView = findViewById(R.id.listview1);
        spinner = findViewById(R.id.spinnerCity);

//        toast example
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity2.this, "The Button is clicked ", Toast.LENGTH_LONG).show();
            }
        });


//        list view example

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity2.this, android.R.layout.simple_dropdown_item_1line,getResources().getStringArray(R.array.teams));
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position , long l) {
                String[] teams = getResources().getStringArray(R.array.teams);
                Toast.makeText(MainActivity2.this, "Clicked " + teams[position], Toast.LENGTH_SHORT).show();
            }
        });


//        spinner example 
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(MainActivity2.this, android.R.layout.simple_spinner_item,getResources().getStringArray(R.array.teams));
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter1);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
                String[] teams = getResources().getStringArray(R.array.teams);
                Toast.makeText(MainActivity2.this, "Clicked " + teams[position], Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}