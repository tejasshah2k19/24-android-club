package com.androidclub24;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class WebViewActivity extends AppCompatActivity {

    WebView wv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);

        final WebView wbView = (WebView) findViewById(R.id.wv1);

        WebSettings settings = wbView.getSettings();
        settings.setJavaScriptEnabled(true);
        wbView.loadUrl("https://skid-royal.web.app");
        wbView.clearView();
        wbView.measure(100, 100);
//        settings.setUseWideViewPort(true);
 //       settings.setLoadWithOverviewMode(true);

    }
}