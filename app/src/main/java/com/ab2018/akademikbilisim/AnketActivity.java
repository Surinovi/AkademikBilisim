package com.ab2018.akademikbilisim;

import android.database.Cursor;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CursorAdapter;
import android.widget.RadioButton;
import android.widget.TextView;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;

public class AnketActivity extends AppCompatActivity {
    TextView txt1;
    RadioButton rb1,rb2,rb3,rb4;
    Button button;
    AnketDBAdaptor anketDBAdaptor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anket);

        try {
            String destPath = "/data/data/" + getPackageName()
                    + "/databases/survey";
            File file = new File(destPath);
            File path = new File("/data/data/" + getPackageName()
                    + "/databases/");
            if (!file.exists()) {
                path.mkdirs();
                CopyDB(getBaseContext().getAssets().open("survey"),
                        new FileOutputStream(destPath));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        txt1=findViewById(R.id.QestionTV);
        rb1=findViewById(R.id.answer1);
        rb2=findViewById(R.id.answer2);
        rb3=findViewById(R.id.answer3);
        rb4=findViewById(R.id.answer4);
        button=findViewById(R.id.Button);

        anketDBAdaptor = new AnketDBAdaptor(this);

        anketDBAdaptor.open();

        Cursor cursor=anketDBAdaptor.getQuestions();

        txt1.setText(cursor.getString(1));
        String s =cursor.getString(2);
        String[] arr=s.split(",");

        /*
        rb1.setText(arr[0]);
        rb2.setText(arr[1]);
        rb3.setText(arr[2]);
        rb4.setText(arr[3]);
        */

    }

    public void CopyDB(InputStream inputStream, OutputStream outputStream)
            throws IOException {
        // Copy 1K bytes at a time
        byte[] buffer = new byte[1024];
        int length;
        while ((length = inputStream.read(buffer)) > 0) {
            outputStream.write(buffer, 0, length);
        }
        inputStream.close();
        outputStream.close();
    }

}
