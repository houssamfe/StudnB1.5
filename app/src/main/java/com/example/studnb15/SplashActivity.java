package com.example.studnb15;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import java.util.Timer;
import java.util.TimerTask;

public class SplashActivity extends MainActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_splash);

        // 2 seconds pause on splash page
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {


                    Intent intent = new Intent(getApplicationContext(),LoginActivity.class);
                    startActivity(intent);
                    finish();

            }
        },2000);


    }


}