package com.example.adam.mattparty;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Selection;
import android.view.View;

public class SelectionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selection);
    }

    public void whereMessage(View view){
        startActivity(new Intent(SelectionActivity.this, WhereActivity.class));}
    public void whenMessage(View view){
        startActivity(new Intent(SelectionActivity.this, WhenActivity.class));}
    public void regMessage(View view){
        startActivity(new Intent(SelectionActivity.this, RegisterActivity.class));}
    public void infoMessage(View view){
        startActivity(new Intent(SelectionActivity.this, InfoActivity.class));}
}

