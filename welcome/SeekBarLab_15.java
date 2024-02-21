package com.example.welcome;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.Toast;

public class SeekBarLab_15 extends AppCompatActivity {
    SeekBar seekBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seek_bar_lab15);
        seekBar = findViewById(R.id.seekBar);
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                Toast.makeText(getApplicationContext(),progress,Toast.LENGTH_LONG).show();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                //do something when the user starts dragging the seekbar
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                //do something when user stop dragging the seekbar
            }
        });

    }
}