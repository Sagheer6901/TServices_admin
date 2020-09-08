package com.example.tservices_admin;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.tservices_admin.Activity_selection_admin;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class Activity_signin_admin extends AppCompatActivity {
    private String passstr,emailstr;
    private EditText email;
    private EditText mPassword;
    private Button sign_in;
    private FirebaseAuth auth;

    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin_admin);

        email=findViewById(R.id.email);
        mPassword=findViewById(R.id.password);
        sign_in=findViewById(R.id.sign_in_btn);

        auth = FirebaseAuth.getInstance();

        sign_in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onSignupSuccess();

            }
        });

    }



    public void onSignupSuccess(){
        emailstr = email.getText().toString();
        passstr = mPassword.getText().toString();

        if (emailstr.contains("admin")){

            auth.signInWithEmailAndPassword(emailstr,passstr).addOnSuccessListener(new OnSuccessListener<AuthResult>() {
                @Override
                public void onSuccess(AuthResult authResult) {
                    startActivity(new Intent(Activity_signin_admin.this, Activity_selection_admin.class));
                    finish();
                }
            });
        }
        else {
            Toast.makeText(getBaseContext(), "Account does not exist", Toast.LENGTH_SHORT).show();
        }
    }

    final public void initialize(){


        passstr=mPassword.getText().toString();
        emailstr=email.getText().toString();

    }
}

