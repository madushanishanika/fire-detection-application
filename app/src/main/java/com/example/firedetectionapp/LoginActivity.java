package com.example.firedetectionapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class LoginActivity extends AppCompatActivity {

    private EditText mEmail,mPassword;
    private TextView mCreateBtn;

    private ProgressBar progressBar;
    private FirebaseAuth fAuth;
    private Button mLoginBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mLoginBtn = (Button) findViewById(R.id.loginBtn);
        mEmail = (EditText)findViewById(R.id.Email);
        mPassword = (EditText)findViewById(R.id.password);
        fAuth      = FirebaseAuth.getInstance();
        mCreateBtn=(TextView)findViewById(R.id.createText);
        progressBar = findViewById(R.id.progressBar);


        mLoginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String email =mEmail.getText().toString().trim();
                String password =mPassword.getText().toString().trim();

                if(TextUtils.isEmpty(email)){
                    mEmail.setError("Email is already required.");
                    return;
                }
                if(TextUtils.isEmpty(password)){
                    mPassword.setError("Password is required.");
                    return;
                }
                if(password.length() <6){
                    mPassword.setError("Password must to be a 6 characters or more");
                    return;
                }
                progressBar.setVisibility(View.VISIBLE);

                //authenticate the user

                fAuth.signInWithEmailAndPassword(email,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if(task.isSuccessful()){
                            Toast.makeText(LoginActivity.this,"Logged in Successfully",Toast.LENGTH_SHORT).show();
                            startActivity(new Intent(getApplicationContext(),MainActivity.class));

                        }else{
                            Toast.makeText(LoginActivity.this, "Error !"+ task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                            progressBar.setVisibility(View.GONE);
                        }
                    }
                });
            }
        });
        mLoginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),MainActivity.class));
            }
        });

        mCreateBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Register.class));

            }
        });


    }
}
