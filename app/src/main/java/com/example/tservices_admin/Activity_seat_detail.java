package com.example.tservices_admin;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Activity_seat_detail extends AppCompatActivity {
    Button seat_again;
    TextView fromto,vehicle_id,departure_date,departure_time,seatno,seatprice,mbnumber,fullname;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seat_detail);

        intent=getIntent();
        String v_id= intent.getStringExtra("id");
        String date= intent.getStringExtra("date");
        String from_to=intent.getStringExtra("root");
        String time=intent.getStringExtra("time");
        String mb_number=intent.getStringExtra("mb_number");
        String full_name= intent.getStringExtra("full_name");
        final String selection=intent.getStringExtra("selection");

        fromto=findViewById(R.id.from_to);
        vehicle_id=findViewById(R.id.vehicle_id);
        departure_date=findViewById(R.id.departure_date);
        departure_time=findViewById(R.id.departure_time);

        mbnumber=findViewById(R.id.mb_number);
        fullname = findViewById(R.id.fullname);


        fromto.setText(from_to);
        vehicle_id.setText(v_id);
        departure_date.setText(date);
        departure_time.setText(time);
        mbnumber.setText(mb_number);
        fullname.setText(full_name);

        onBackPressed();
    }

    public void onBackPressed() {
    }
}

