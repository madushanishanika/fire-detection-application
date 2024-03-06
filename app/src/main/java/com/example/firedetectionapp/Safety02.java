package com.example.firedetectionapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Safety02 extends AppCompatActivity {

    private Button btn_sub;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_safety02);

        btn_sub=(Button)findViewById(R.id.Safe02ConfirmBtn);

        btn_sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent i=new Intent(getApplicationContext(),DialogPopup.class);
                startActivity(i);

            }
        });
    }
}
