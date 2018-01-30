package com.ab2018.akademikbilisim;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GirisActivity extends AppCompatActivity {



    Button giris;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_giris);

        intent = getIntent();

        giris=findViewById(R.id.loginButtonSendId);
        giris.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),ProfilOlusturActivity.class);
                startActivity(intent);
            }
        });


    }
}
