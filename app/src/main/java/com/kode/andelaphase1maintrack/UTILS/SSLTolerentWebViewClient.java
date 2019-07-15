/*
package com.kode.andelaphase1maintrack.UTILS;

import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;


*/
/**
 * https://stackoverflow.com/questions/7416096/android-webview-not-loading-an-https-url
 **//*

// SSL Error Tolerant Web View Client
public class SSLTolerentWebViewClient extends WebViewClient {

    @Override
    public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
        handler.proceed(); // Ignore SSL certificate errors
    }


    @Override
    public void onPageFinished(WebView view, String url) {
        super.onPageFinished(view, url);
    }


}*/
