package com.example.detectives;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class RiddlesSilenceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_riddles_silence);
    }
    public void forTwoActivity(View v){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void forStartSilenceActivity(View v){
        Intent intent = new Intent(this, StartSilenceActivity.class);
        startActivity(intent);
    }
}