package com.example.meroghar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class DisplayPropertyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_property);

        getSupportActionBar().setTitle("Detail of the property");
    }
}