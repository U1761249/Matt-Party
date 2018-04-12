package com.example.adam.mattparty;

import android.graphics.Color;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import gr.net.maroulis.library.EasySplashScreen;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        final MediaPlayer mp = MediaPlayer.create(this, R.raw.mexican_tune);

        EasySplashScreen config = new EasySplashScreen(SplashScreen.this)
                .withFullScreen()
                .withTargetActivity(SelectionActivity.class)
                .withSplashTimeOut(4000)
                .withBackgroundColor(Color.parseColor("#3f51b5"))
                .withLogo(R.drawable.matt_icon)
                .withHeaderText("Welcome");


    View view = config.create();
    mp.start();
    setContentView(view);
    }
}
