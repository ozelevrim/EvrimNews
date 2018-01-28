package tr.k12.evrim.evrimnews;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Kurucu_temsilcisi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kurucu_temsilcisi);

        WebView webb =(WebView)findViewById(R.id.webviewkurucutemsilcisi);
        webb.setWebViewClient(new WebViewClient());
        webb.loadUrl("http://www.evrim.k12.tr/tr/okulumuzu-taniyin/kurucu-temsilcisi/");
        WebSettings webSettings = webb.getSettings();
        webSettings.setJavaScriptEnabled(true);


    }
}
