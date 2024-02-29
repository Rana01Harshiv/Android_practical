package com.example.mylearing;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class tic_tac_toe_homepage extends AppCompatActivity {

    Button b1,b2,b3,b4,b5,b6,b7,b8,b9;
    String s1,s2,s3,s4,s5,s6,s7,s8,s9;

    int flag = 0;
    int count = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tic_tac_toe_homepage);

        ininitialize();


    }

    private void ininitialize() {

        b1 = findViewById(R.id.btn1);
        b2 = findViewById(R.id.btn2);
        b3 = findViewById(R.id.btn3);
        b4 = findViewById(R.id.btn4);
        b5 = findViewById(R.id.btn5);
        b6 = findViewById(R.id.btn6);
        b7 = findViewById(R.id.btn7);
        b8 = findViewById(R.id.btn8);
        b9 = findViewById(R.id.btn9);
    }
    public void check(View view) {

        Button btnCurrent = (Button) view;
        if (btnCurrent.getText().toString().equals("")) {

            count++;
        if (flag == 0) {
            btnCurrent.setText("X");
            flag = 1;
        } else {
            btnCurrent.setText("O");
            flag = 0;
        }
        if (count > 4) {
            s1 = b1.getText().toString();
            s2 = b2.getText().toString();
            s3 = b3.getText().toString();
            s4 = b4.getText().toString();
            s5 = b5.getText().toString();
            s6 = b6.getText().toString();
            s7 = b7.getText().toString();
            s8 = b8.getText().toString();
            s9 = b9.getText().toString();

            if (s1.equals(s2) && s2.equals(s3) && !(s1.equals(""))) {
                Toast.makeText(this, "Winner is " + s1, Toast.LENGTH_SHORT).show();
                newgame();
            } else if (s4.equals(s5) && s5.equals(s6) && !(s4.equals(""))) {
                Toast.makeText(this, "Winner is " + s4, Toast.LENGTH_SHORT).show();
                newgame();

            } else if (s7.equals(s8) && s8.equals(s9) && !(s7.equals(""))) {
                Toast.makeText(this, "Winner is " + s7, Toast.LENGTH_SHORT).show();
                newgame();

            } else if (s1.equals(s4) && s4.equals(s7) && !(s1.equals(""))) {
                Toast.makeText(this, "Winner is " + s1, Toast.LENGTH_SHORT).show();
                newgame();

            } else if (s2.equals(s5) && s5.equals(s8) && !(s2.equals(""))) {
                Toast.makeText(this, "Winner is " + s2, Toast.LENGTH_SHORT).show();
                newgame();

            } else if (s3.equals(s6) && s6.equals(s9) && !(s3.equals(""))) {
                Toast.makeText(this, "Winner is " + s3, Toast.LENGTH_SHORT).show();
                newgame();

            } else if (s1.equals(s5) && s5.equals(s9) && !(s1.equals(""))) {
                Toast.makeText(this, "Winner is " + s1, Toast.LENGTH_SHORT).show();
                newgame();

            } else if (s3.equals(s5) && s5.equals(s7) && !(s3.equals(""))) {
                Toast.makeText(this, "Winner is " + s3, Toast.LENGTH_SHORT).show();
                newgame();

            }else if (count==9){
                Toast.makeText(this, "Game is Drawn  ", Toast.LENGTH_SHORT).show();
                newgame();
            }


        }
    }
    }
    public void newgame(){
        b1.setText("");
        b2.setText("");
        b3.setText("");
        b4.setText("");
        b5.setText("");
        b6.setText("");
        b7.setText("");
        b8.setText("");
        b9.setText("");
        flag = 0;
        count = 0;
    }
}