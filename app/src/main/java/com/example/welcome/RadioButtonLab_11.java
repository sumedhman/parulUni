package com.example.welcome;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class RadioButtonLab_11 extends AppCompatActivity {
    RadioGroup radioGroup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_button_lab11);
        //A radio button is a widget that allows users to select a single option from a set of mutually exclusive choices.
        //It's commonly used in scenarios where users need to choose one option from multiple options presented in a list.
        radioGroup = findViewById(R.id.radioGroup);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                //here no need to pass the radioButton id which is given in xml file. R.id. job is doing by checkedId
                RadioButton radioButton = findViewById(checkedId);
                if (radioButton.isChecked()){
                    Toast.makeText(getApplicationContext(),"You selected"+radioButton.getText().toString(),Toast.LENGTH_LONG).show();

                } else {
                    Toast.makeText(getApplicationContext(),"Not selected",Toast.LENGTH_LONG).show();

                }
              }
        });
    }
}