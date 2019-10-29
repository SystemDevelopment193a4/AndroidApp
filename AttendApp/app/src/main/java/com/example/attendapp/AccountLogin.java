package com.example.attendapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AccountLogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account_login);
    }

    public void onButtonClick(View view){
        Intent intent=new Intent(AccountLogin.this, Classlist.class);
        startActivity(intent);
    }
}


