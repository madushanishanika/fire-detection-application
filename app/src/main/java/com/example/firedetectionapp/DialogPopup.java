package com.example.firedetectionapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class DialogPopup extends AppCompatActivity {
    Button btn_close;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog_popup);

        btn_close=(Button)findViewById(R.id.BtnClose01);
        btn_close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        DisplayMetrics dn=new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dn);

        int width=dn.widthPixels;
        int height=dn.heightPixels;

        getWindow().setLayout((int)(width*.6),(int)(height*.4));

        WindowManager.LayoutParams params=getWindow().getAttributes();
        params.gravity= Gravity.CENTER;
        params.x=0;
        params.y= -20;

        getWindow().setAttributes(params);

    }
}
