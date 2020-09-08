package com.example.tservices_admin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.content.Intent;
import android.view.View;

import androidx.annotation.Nullable;

public class TServices_admin extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tservices_admin);

        findViewById(R.id.signin_admin).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TServices_admin.this, Activity_signin_admin.class));
            }
        });

        onClick_location_buttons();
    }



    private void onClick_location_buttons()
    {
        findViewById(R.id.skr_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TServices_admin.this, Activity_skr_details.class));
            }
        });

        findViewById(R.id.khi_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TServices_admin.this, Activity_khi_details.class));
            }
        });

        findViewById(R.id.isl_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TServices_admin.this, Activity_isl_details.class));
            }
        });

        findViewById(R.id.lhr_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TServices_admin.this, Activity_lhr_details.class));
            }
        });
    }

}
