package com.example.firedetectionapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Safety01 extends AppCompatActivity {

    private Button mSafe01Next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_safety01);

        mSafe01Next=(Button)findViewById(R.id.Safe01NextBtn);

        mSafe01Next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                startActivity(new Intent(getApplicationContext(),Safety02.class));
            }
        });
    }
}
