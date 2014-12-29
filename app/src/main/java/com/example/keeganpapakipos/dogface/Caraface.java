package com.example.keeganpapakipos.dogface;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import java.io.*;
import java.net.*;

public class Caraface extends Activity {
    private Handler mHandler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        int j;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_caraface);
        onWindowFocusChanged(true);
        final View lel = findViewById(android.R.id.content);
        lel.setKeepScreenOn(true);

        try{
            Socket mSocket = new Socket("crush.papakipos.com", 1025);

        }
        catch(UnknownHostException e) {
            e.printStackTrace();
        }
        catch(IOException e) {
            e.printStackTrace();
        }

        //This is for prototype reasons only
        mHandler.postDelayed(new Runnable() {
            @Override
            public void run() {
                ((ImageView)lel.findViewById(R.id.face_img)).setImageResource
                        (R.drawable.happydog);
            }
        }, 5000);
        //This is for prototype reasons only
        mHandler.postDelayed(new Runnable() {
            @Override
            public void run() {
                ((ImageView)lel.findViewById(R.id.face_img)).setImageResource
                        (R.drawable.worrydog);
            }
        }, 10000);
    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        if (hasFocus) {
            findViewById(android.R.id.content).setSystemUiVisibility(
                    View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                            | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                            | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                            | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                            | View.SYSTEM_UI_FLAG_FULLSCREEN
                            | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);}
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.caraface, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}