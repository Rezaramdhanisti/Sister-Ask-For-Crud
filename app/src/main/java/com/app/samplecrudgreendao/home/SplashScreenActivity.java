package com.app.samplecrudgreendao.home;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.app.samplecrudgreendao.R;

public class SplashScreenActivity extends AppCompatActivity {
    private int splashScreenTime=2000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                //setelah loading maka akan langsung berpindah ke login activity
                Intent home=new Intent(SplashScreenActivity.this, LoginActivity.class);
                startActivity(home);
                finish();

            }
        },splashScreenTime);
    }
}
