package com.example.attendapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TopMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_menu);
    }

    public void onButtonClick(View view) {
        Intent intent = new Intent(TopMenu.this, AttendConfirm.class);
        startActivity(intent);
    }
}
