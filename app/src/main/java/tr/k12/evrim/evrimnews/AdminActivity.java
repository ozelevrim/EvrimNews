package tr.k12.evrim.evrimnews;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.customtabs.CustomTabsIntent;
import android.support.v4.content.res.ResourcesCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;


/**
 * Created by Arda Çebi and Sedat Yetiş on 3.12.2016.
 */

public class AdminActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activiy_admin);
    }

    public void NewBlogPost(View v) {
        Intent intent = new Intent(getApplicationContext(), NewPost.class);
        startActivity(intent);
    }

    public void FirebaseDashboard(View v) {
        // Use a CustomTabsIntent.Builder to configure CustomTabsIntent.
        String url = "https://console.firebase.google.com/u/0/project/evrimnews-2edb8/overview";
        CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
        // set toolbar color and/or setting custom actions before invoking build()
        // Once ready, call CustomTabsIntent.Builder.build() to create a CustomTabsIntent
        CustomTabsIntent customTabsIntent = builder.build();
        builder.setToolbarColor(ResourcesCompat.getColor(getResources(), R.color.colorPrimary, null));
        builder.enableUrlBarHiding();
        // and launch the desired Url with CustomTabsIntent.launchUrl()
        customTabsIntent.launchUrl(this, Uri.parse(url));
    }








}
