package com.ab2018.akademikbilisim;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class KursDetayActivity extends AppCompatActivity {

    Intent gelenIntent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kurs_detay);
        //profil ekranıı

        gelenIntent = getIntent();
    }
}
