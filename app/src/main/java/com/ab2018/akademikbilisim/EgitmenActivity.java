package com.ab2018.akademikbilisim;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class EgitmenActivity extends AppCompatActivity {

    Ogrenci tmp;
    ListView listview;
    ArrayList<Ogrenci> ogrenci;
    EgitmenAdapter egitmenAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_egitmen);

        ogrenci = new ArrayList<>();
        ogrenci.add(new Ogrenci("tckn", "isim", "soyisim", "email", "parola", "meslek", "cinsiyet", "dogumtarihi", "adres", "egitim", "xdsd", "detay", "bolum", 2));
        egitmenAdapter = new EgitmenAdapter(this, 0, ogrenci);


        //egitmen
        listview = findViewById(R.id.listim);
        listview.setAdapter(egitmenAdapter);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String msg = "";

                Ogrenci ogr = (Ogrenci) listview.getItemAtPosition(i);
                msg += "Adınız ve soyadınız: "+ ogr.getIsim()+"\n";



                makeAndShowDialogBox(msg);
            }
        });

    }
    private void makeAndShowDialogBox(String message) {

        AlertDialog.Builder myDialogBox = new AlertDialog.Builder(this);

        // set message, title, and icon
        myDialogBox.setTitle("Başvuru ");
        myDialogBox.setMessage(message);

        // Set three option buttons
        myDialogBox.setPositiveButton("Onayla",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {
                        // whatever should be done when answering "YES" goes
                        // here

                    }
                });

         myDialogBox.setNegativeButton("Reddet",
         new DialogInterface.OnClickListener() {
         public void onClick(DialogInterface dialog, int whichButton) {
         // whatever should be done when answering "NO" goes here

         }
        });

         myDialogBox.setNeutralButton("Cancel",
        new DialogInterface.OnClickListener() {
         public void onClick(DialogInterface dialog, int whichButton) {
        // whatever should be done when answering "NO" goes here

         }
        });

        myDialogBox.create();
        myDialogBox.show();


    }

}
