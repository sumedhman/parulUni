package com.example.welcome;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class ImageViewLab_20 extends AppCompatActivity {
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_view_lab20);
        imageView =findViewById(R.id.imageView);
        //set an image resources programmatically
        imageView.setImageResource(R.drawable.ic_launcher_background);
        //you can put your image name in imageView.setImageResource(R.drawable.your-any-image);
    }
}