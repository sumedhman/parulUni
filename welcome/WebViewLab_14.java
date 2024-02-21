package com.example.welcome;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class WebViewLab_14 extends AppCompatActivity {
    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view_lab14);
        webView = findViewById(R.id.webView);
        // Enable JavaScript (optional, depending on your use case)
        WebSettings webSettings = webView.getSettings();
        webSettings.getJavaScriptEnabled();
        //load url in the webview
        webView.loadUrl("https://www.google.com");
    }
}