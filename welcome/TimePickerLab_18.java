package com.example.welcome;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TimePicker;
import android.widget.Toast;

public class TimePickerLab_18 extends AppCompatActivity {
    TimePicker timePicker;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_picker_lab18);
        timePicker = findViewById(R.id.timePicker);
        //if want to change the time when user select the specific time formate
        timePicker.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
            @Override
            public void onTimeChanged(TimePicker view, int hourOfDay, int minute) {
                //handle the time change
                Toast.makeText(getApplicationContext(),"Hours "+hourOfDay+"minute "+minute,Toast.LENGTH_LONG).show();
            }
        });

    }
}
//run the program and try to change the minite hand, you will see the time is change on up