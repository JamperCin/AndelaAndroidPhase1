package com.kode.andelaphase1maintrack.UI.WebKit;

import android.net.http.SslError;
import android.os.Bundle;
import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.kode.andelaphase1maintrack.R;


public class AboutAlc extends AppCompatActivity {

    WebView mWebview;
    ProgressBar progressBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_alc);

        mWebview = findViewById(R.id.webview);
        progressBar = findViewById(R.id.progressBar);

       /* if (android.os.Build.VERSION.SDK_INT > 9) {
            StrictMode.ThreadPolicy policy = new
                    StrictMode.ThreadPolicy.Builder().permitAll().build();
            StrictMode.setThreadPolicy(policy);
        }*/

      //  mWebview = new WebView(this);


        mWebview.getSettings().setJavaScriptEnabled(true); // enable javascript
        mWebview.getSettings().setSupportZoom(true);

        mWebview.setWebViewClient(new SSLTolerentWebViewClient());

        mWebview.loadUrl("https://www.andela.com/alc/");
        progressBar.setVisibility(View.VISIBLE);

    }


    /**
     * https://stackoverflow.com/questions/7416096/android-webview-not-loading-an-https-url
     **/
    class SSLTolerentWebViewClient extends WebViewClient {

        @Override
        public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
            handler.proceed(); // Ignore SSL certificate errors
        }


        @Override
        public void onPageFinished(WebView view, String url) {
            super.onPageFinished(view, url);

            progressBar.setVisibility(View.GONE);
           // setContentView(mWebview);
        }


    }


}
