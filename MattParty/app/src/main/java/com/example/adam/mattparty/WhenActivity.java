package com.example.adam.mattparty;


import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import java.util.Date;

public class WhenActivity extends AppCompatActivity {

    TextView txtDaysRemain, txtLongString;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    txtDaysRemain = findViewById(R.id.txtDaysRemain);
    txtLongString = findViewById(R.id.txtLongString);
    
    StartTimer();

    }

    private void StartTimer() {
        long difference = getRemainingDays();
        new CountDownTimer(difference, 1000)
        {
            public void onTick(long millisUntilFinished){

                int days = (int)(millisUntilFinished/(1000*60*60*24));
                int hours = (int)(millisUntilFinished/(1000*60*60) % 24);
                int mins = (int)(millisUntilFinished/(1000*60) % 60);
                int sec = (int)(millisUntilFinished/(1000) % 60);
                txtDaysRemain.setText(String.format("%d",days));
                txtLongString.setText(String.format("%d DAYS %02d:%02d:%02d",days,hours,mins,sec));
            }
            public void onFinish(){}
        }.start();

    }

    private long getRemainingDays() {
        Date currentDate = new Date();
        Date endDate = new Date(2018, 5,5);

        return endDate.getTime() - currentDate.getTime();


    }
}
