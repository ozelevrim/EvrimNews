package tr.k12.evrim.evrimnews;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class AylikYemekMenuleri extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aylik_yemek_menuleri);

        WebView webb =(WebView)findViewById(R.id.webviewaylikyemek);
        webb.setWebViewClient(new WebViewClient());
        webb.loadUrl("http://www.evrim.k12.tr/tr/evrim-guncel/aylik-yemek-menuleri/");
        WebSettings webSettings = webb.getSettings();
        webSettings.setJavaScriptEnabled(true);




        }


    }

