package tr.k12.evrim.evrimnews;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

public class Kadromuz extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kadromuz);


        WebView webb =(WebView)findViewById(R.id.webview);
        webb.setWebViewClient(new WebViewClient());
        webb.loadUrl("http://www.evrim.k12.tr/tr/okulumuzu-taniyin/kadromuz");
        WebSettings webSettings = webb.getSettings();
        webSettings.setJavaScriptEnabled(true);






    }
}
