package tr.k12.evrim.evrimnews;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Ortaklarimiz extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ortaklarimiz);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

        WebView webb =(WebView)findViewById(R.id.webviewortak);
        webb.setWebViewClient(new WebViewClient());
        webb.loadUrl("http://www.evrim.k12.tr/tr/okulumuzu-taniyin/ortaklarimiz/");
        WebSettings webSettings = webb.getSettings();
        webSettings.setJavaScriptEnabled(true);

    }

}
