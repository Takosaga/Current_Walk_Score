package com.example.currentwalkscore

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient


class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val intent = getIntent()
        val website = intent.getStringExtra("Website")

        val myWebView: WebView = findViewById(R.id.webview)
        if (website != null) {
            myWebView.loadUrl(website)
        }









    }
}