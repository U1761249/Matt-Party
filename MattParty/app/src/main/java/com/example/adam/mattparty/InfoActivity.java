package com.example.adam.mattparty;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class InfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);}


    public void backMessage(View view){
        startActivity(new Intent(InfoActivity.this, SelectionActivity.class));}
    }

