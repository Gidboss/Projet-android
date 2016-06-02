package com.example.abrault.gestionnairedesnotes;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by abrault on 04/05/2016.
 */
public class Model extends SQLiteOpenHelper {

    String tag = "ModelTest";

    public Model(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
        Log.i(tag, "Constructeur");
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        Log.i(tag, "Creation");

        Log.i(tag, "Fin de la creation");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        Log.i(tag, "Upgrade");

        Log.i(tag, "Fin Upgrade");
    }
}
