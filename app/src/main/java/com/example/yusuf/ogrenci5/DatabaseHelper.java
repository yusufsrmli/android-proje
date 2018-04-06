package com.example.yusuf.ogrenci5;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper{
    public static final String DATABASE_NAME = "Dersprogrami.db";
    public static final String TABLE_NAME  = "PAZARTESI";
    public static final String TABLE_NAME1 = "SALI";
    public static final String TABLE_NAME2 = "CARSANBA";
    public static final String TABLE_NAME3 = "PERSENBE";
    public static final String TABLE_NAME4 = "CUMA";
    public static final String TABLE_NAME5 = "CUMARTESI";
    public static final String TABLE_NAME6 = "PAZAR";

    public static final String Col_1 = "ID";
    public static final String Col_2 = "DERSADI";
    public static final String Col_3 = "GUN";
    public static final String Col_4 = "DEVAMSAYISI";
    public static final String Col_5 = "YAPILANDEVAM";


    public DatabaseHelper(Context context) {

        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL("create table "+TABLE_NAME+" (ID INTEGER PRIMARY KEY AUTOINCREMENT, DERSADI TEXT" +
                ", GUN TEXT, DEVAMSAYISI TEXT, YAPILANDEVAM TEXT  )");

        db.execSQL("create table "+TABLE_NAME1+" (ID INTEGER PRIMARY KEY AUTOINCREMENT, DERSADI TEXT" +
                ", GUN TEXT,  DEVAMSAYISI TEXT, YAPILANDEVAM TEXT  )");

        db.execSQL("create table "+TABLE_NAME2+" (ID INTEGER PRIMARY KEY AUTOINCREMENT, DERSADI TEXT" +
                ", GUN TEXT,  DEVAMSAYISI TEXT, YAPILANDEVAM TEXT)");

        db.execSQL("create table "+TABLE_NAME3+" (ID INTEGER PRIMARY KEY AUTOINCREMENT, DERSADI TEXT" +
                ", GUN TEXT,  DEVAMSAYISI TEXT, YAPILANDEVAM TEXT)");

        db.execSQL("create table "+TABLE_NAME4+" (ID INTEGER PRIMARY KEY AUTOINCREMENT, DERSADI TEXT" +
                ", GUN TEXT,  DEVAMSAYISI TEXT, YAPILANDEVAM TEXT )");

        db.execSQL("create table "+TABLE_NAME5+" (ID INTEGER PRIMARY KEY AUTOINCREMENT, DERSADI TEXT" +
                ", GUN TEXT,  DEVAMSAYISI TEXT, YAPILANDEVAM TEXT)");

        db.execSQL("create table "+TABLE_NAME6+" (ID INTEGER PRIMARY KEY AUTOINCREMENT, DERSADI TEXT" +
                ", GUN TEXT,  DEVAMSAYISI TEXT, YAPILANDEVAM TEXT)");

    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME);
        db.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME1);
        db.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME2);
        db.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME3);
        db.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME4);
        db.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME5);
        db.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME6);
        onCreate(db);
    }
    public boolean insertData_Pazartesi(String DERSADI, String GUN,String DEVAMSAYISI, String YAPILANDEVAM){

        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues contentValues = new ContentValues();
        contentValues.put(Col_2, DERSADI);
        contentValues.put(Col_3, GUN);
        contentValues.put(Col_4, DEVAMSAYISI);
        contentValues.put(Col_5, YAPILANDEVAM);




        long result = db.insert(TABLE_NAME,null,contentValues);
        if (result == -1)
            return false;
        else
            return true;
    }
    public boolean insertData_Sali(String DERSADI, String GUN, String DEVAMSAYISI, String YAPILANDEVAM){

        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues contentValues = new ContentValues();
        contentValues.put(Col_2, DERSADI);
        contentValues.put(Col_3, GUN);
        contentValues.put(Col_4, DEVAMSAYISI);
        contentValues.put(Col_5, YAPILANDEVAM);


        long result = db.insert(TABLE_NAME1,null,contentValues);
        if (result == -1)
            return false;
        else
            return true;
    }
    public boolean insertData_Carsanba(String DERSADI, String GUN, String DEVAMSAYISI, String YAPILANDEVAM){

        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues contentValues = new ContentValues();
        contentValues.put(Col_2, DERSADI);
        contentValues.put(Col_3, GUN);
        contentValues.put(Col_4, DEVAMSAYISI);
        contentValues.put(Col_5, YAPILANDEVAM);



        long result = db.insert(TABLE_NAME2,null,contentValues);
        if (result == -1)
            return false;
        else
            return true;
    }
    public boolean insertData_Persenbe(String DERSADI, String GUN, String DEVAMSAYISI, String YAPILANDEVAM){

        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues contentValues = new ContentValues();
        contentValues.put(Col_2, DERSADI);
        contentValues.put(Col_3, GUN);
        contentValues.put(Col_4, DEVAMSAYISI);
        contentValues.put(Col_5, YAPILANDEVAM);

        long result = db.insert(TABLE_NAME3,null,contentValues);
        if (result == -1)
            return false;
        else
            return true;
    }
    public boolean insertData_Cuma(String DERSADI, String GUN,String DEVAMSAYISI, String YAPILANDEVAM){

        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues contentValues = new ContentValues();
        contentValues.put(Col_2, DERSADI);
        contentValues.put(Col_3, GUN);
        contentValues.put(Col_4, DEVAMSAYISI);
        contentValues.put(Col_5, YAPILANDEVAM);


        long result = db.insert(TABLE_NAME4,null,contentValues);
        if (result == -1)
            return false;
        else
            return true;
    }
    public boolean insertData_Cumartesi(String DERSADI, String GUN, String DEVAMSAYISI, String YAPILANDEVAM){

        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues contentValues = new ContentValues();
        contentValues.put(Col_2, DERSADI);
        contentValues.put(Col_3, GUN);
        contentValues.put(Col_4, DEVAMSAYISI);
        contentValues.put(Col_5, YAPILANDEVAM);


        long result = db.insert(TABLE_NAME5,null,contentValues);
        if (result == -1)
            return false;
        else
            return true;
    }
    public boolean insertData_Pazar(String DERSADI, String GUN, String DEVAMSAYISI, String YAPILANDEVAM){

        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues contentValues = new ContentValues();
        contentValues.put(Col_2, DERSADI);
        contentValues.put(Col_3, GUN);
        contentValues.put(Col_4, DEVAMSAYISI);
        contentValues.put(Col_5, YAPILANDEVAM);


        long result = db.insert(TABLE_NAME6,null,contentValues);
        if (result == -1)
            return false;
        else
            return true;
    }
    public Cursor getAllData_Pazartesi(){
        SQLiteDatabase db = this.getWritableDatabase();

        Cursor result = db.rawQuery("select * from "+TABLE_NAME,null);

        return result;
    }
    public Cursor getAllData_Sali(){
        SQLiteDatabase db = this.getWritableDatabase();

        Cursor result = db.rawQuery("select * from "+TABLE_NAME1,null);

        return result;
    }
    public Cursor getAllData_Carsanba(){
        SQLiteDatabase db = this.getWritableDatabase();

        Cursor result = db.rawQuery("select * from "+TABLE_NAME2,null);

        return result;
    }
    public Cursor getAllData_Persenbe(){
        SQLiteDatabase db = this.getWritableDatabase();

        Cursor result = db.rawQuery("select * from "+TABLE_NAME3,null);

        return result;
    }

    public Cursor getAllData_Cuma(){
        SQLiteDatabase db = this.getWritableDatabase();

        Cursor result = db.rawQuery("select * from "+TABLE_NAME4,null);

        return result;
    }
    public Cursor getAllData_Cumartesi(){
        SQLiteDatabase db = this.getWritableDatabase();

        Cursor result = db.rawQuery("select * from "+TABLE_NAME5,null);

        return result;
    }
    public Cursor getAllData_Pazar(){
        SQLiteDatabase db = this.getWritableDatabase();

        Cursor result = db.rawQuery("select * from "+TABLE_NAME6,null);

        return result;
    }

    public Integer deleteData_pazartesi(String id){
        SQLiteDatabase db = this.getWritableDatabase();
        return db.delete(TABLE_NAME,"ID = ?", new String[]{id});
    }
    public Integer deleteData_sali(String id){
        SQLiteDatabase db = this.getWritableDatabase();
        return db.delete(TABLE_NAME1,"ID = ?", new String[]{id});
    }
    public Integer deleteData_carsamba(String id){
        SQLiteDatabase db = this.getWritableDatabase();
        return db.delete(TABLE_NAME2,"ID = ?", new String[]{id});
    }
    public Integer deleteData_persembe(String id){
        SQLiteDatabase db = this.getWritableDatabase();
        return db.delete(TABLE_NAME3,"ID = ?", new String[]{id});
    }
    public Integer deleteData_cuma(String id){
        SQLiteDatabase db = this.getWritableDatabase();
        return db.delete(TABLE_NAME4,"ID = ?", new String[]{id});
    }
    public Integer deleteData_cumartesi(String id){
        SQLiteDatabase db = this.getWritableDatabase();
        return db.delete(TABLE_NAME5,"ID = ?", new String[]{id});
    }
    public Integer deleteData_pazar(String id){
        SQLiteDatabase db = this.getWritableDatabase();
        return db.delete(TABLE_NAME6,"ID = ?", new String[]{id});
    }



    public void updatede_data(String isim, String devam){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put(Col_5, devam);

        db.update(TABLE_NAME, contentValues, "DERSADI = ?",new String[]{isim});
        db.update(TABLE_NAME1, contentValues, "DERSADI = ?",new String[]{isim});
        db.update(TABLE_NAME2, contentValues, "DERSADI = ?",new String[]{isim});
        db.update(TABLE_NAME3, contentValues, "DERSADI = ?",new String[]{isim});
        db.update(TABLE_NAME4, contentValues, "DERSADI = ?",new String[]{isim});
        db.update(TABLE_NAME5, contentValues, "DERSADI = ?",new String[]{isim});


    }






}
