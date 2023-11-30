package com.example.scholaris_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignInActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        Button signInButton = (Button) findViewById(R.id.sign_in_button);
        EditText editTextUsername = (EditText) findViewById(R.id.username_field);
        EditText editTextPassword = (EditText) findViewById(R.id.password_field);

        signInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(editTextUsername.getText().equals("")){
                    Toast.makeText(getApplicationContext(), "Username Tidak Boleh Kosong", Toast.LENGTH_SHORT).show();
                    editTextUsername.requestFocus();
                } else if(editTextPassword.getText().equals("")){
                    Toast.makeText(getApplicationContext(), "Password Tidak Boleh Kosong", Toast.LENGTH_SHORT).show();
                    editTextPassword.requestFocus();
                } else {
                    Intent intent = new Intent(SignInActivity.this, MainActivityParent.class);
                    Toast.makeText(getApplicationContext(), "Login Berhasil", Toast.LENGTH_SHORT).show();
                    startActivity(intent);
                }
            }
        });
    }
}