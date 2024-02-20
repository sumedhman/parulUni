package com.example.welcome;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

public class CheckBoxLab_13 extends AppCompatActivity {
   CheckBox checkBox1,checkBox2,checkBox3;
   @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box_lab13);
       checkBox1 = findViewById(R.id.checkbox1);
       checkBox2 = findViewById(R.id.checkbox2);
       checkBox3 = findViewById(R.id.checkbox3);

       checkBox1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    //code to execute when checkbox is checked
                    Toast.makeText(getApplicationContext(),"The check box 1 is checked",Toast.LENGTH_SHORT).show();
                }
                else  {
                    Toast.makeText(getApplicationContext(),"The check box 1 is not checked",Toast.LENGTH_SHORT).show();
                }
            }
        });

       checkBox2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
           @Override
           public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
               if(isChecked){
                   //code to execute when checkbox is checked
                   Toast.makeText(getApplicationContext(),"The check box 2 is checked",Toast.LENGTH_SHORT).show();
               }
               else  {
                   Toast.makeText(getApplicationContext(),"The check box 2 is not checked",Toast.LENGTH_SHORT).show();
               }
           }
       });

       checkBox3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
           @Override
           public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
               if(isChecked){
                   //code to execute when checkbox is checked
                   Toast.makeText(getApplicationContext(),"The check box 3 is checked",Toast.LENGTH_SHORT).show();
               }
               else  {
                   Toast.makeText(getApplicationContext(),"The check box 3 is not checked",Toast.LENGTH_SHORT).show();
               }
           }
       });


   }
}