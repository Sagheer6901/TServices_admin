package com.example.tservices_admin;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


import androidx.appcompat.app.AppCompatActivity;



public class Activity_selection_admin extends AppCompatActivity {
    Button car_seat_general,sleeper_coach_general,twoseater_coach_general,signout_button,booking_history_button;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selection_admin);

        car_seat_general=findViewById(R.id.car_seat_general);
        sleeper_coach_general=findViewById(R.id.sleeper_coach_general);
        twoseater_coach_general=findViewById(R.id.twoseater_coach_general);

        findViewById(R.id.car_seat_general).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                intent= new Intent(Activity_selection_admin.this,Activity_via_guest.class);
                intent.putExtra("selection",car_seat_general.getText());
                startActivity(intent);
            }
        });

        findViewById(R.id.sleeper_coach_general).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent= new Intent(Activity_selection_admin.this,Activity_via_guest.class);
                intent.putExtra("selection",sleeper_coach_general.getText());
                startActivity(intent);
            }
        });

        findViewById(R.id.twoseater_coach_general).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent= new Intent(Activity_selection_admin.this,Activity_via_guest.class);
                intent.putExtra("selection",twoseater_coach_general.getText());
                startActivity(intent);
            }
        });


        onBackPressed();

    }

    @Override
    public void onBackPressed() {
    }

}
