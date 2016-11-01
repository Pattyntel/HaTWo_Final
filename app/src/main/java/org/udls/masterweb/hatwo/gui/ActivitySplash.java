package org.udls.masterweb.hatwo.gui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.widget.ProgressBar;
import android.widget.TextView;

import org.udls.masterweb.hatwo.R;

import java.util.Timer;
import java.util.TimerTask;

public class ActivitySplash extends Activity {

    private ProgressBar mProgressBar;
    private boolean mbActive;
    private static final int SPLASH_TIME = 5000;

  /*private static final long SPLASH_TIME = 5000;


    private int progressStatus = 0;
    private TextView textView;
    private Handler handler = new Handler();



*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

//Con Progress Bar y Timer
       TimerTask task = new TimerTask() {
            @Override
            public void run() {
               // Intent mainIntent = new Intent().setClass(ActivitySplash.this, ActivityMain.class);
               // startActivity(mainIntent);
                 Intent intent = new Intent(ActivitySplash.this, ActivityAcceso.class);
                 startActivity(intent);
                finish();
            }
        };
        Timer timer = new Timer();
        timer.schedule(task, SPLASH_TIME);
    }


//Sin progress Bar solo Splash
   /*     new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(ActivitySplash.this, ActivityMain.class);
                startActivity(intent);
            }
        }, 5000);*/

//Con ProgressBar e Hilos
 /*     mProgressBar = (ProgressBar) findViewById(R.id.progress_bar);

       final Thread timerThread = new Thread() {
            @Override
            public void run() {
                mbActive = true;
                try {
                    int waited = 0;
                    while (mbActive && (waited < SPLASH_TIME)) {
                        sleep(200);
                        if (mbActive) {
                            waited += 200;
                            updateProgress(waited);
                        }
                    }
                } catch (InterruptedException e) {
                } finally {
                    onContinue();
                }
            }
        };
        timerThread.start();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    public void updateProgress(final int timePassed) {
        if (null != mProgressBar) {
            final int progress = mProgressBar.getMax() * timePassed / SPLASH_TIME;
            mProgressBar.setProgress(progress);
        }
    }

    public void onContinue() {
        Intent intent = new Intent(ActivitySplash.this, ActivityMain.class);
        startActivity(intent);
    }*/
}
