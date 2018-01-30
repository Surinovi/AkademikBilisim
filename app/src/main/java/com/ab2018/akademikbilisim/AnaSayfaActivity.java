package com.ab2018.akademikbilisim;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class AnaSayfaActivity extends AppCompatActivity {

    Button btnGirisGit, btnKursDetay;

    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ana_sayfa);

        intent = getIntent();

        btnGirisGit = (Button)findViewById(R.id.btnGiris_activity);
        btnKursDetay = (Button)findViewById(R.id.btnKursDetaylari_activity);

        btnGirisGit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(AnaSayfaActivity.this, GirisActivity.class);
                startActivity(intent);
                finish();
            }
        });

        btnKursDetay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(AnaSayfaActivity.this, GirisActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if(id == R.id.mainIletisim)
        {
            android.app.AlertDialog.Builder dialog = new android.app.AlertDialog.Builder(AnaSayfaActivity.this);
            dialog.setTitle("AB2018");
            dialog.setMessage("Welcome!");
            dialog.setPositiveButton("Tamam", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    return;
                }
            });
            dialog.show();
            return  true;
        }
        return super.onOptionsItemSelected(item);
    }
}
