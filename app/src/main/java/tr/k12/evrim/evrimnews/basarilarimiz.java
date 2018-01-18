package tr.k12.evrim.evrimnews;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class basarilarimiz extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basarilarimiz);


        WebView webb =(WebView)findViewById(R.id.webviewbasari);
        webb.setWebViewClient(new WebViewClient());
        webb.loadUrl("http://www.evrim.k12.tr/tr/okulumuzu-taniyin/basarilarimiz");
        WebSettings webSettings = webb.getSettings();
        webSettings.setJavaScriptEnabled(true);

    }

}
