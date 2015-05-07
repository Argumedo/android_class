package com.detroitteatime.myflickr;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by mark on 5/7/15.
 */
public class DataBaseHelper extends SQLiteOpenHelper{

    private static final String DATABASE_CREATE =
            "CREATE TABLE "+

                    Contract.PhotoEntry._ID + " ";

    public DataBaseHelper(Context context){
        super(context, "myflickr.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {



    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
