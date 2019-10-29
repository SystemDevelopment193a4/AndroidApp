package com.example.attendapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListView;


public class Classlist extends AppCompatActivity {

    int _classId=-1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_classlist);

        ListView lvClass = findViewById(R.id.lvClass);
        lvClass.setOnItemClickListener(new ListItemClickListener());

    }

    private class ListItemClickListener implements AdapterView.OnItemClickListener {

        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            _classId=position;
            Intent intent=new Intent(Classlist.this, AttendConfirm.class);
            startActivity(intent);
        }
    }

}
