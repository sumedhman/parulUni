package com.example.welcome;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;
public class DatabaseHelper extends SQLiteOpenHelper {
    String Database_Name="paruldatabase";
    int Database_version=1;
    //Table and column name
    String Table_name="student";
    String id="_id";
    String column_name="name";
    String column_age ="age";
    public DatabaseHelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        // Create your table
        String createTableQuery = "CREATE TABLE " + Table_name + "(" +
                id + " INTEGER PRIMARY KEY AUTOINCREMENT, " + column_name + " TEXT, " + column_age + " INTEGER)";
                db.execSQL(createTableQuery);
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        //we will write when we require some logic
    }
    //create our own method to add the data in to database
    void addData(String name, int age){
      SQLiteDatabase db  =this.getWritableDatabase();
        ContentValues values =new ContentValues();
        values.put(column_name,name);
        values.put(column_age,age);

        //insert the new row
        db.insert(Table_name,null,values);
        db.close();
    }
    // Create operation
    public long insertData(String name, int age) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(column_name, name);
        values.put(column_age, age);
        long newRowId = db.insert(Table_name, null, values);
        db.close();
        return newRowId;
    }

    // Read operation
    public Cursor getAllData() {
        SQLiteDatabase db = this.getReadableDatabase();
        return db.query(Table_name, null, null, null, null, null, null);
    }

    // Update operation
    public int updateData(long id, String newName, int newAge) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(column_name, newName);
        values.put(column_age, newAge);
        return db.update(Table_name, values, id + "=?", new String[]{String.valueOf(id)});
    }

    // Delete operation
    public int deleteData(long id) {
        SQLiteDatabase db = this.getWritableDatabase();
        return db.delete(Table_name, id + "=?", new String[]{String.valueOf(id)});
    }
}
