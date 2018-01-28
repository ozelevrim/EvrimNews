package tr.k12.evrim.evrimnews;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class CalismaTakvimi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calisma_takvimi);

        WebView webb =(WebView)findViewById(R.id.webviewcalismatakvimi);
        webb.setWebViewClient(new WebViewClient());
        webb.loadUrl("http://www.evrim.k12.tr/tr/evrim-guncel/20142015-egitim-ogretim-yili-calisma-takvimi/");
        WebSettings webSettings = webb.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }
}
