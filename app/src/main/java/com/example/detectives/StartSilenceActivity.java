package com.example.detectives;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class StartSilenceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_silence);
    }
    public void forRiddlesActivity(View v){
        Intent intent = new Intent(this, RiddlesSilenceActivity.class);
        startActivity(intent);

    }
}