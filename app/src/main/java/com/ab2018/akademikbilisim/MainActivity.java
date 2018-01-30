package com.ab2018.akademikbilisim;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //splash ekrani
        Thread myThread = new Thread(){

            @Override
            public void run() {
                try {
                    sleep(4000);
                    Intent startMainScreen = new Intent(MainActivity.this,AnaSayfaActivity.class);
                    startActivity(startMainScreen);
                    finish();
                }
                catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        };
        myThread.start();
    }
}
