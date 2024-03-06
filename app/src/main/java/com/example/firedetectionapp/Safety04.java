package com.example.firedetectionapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Safety04 extends AppCompatActivity {

    Button btn_sub2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_safety04);

        btn_sub2=(Button)findViewById(R.id.Safe04ConfirmBtn);

        btn_sub2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),DialogPopup02.class);
                startActivity(i);

            }
        });
    }
}
