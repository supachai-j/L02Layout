package andriod.training.cat.com.l02layout;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by LqLconf on 11/7/2017.
 */

public class WebViewActivity extends AppCompatActivity {

    final String URL = "http://www.mybycat.com/th/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);

        if (getSupportActionBar() != null) getSupportActionBar().hide();

        WebView wv = (WebView) findViewById(R.id.lo_wv);
        wv.setWebViewClient(new WebViewClient());
        WebSettings webSettings = wv.getSettings();
        webSettings.setSupportZoom(false);
        webSettings.setCacheMode(WebSettings.LOAD_NO_CACHE);
        webSettings.setSupportMultipleWindows(false);
//        webSettings.setDomStorageEnabled(true);
        webSettings.setJavaScriptEnabled(true);
        wv.loadUrl(URL);
    }
}

