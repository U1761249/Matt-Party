package com.example.adam.mattparty;

import android.content.Context;
import android.content.Intent;
import android.icu.text.SimpleDateFormat;
import android.media.MediaPlayer;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Selection;
import android.view.View;
import android.widget.Toast;

import java.text.DateFormat;
import java.util.Date;

public class SelectionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selection);
    }
    public void playMessage(View view){
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.mexican_tune);
        mp.start();
    }

    public void whereMessage(View view){
        startActivity(new Intent(SelectionActivity.this, WhereActivity.class));}
    @RequiresApi(api = Build.VERSION_CODES.N)
    public void whenMessage(View view){
        startActivity(new Intent(SelectionActivity.this, WhenActivity.class));

    }
    public void regMessage(View view){
        startActivity(new Intent(SelectionActivity.this, SignUpActivity.class));}

    public void infoMessage(View view){
        startActivity(new Intent(SelectionActivity.this, InfoActivity.class));}
}

