package com.example.detectives;

import android.Manifest;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }
    public void forOneActivity(View v){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}