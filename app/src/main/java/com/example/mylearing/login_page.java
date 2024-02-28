package com.example.mylearing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class login_page extends AppCompatActivity {

    Button loginbtn;
    EditText username,password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);

        loginbtn = findViewById(R.id.loginButton);
        username = findViewById(R.id.usernameEdittext);
        password = findViewById(R.id.passwordEdittext);

        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user = username.getText().toString();
                String pass = password.getText().toString();

                if((user.equals("admin")) && (pass.equals("admin"))){

                    Intent intent = new Intent(login_page.this,home_page.class);
                    intent.putExtra("username",user);
                    startActivity(intent);

                }
                else{
                    Toast.makeText(login_page.this, "Enter the correct Username or Password ", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}