package com.ab2018.akademikbilisim;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AnaSayfaActivity extends AppCompatActivity {

    Button btnGirisGit;

    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ana_sayfa);

        intent = getIntent();

        btnGirisGit = (Button)findViewById(R.id.btnGiris_activity);

        btnGirisGit.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                intent = new Intent(AnaSayfaActivity.this, GirisActivity.class);
                startActivity(intent);
                finish();

            }
        });
    }
}
