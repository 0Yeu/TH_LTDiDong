package com.example.a2050531200232_bkt2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class login extends AppCompatActivity {

    TextView txtSignUp;
    TextInputEditText txtEmail, txtPassword;
    Button btnSignIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        txtSignUp   = findViewById(R.id.txtSignUp);
        txtEmail    = findViewById(R.id.txtEmail);
        txtPassword = findViewById(R.id.txtPassword);
        btnSignIn   = findViewById(R.id.btnSignIn);

        txtSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(login.this, signup.class);
                startActivity(intent);
                finish();
            }
        });
        btnSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (txtEmail.getText().toString().isEmpty() && txtPassword.getText().toString().isEmpty()){
                    Toast.makeText(login.this, "Ban can nhap Email va Password", Toast.LENGTH_SHORT).show();
                } else if (txtEmail.getText().toString().isEmpty()){
                    Toast.makeText(login.this, "Ban can nhap email", Toast.LENGTH_SHORT).show();
                    txtEmail.requestFocus();
                } else if (txtPassword.getText().toString().isEmpty()){
                    Toast.makeText(login.this, "Ban can nhap Password", Toast.LENGTH_SHORT).show();
                    txtPassword.requestFocus();
                } else {
                    Intent intent = new Intent(login.this, MainActivity.class);
                    startActivity(intent);
                    finish();
                }
            }
        });
    }
}