package com.example.edudrive;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.appcompat.app.AppCompatActivity;

public class Website extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.web_view);

        WebView webView = findViewById(R.id.webview);

        // Enable JavaScript (if required)
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        // Set a custom WebViewClient to handle URL loading within the WebView
//        webView.setWebViewClient(new WebViewClient() {
//            @Override
//            public boolean shouldOverrideUrlLoading(WebView view, String url) {
//                // Return false to allow the WebView to handle the URL loading
//                return false;
//            }
//        });
        // Load a URL
//        webView.loadUrl("https://docs.google.com/document/d/e/2PACX-1vSqcTFVnaTaaPsV0LJgPnIpyJMjMthPSH3Yss3duzwi6d2K6YfnNNtTj4nF0WWSUmBKgI9HZxQFVzMK/pub");
        Intent intent = getIntent();
        if (intent != null) {
            String embeddedCode = intent.getStringExtra("key");

            assert embeddedCode != null;
            webView.loadDataWithBaseURL("https://127.25.0.1",embeddedCode , "text/html", "utf-8", null);
        }
    }

}
