package com.example.firedetectionapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CheckSafety extends AppCompatActivity {
    private Button mCheckSafe01Btn;
    private Button mCheckSafe02Btn;
    private Button mCheckSafe03Btn;
    private Button mCheckSafe04Btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_safety);

        mCheckSafe01Btn=(Button)findViewById(R.id.BtnSafe01);
        mCheckSafe02Btn=(Button)findViewById(R.id.BtnSafe02);
        mCheckSafe03Btn=(Button)findViewById(R.id.BtnSafe03);
        mCheckSafe04Btn=(Button)findViewById(R.id.BtnSafe04);

        mCheckSafe01Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),Safety01.class));
            }
        });

        mCheckSafe02Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),Safety02.class));
            }
        });

        mCheckSafe03Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),Safety03.class));
            }
        });

        mCheckSafe04Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),Safety04.class));
            }
        });
    }
}
