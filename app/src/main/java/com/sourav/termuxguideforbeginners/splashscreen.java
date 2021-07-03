package com.sourav.termuxguideforbeginners;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class splashscreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);

        Thread th= new Thread() {
            @Override
            public void run() {
                try {
                    sleep(2000);
                } catch (Exception e)  {
                    e.printStackTrace();
                }
                finally {
                    Intent obj = new Intent(splashscreen.this,MainActivity.class);
                    startActivity(obj);
                }
            }
        };
        th.start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}