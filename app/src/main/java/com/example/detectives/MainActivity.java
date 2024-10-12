package com.example.detectives;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton secret,zagadka;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void forTwoActivity(View v){
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }

    public void forSecretActivity(View v){
        Intent intent = new Intent(this, SecretForestActivity.class);
        startActivity(intent);
    }

    public void forRiddlesActivity(View v){
        Intent intent = new Intent(this, RiddlesSilenceActivity.class);
        startActivity(intent);

}}