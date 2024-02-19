package com.example.mylearing;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    Button cbdata,rd;
    TextView result,resultradio;
    CheckBox cb1,cb2;
    RadioGroup rdg1;

    ToggleButton toggleButton;
    TextView tvtgl1;

    ProgressBar progressBar1,progressBar2;
    Button progressbtn;

    Button intentbtn1;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cbdata = findViewById(R.id.cbbtn1);
        result = findViewById(R.id.displaydata);
        cb1= findViewById(R.id.cricket);
        cb2= findViewById(R.id.football);

        rdg1 = findViewById(R.id.rdg1);
        resultradio = findViewById(R.id.displayradiodata);
        rd = findViewById(R.id.rbdata1);

        toggleButton = findViewById(R.id.togglebtn1);
        tvtgl1 = findViewById(R.id.tvtoggle1);

        progressbtn = findViewById(R.id.progressbtn);

        intentbtn1 = findViewById(R.id.intentbtn);


//        example of checkbox

        cbdata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuilder collectdata = new StringBuilder();
                if(cb1.isChecked()){
                    collectdata.append(cb1.getText()).append(",");
                }
                if(cb2.isChecked()){
                    collectdata.append(cb2.getText()).append(",");
                }
                result.setText("You have Selected " + collectdata.toString());
            }
        });

//        example of radio button

        rd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int selecteddata = rdg1.getCheckedRadioButtonId();
                if(selecteddata != -1){
                        RadioButton rdbtn = findViewById(selecteddata);
                        resultradio.setText(" You have Selected " + rdbtn.getText());
                }
                else{
                    resultradio.setText(" No option is selected ");

                }
            }
        });


//        example of toggle button

        toggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(toggleButton.isChecked()){
                    tvtgl1.setText(" You turn ON the wifi ");
                }else{
                    tvtgl1.setText(" You turn OFF the wifi ");

                }
            }
        });

//        progress bar example
        /*
        progressbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int counter = 0;

                progressBar1.setVisibility(View.VISIBLE);
                progressBar2.setVisibility(View.VISIBLE);

                Timer timer = new Timer();
                TimerTask timerTask = new TimerTask() {
                    @Override
                    public void run() {
                        progressBar1.setProgress(counter);
                        progressBar2.setProgress(counter);

                        if (counter == 100) {
                            timer.cancel();
                            Toast.makeText(MainActivity.this, "You Succesfully Wasted Your Time", Toast.LENGTH_LONG).show();
                        }
                        counter++;
                    }
                };
                timer.schedule(timerTask,100,100);
            }
        });

         */

        intentbtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                startActivity(intent);
            }
        });

    }

}