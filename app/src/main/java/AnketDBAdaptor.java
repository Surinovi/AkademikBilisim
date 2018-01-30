package com.ab2018.akademikbilisim;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;


public class AnketDBAdaptor {
    private DatabaseHelper DBHelper;
    private SQLiteDatabase db;
    private final Context context;

    public static final String KEY_CORECTID = "ID";
    public static final String KEY_CORECT_QUESTION_ID = "QuestionID";
    public static final String KEY_CORRECT = "Correct";


    public static final String KEY_QUESTION_ID = "ID";
    public static final String KEY_QUESTION= "QUESTION";
    public static final String KEY_QUESTION_ANSWERS = "ANSWERS";

    private static final String TAG = "AnketDBAdapter";

    private static final String DATABASE_NAME = "survey";
    private static final String DATABASE_CORRECTTABLE = "Correct";
    private static final String DATABASE_QUESTIONTABLE = "Question";

    private static final int DATABASE_VERSION = 1;

    private static final String DATABASE_CREATE = "create table Question (ID INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT UNIQUE, "
            + "Question text, Answers text);";

    // Constructor
    public AnketDBAdaptor(Context ctx) {
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

        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            // Sends a Warn log message
            Log.w(TAG, "Upgrading database from version " + oldVersion + " to "
                    + newVersion + ", which will destroy all old data");

            // Method to execute an SQL statement directly
            db.execSQL("DROP TABLE IF EXISTS movies");
            onCreate(db);
        }
    }

    // Opens the database
    public AnketDBAdaptor open() throws SQLException {
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

    // sadece doğru cevabı çekiyor
    public  Cursor getAllCorrect() {
        Log.d("log","getall");
        return db.query(DATABASE_CORRECTTABLE, new String[] { KEY_CORECTID, KEY_CORECT_QUESTION_ID,
                KEY_CORRECT}, null, null, null, null, null);
    }

    // Soru ve çıkları çekiyor
    public  Cursor getQuestions() {
        return db.query(DATABASE_QUESTIONTABLE, new String[] {KEY_QUESTION_ID,KEY_QUESTION,KEY_QUESTION_ANSWERS}, null, null, null, null, null);
    }



}
