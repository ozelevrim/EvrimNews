package tr.k12.evrim.evrimnews;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import static tr.k12.evrim.evrimnews.R.id.url;

public class SosyalEvrim extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sosyal_evrim);


    }

    public void OpenFacebook(View v) {
        String YourPageURL = "https://www.facebook.com/n/?evrimokullari";
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(YourPageURL));

        startActivity(browserIntent);
    }

    public void OpenTwitter(View v) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/evrimokullari"));
        startActivity(browserIntent);
    }

    public void OpenInstagram(View v) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/evrimokullari"));
        startActivity(browserIntent);
    }

    public void OpenInternet(View v) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.evrim.k12.tr"));
        startActivity(browserIntent);
    }

    public void OpenYoutube(View v) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/channel/UCN5d2l_zmqlvX8_wJq0oHjA"));
        startActivity(browserIntent);
    }

}
