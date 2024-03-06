package com.example.firedetectionapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button mCheckSafeBtn;
    private  Button mTempHumRiskBtn;
    private Button mhelpBtn;
    private Button mUsersBtn;


    // private TextView Temperature;
    //private Firebase temperature;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    /*
        Temperature = (TextView) findViewById(R.id.Temperature);
        temperature = new Firebase("https://fire-detection-701dd.firebaseio.com/fire-detection-701dd/Temperature");


        temperature.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String tem = dataSnapshot.getValue(String.class);
                Temperature.setText(tem);

            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });


*/
        mCheckSafeBtn=(Button)findViewById(R.id.btnSafe);
        mTempHumRiskBtn=(Button)findViewById(R.id.btnTemp);
        mhelpBtn=(Button)findViewById(R.id.btnHelp);
        mUsersBtn=(Button)findViewById(R.id.btnUsers);

        mCheckSafeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),CheckSafety.class));

            }

        });

        mTempHumRiskBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),TemperatureAndHumidityRisk.class));

            }

        });

        mhelpBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Help.class));

            }

        });

        mUsersBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),NoOfUsers.class));

            }

        });

    }
}
