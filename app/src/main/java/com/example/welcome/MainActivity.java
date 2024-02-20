package com.example.welcome;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    Button btn;
    TextView title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Create an instance of your DBHelper
        DatabaseHelper dbhelper = new DatabaseHelper(this, "paruldatabase", null, 1);

        // Add data to the database
       // dbhelper.addData("sam wibo", 25);
        //dbhelper.addData("John gibo", 26);
        Log.d("MainActivity", "Newly inserted ID: ");

        long newId = dbhelper.insertData("Ajay", 25);
        Log.d("MainActivity", "Newly inserted ID: " + newId);

      /*  // Get all data operation
        Cursor cursor = dbhelper.getAllData();
        if (cursor != null) {
            while (cursor.moveToNext()) {
                long id = cursor.getLong(cursor.getColumnIndexOrThrow(dbhelper.id));
                String name = cursor.getString(cursor.getColumnIndexOrThrow(dbhelper.column_name));
                int age = cursor.getInt(cursor.getColumnIndexOrThrow(dbhelper.column_age));

                Log.d("MainActivity", "ID: " + id + ", Name: " + name + ", Age: " + age);
            }
            cursor.close();
        }

        // Update operation
        int rowsAffected = dbhelper.updateData(newId, "Updated Name", 30);
        Log.d("MainActivity", "Rows updated: " + rowsAffected);

        // Get all data after update
        cursor = dbhelper.getAllData();
        if (cursor != null) {
            while (cursor.moveToNext()) {
                long id = cursor.getLong(cursor.getColumnIndexOrThrow(dbhelper.id));
                String name = cursor.getString(cursor.getColumnIndexOrThrow(dbhelper.column_name));
                int age = cursor.getInt(cursor.getColumnIndexOrThrow(dbhelper.column_age));

                Log.d("MainActivity", "ID: " + id + ", Name: " + name + ", Age: " + age);
            }
            cursor.close();
        }

        // Delete operation
        int rowsDeleted = dbhelper.deleteData(newId);
        Log.d("MainActivity", "Rows deleted: " + rowsDeleted);

        // Get all data after delete
        cursor = dbhelper.getAllData();
        if (cursor != null) {
            while (cursor.moveToNext()) {
                long id = cursor.getLong(cursor.getColumnIndexOrThrow(dbhelper.id));
                String name = cursor.getString(cursor.getColumnIndexOrThrow(dbhelper.column_name));
                int age = cursor.getInt(cursor.getColumnIndexOrThrow(dbhelper.column_age));

                Log.d("MainActivity", "ID: " + id + ", Name: " + name + ", Age: " + age);
            }
            cursor.close();
        }
        dbhelper.close();*/
    }
    }

