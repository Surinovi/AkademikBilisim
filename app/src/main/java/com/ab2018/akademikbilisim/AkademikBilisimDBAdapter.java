package com.ab2018.akademikbilisim;

import android.annotation.SuppressLint;
import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by tugba on 30.01.2018.
 */

public class AkademikBilisimDBAdapter {
    private DatabaseHelper DBHelper;
    private SQLiteDatabase db;
    private final Context context;

    public static final String KEY_KURSID = "id";
    public static final String KEY_KURSISIM= "isim";
    public static final String KEY_KURSSORULAR = "sorular";
    public static final String KEY_KURSDETAY= "detay";

    public static final String KEY_OGRENCITCKN = "tcKn";
    public static final String KEY_OGRENCIISIM = "isim";
    public static final String KEY_OGRENCISOYISIM = "soyisim";
    public static final String KEY_OGRENCIEMAIL = "email";
    public static final String KEY_OGRENCIPAROLA = "parola";
    public static final String KEY_OGRENCIMESLEK = "meslek";
    public static final String KEY_OGRENCICINSIYET = "cinsiyet";
    public static final String KEY_OGRENCIDTARIHI = "dTarih";
    public static final String KEY_OGRENCIADRES = "adres";
    public static final String KEY_OGRENCIEGITIM = "egitim";
    public static final String KEY_OGRENCIRESİM = "resim";
    public static final String KEY_OGRENCIDETAY = "detay";
    public static final String KEY_OGRENCIBÖLÜM = "bölüm";
    public static final String KEY_OGRENCIANKET = "anket";



    public static final String KEY_EGITMENTCKN= "tcKn";
    public static final String KEY_EGITMENISIM= "isim";
    public static final String KEY_EGITMENSOYISIM= "soyisim";
    public static final String KEY_EGITMENPAROLA= "parola";
    public static final String KEY_EGITMENMESLEK= "meslek";
    public static final String KEY_EGITMENCINSIYET= "cinsiyet";
    public static final String KEY_EGITMENDTARIHI= "dTarih";
    public static final String KEY_EGITMENADRES= "adres";
    public static final String KEY_EGITMENEGITIM= "egitim";
    public static final String KEY_EGITMENKURS= "kurs";

    public static final String KEY_SORUID= "id";
    public static final String KEY_SORUSORU= "soru";
    public static final String KEY_SORUCEVAP= "cevap";

    public static final String KEY_DCEVAPID= "id";
    public static final String KEY_DCEVAPCEVAP= "dCevap";

    public static final String KEY_CEVAPLARID= "id";
    public static final String KEY_CEVAPLARKURSID= "kursid";
    public static final String KEY_CEVAPLARSORUID= "soruid";
    public static final String KEY_CEVAPLARUSERID= "userid";
    public static final String KEY_CEVAPLARCEVAP= "cevap";

    private static final String DBTAG = "AkademikBilisimDBAdapter";


    private static final String DATABASE_NAME = "AkademikBilisimDB";
    private static final String DATABASE_KURSTABLE = "Kurs";
    private static final String DATABASE_OGRENCITABLE = "Ogrenci";
    private static final String DATABASE_EGITMENTABLE = "Egitmen";
    private static final String DATABASE_SORUTABLE = "soru";
    private static final String DATABASE_CEVAPTABLE = "cevap";
    private static final String DATABASE_DCEVAPTABLE = "cevaplar";

    private static final int DATABASE_VERSION = 1;

    private static final String DATABASE_CREATE = "create table dogruCevap (id INTEGER PRIMARY KEY AUTOINCREMENT, "
            + "dcevap blob);";

    // Constructor
    public AkademikBilisimDBAdapter(Context ctx) {
        this.context = ctx;
        DBHelper = new DatabaseHelper(context);
    }

    // To create and upgrade a database in an Android application SQLiteOpenHelper subclass is usually created
    private static class DatabaseHelper extends SQLiteOpenHelper {
        DatabaseHelper(Context context) {
            super(context, DATABASE_NAME, null, DATABASE_VERSION);
        }

        @Override
        public void onCreate(SQLiteDatabase db) {
            // onCreate() is called by the framework, if the database does not exist
            Log.d("Create", "Creating the database");

            try {
                db.execSQL(DATABASE_CREATE);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        @SuppressLint("LongLogTag")
        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            // Sends a Warn log message
            Log.w(DBTAG, "Upgrading database from version " + oldVersion + " to "
                    + newVersion + ", which will destroy all old data");

            // Method to execute an SQL statement directly
            db.execSQL("DROP TABLE IF EXISTS movies");
            onCreate(db);
        }
    }

    // Opens the database
    public AkademikBilisimDBAdapter open() throws SQLException {
        // Create and/or open a database that will be used for reading only
        db = DBHelper.getReadableDatabase();
        Log.d("log","open");
        return this;

    }

    // Closes the database
    public void close() {
        // Closes the database
        DBHelper.close();
    }

}
