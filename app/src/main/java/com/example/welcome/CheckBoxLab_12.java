package com.example.welcome;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

public class CheckBoxLab_12 extends AppCompatActivity {
    CheckBox checkBox1,checkBox2,checkBox3;
    Button btnCheck;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box_lab12);

        checkBox1 = findViewById(R.id.checkbox1);
        checkBox2 = findViewById(R.id.checkbox2);
        checkBox3 = findViewById(R.id.checkbox3);
        btnCheck =findViewById(R.id.showButton);

        btnCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showCheckedCheckboxes();
            }
        });

    }
    private void showCheckedCheckboxes(){
        StringBuilder checkedCheckBoxes = new StringBuilder("Checked Checkboxes : ");
        if (checkBox1.isChecked()){
            checkedCheckBoxes.append("check box 1").append( checkBox1.getText()).append(",");
        }
        if (checkBox2.isChecked()){
            checkedCheckBoxes.append("check box 2").append( checkBox2.getText()).append(",");
        }
        if (checkBox3.isChecked()){
            checkedCheckBoxes.append("check box 3").append( checkBox3.getText()).append(",");
        }
        Toast.makeText(getApplicationContext(),checkedCheckBoxes.toString(),Toast.LENGTH_SHORT).show();
    }
}