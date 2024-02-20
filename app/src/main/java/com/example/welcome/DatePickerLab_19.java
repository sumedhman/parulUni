package com.example.welcome;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.Toast;

public class DatePickerLab_19 extends AppCompatActivity {
    DatePicker datePicker;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date_picker_lab19);
        datePicker =findViewById(R.id.datePicker);
        btn = findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String day = "day"+datePicker.getDayOfMonth();
                String month = "month"+datePicker.getMonth()+1;
                String year =  "year"+ datePicker.getYear();
                Toast.makeText(getApplicationContext(),day + "\n"+ month+ "\n" +year,Toast.LENGTH_LONG).show();
            }
        });

    }
}
//Note- if you get an erro while diplaying the months, it becouse datePicker started as zero in january.
//so in line no.23 you write +1.(String month = "month"+datePicker.getMonth()+1;)