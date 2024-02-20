package com.example.welcome;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AlertDialogLab_17 extends AppCompatActivity {
    Button btnShowAlertDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alert_dialog_lab17);
        btnShowAlertDialog = findViewById(R.id.showAlertDiaglog);
        btnShowAlertDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showAlertDialog();
            }
        });
    }
    void showAlertDialog(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("OOPs...").
                setMessage("Request fail: Unable to restart Host"+"\n"+"please check your connection and try again")
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                     //Handle the positive button clicked
                        dialog.dismiss();
                    }
                });
         //create and show AlertDialog
        AlertDialog alertDialog =builder.create();
        alertDialog.show();
    }
}