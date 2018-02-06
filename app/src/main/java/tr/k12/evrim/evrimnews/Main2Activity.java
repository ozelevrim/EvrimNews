package tr.k12.evrim.evrimnews;

import android.annotation.TargetApi;
import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.support.customtabs.CustomTabsIntent;
import android.support.design.widget.Snackbar;
import android.support.v4.content.res.ResourcesCompat;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ListView;
import android.widget.Toast;

import com.github.amlcurran.showcaseview.ShowcaseView;
import com.github.amlcurran.showcaseview.targets.ActionViewTarget;


public class Main2Activity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {



    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public static void setStatusBarGradiant(Activity activity) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = activity.getWindow();
            Drawable background = activity.getResources().getDrawable(R.drawable.side_nav_bar);
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(activity.getResources().getColor(R.color.transparent));
            window.setNavigationBarColor(activity.getResources().getColor(R.color.transparent));
            window.setBackgroundDrawable(background);
        }
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_main2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        android.support.v7.app.ActionBar ab = getSupportActionBar();
        ab.setTitle("EvrimNews");
        ab.setSubtitle(R.string.ozelevrim);

        android.support.v7.app.ActionBar actionbar = getSupportActionBar();
        actionbar.setBackgroundDrawable(getResources().getDrawable(R.drawable.side_nav_bar));

        getWindow().setStatusBarColor(Color.parseColor("#50111111"));


        // ATTENTION: This was auto-generated to handle app links.
        Intent appLinkIntent = getIntent();
        String appLinkAction = appLinkIntent.getAction();
        Uri appLinkData = appLinkIntent.getData();
    }








    public void OpenTarihcemiz(View v) {
        // Use a CustomTabsIntent.Builder to configure CustomTabsIntent.
        String url = "http://www.evrim.k12.tr/tr/okulumuzu-taniyin/tarihcemiz/";
        CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
        // set toolbar color and/or setting custom actions before invoking build()
        // Once ready, call CustomTabsIntent.Builder.build() to create a CustomTabsIntent
        CustomTabsIntent customTabsIntent = builder.build();
        builder.setToolbarColor(ResourcesCompat.getColor(getResources(), R.color.okulumuzu_taniyin, null));
        builder.enableUrlBarHiding();
        // and launch the desired Url with CustomTabsIntent.launchUrl()
        customTabsIntent.launchUrl(this, Uri.parse(url));
    }

    public void OpenAylikYemek(View v) {
        // Use a CustomTabsIntent.Builder to configure CustomTabsIntent.
        String url = "http://www.evrim.k12.tr/tr/evrim-guncel/aylik-yemek-menuleri/";
        CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
        // set toolbar color and/or setting custom actions before invoking build()
        // Once ready, call CustomTabsIntent.Builder.build() to create a CustomTabsIntent
        CustomTabsIntent customTabsIntent = builder.build();
        builder.setToolbarColor(ResourcesCompat.getColor(getResources(), R.color.evrim_guncel, null));
        builder.enableUrlBarHiding();
        // and launch the desired Url with CustomTabsIntent.launchUrl()
        customTabsIntent.launchUrl(this, Uri.parse(url));
        ;
    }

    public void OpenVeliGorusme(View v) {
        // Use a CustomTabsIntent.Builder to configure CustomTabsIntent.
        String url = "http://www.evrim.k12.tr/tr/evrim-guncel/veli-gorusme-gun-ve-saatleri/";
        CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
        // set toolbar color and/or setting custom actions before invoking build()
        // Once ready, call CustomTabsIntent.Builder.build() to create a CustomTabsIntent
        CustomTabsIntent customTabsIntent = builder.build();
        builder.setToolbarColor(ResourcesCompat.getColor(getResources(), R.color.evrim_guncel, null));
        builder.enableUrlBarHiding();
        // and launch the desired Url with CustomTabsIntent.launchUrl()
        customTabsIntent.launchUrl(this, Uri.parse(url));
    }

    public void OpenBasarilarimiz(View v) {
        // Use a CustomTabsIntent.Builder to configure CustomTabsIntent.
        String url = "http://www.evrim.k12.tr/tr/okulumuzu-taniyin/basarilarimiz/";
        CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
        // set toolbar color and/or setting custom actions before invoking build()
        // Once ready, call CustomTabsIntent.Builder.build() to create a CustomTabsIntent
        CustomTabsIntent customTabsIntent = builder.build();
        builder.setToolbarColor(ResourcesCompat.getColor(getResources(), R.color.okulumuzu_taniyin, null));
        builder.enableUrlBarHiding();
        // and launch the desired Url with CustomTabsIntent.launchUrl()
        customTabsIntent.launchUrl(this, Uri.parse(url));
    }

    public void OpenMezunlarimiz(View v) {
        // Use a CustomTabsIntent.Builder to configure CustomTabsIntent.
        String url = "http://www.evrim.k12.tr/tr/okulumuzu-taniyin/mezunlarimiz/";
        CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
        // set toolbar color and/or setting custom actions before invoking build()
        // Once ready, call CustomTabsIntent.Builder.build() to create a CustomTabsIntent
        CustomTabsIntent customTabsIntent = builder.build();
        builder.setToolbarColor(ResourcesCompat.getColor(getResources(), R.color.okulumuzu_taniyin, null));
        builder.enableUrlBarHiding();
        // and launch the desired Url with CustomTabsIntent.launchUrl()
        customTabsIntent.launchUrl(this, Uri.parse(url));
    }

    public void OpenGorusler(View v) {
        // Use a CustomTabsIntent.Builder to configure CustomTabsIntent.
        String url = "http://www.evrim.k12.tr/tr/okulumuzu-taniyin/gorusler/";
        CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
        // set toolbar color and/or setting custom actions before invoking build()
        // Once ready, call CustomTabsIntent.Builder.build() to create a CustomTabsIntent
        CustomTabsIntent customTabsIntent = builder.build();
        builder.setToolbarColor(ResourcesCompat.getColor(getResources(), R.color.okulumuzu_taniyin, null));
        builder.enableUrlBarHiding();
        // and launch the desired Url with CustomTabsIntent.launchUrl()
        customTabsIntent.launchUrl(this, Uri.parse(url));
    }

    public void OpenSosyal(View v) {
        Intent intent = new Intent(getApplicationContext(), SosyalEvrim.class);
        startActivity(intent);
    }

    public void OpenDuyurular(View v) {
        // Use a CustomTabsIntent.Builder to configure CustomTabsIntent.
        String url = "http://www.evrim.k12.tr/tr/evrim-guncel/blog/";
        CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
        // set toolbar color and/or setting custom actions before invoking build()
        // Once ready, call CustomTabsIntent.Builder.build() to create a CustomTabsIntent
        CustomTabsIntent customTabsIntent = builder.build();
        builder.setToolbarColor(ResourcesCompat.getColor(getResources(), R.color.evrim_guncel, null));
        builder.enableUrlBarHiding();
        // and launch the desired Url with CustomTabsIntent.launchUrl()
        customTabsIntent.launchUrl(this, Uri.parse(url));
    }


    boolean doubleBackToExitPressedOnce = false;

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {


        if (doubleBackToExitPressedOnce) {
            super.onBackPressed();
            return;
        }

        this.doubleBackToExitPressedOnce = true;
        Toast.makeText(this, (R.string.twiceexit), Toast.LENGTH_SHORT).show();

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                doubleBackToExitPressedOnce = false;
            }
        }, 2000);


    }
}


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main2, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {


        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.


        int id = item.getItemId();


        //noinspection SimplifiableIfStatement



        if (id == R.id.open_source_button) {

            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/ozelevrim/EvrimNews"));
            startActivity(browserIntent);


            return true;
        }

        return super.onOptionsItemSelected(item);


    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_kadromuz) {

            // Use a CustomTabsIntent.Builder to configure CustomTabsIntent.
            String url = "http://www.evrim.k12.tr/tr/okulumuzu-taniyin/kadromuz/";
            CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
            // set toolbar color and/or setting custom actions before invoking build()
            // Once ready, call CustomTabsIntent.Builder.build() to create a CustomTabsIntent
            CustomTabsIntent customTabsIntent = builder.build();
            builder.setToolbarColor(ResourcesCompat.getColor(getResources(), R.color.okulumuzu_taniyin, null));
            builder.enableUrlBarHiding();
            // and launch the desired Url with CustomTabsIntent.launchUrl()
            customTabsIntent.launchUrl(this, Uri.parse(url));

        } else if (id == R.id.nav_ortaklarımız) {

            // Use a CustomTabsIntent.Builder to configure CustomTabsIntent.
            String url = "http://www.evrim.k12.tr/tr/okulumuzu-taniyin/ortaklarimiz/";
            CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
            // set toolbar color and/or setting custom actions before invoking build()
            // Once ready, call CustomTabsIntent.Builder.build() to create a CustomTabsIntent
            CustomTabsIntent customTabsIntent = builder.build();
            builder.setToolbarColor(ResourcesCompat.getColor(getResources(), R.color.okulumuzu_taniyin, null));
            builder.enableUrlBarHiding();
            // and launch the desired Url with CustomTabsIntent.launchUrl()
            customTabsIntent.launchUrl(this, Uri.parse(url));

        } else if (id == R.id.nav_başarılarımız) {

            // Use a CustomTabsIntent.Builder to configure CustomTabsIntent.
            String url = "http://www.evrim.k12.tr/tr/okulumuzu-taniyin/basarilarimiz/";
            CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
            // set toolbar color and/or setting custom actions before invoking build()
            // Once ready, call CustomTabsIntent.Builder.build() to create a CustomTabsIntent
            CustomTabsIntent customTabsIntent = builder.build();
            builder.setToolbarColor(ResourcesCompat.getColor(getResources(), R.color.okulumuzu_taniyin, null));
            builder.enableUrlBarHiding();
            // and launch the desired Url with CustomTabsIntent.launchUrl()
            customTabsIntent.launchUrl(this, Uri.parse(url));

        } else if (id == R.id.nav_mezunlarımız) {

            // Use a CustomTabsIntent.Builder to configure CustomTabsIntent.
            String url = "http://www.evrim.k12.tr/tr/okulumuzu-taniyin/mezunlarimiz/";
            CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
            // set toolbar color and/or setting custom actions before invoking build()
            // Once ready, call CustomTabsIntent.Builder.build() to create a CustomTabsIntent
            CustomTabsIntent customTabsIntent = builder.build();
            builder.setToolbarColor(ResourcesCompat.getColor(getResources(), R.color.okulumuzu_taniyin, null));
            builder.enableUrlBarHiding();
            // and launch the desired Url with CustomTabsIntent.launchUrl()
            customTabsIntent.launchUrl(this, Uri.parse(url));


        } else if (id == R.id.nav_iletisim) {

            // Use a CustomTabsIntent.Builder to configure CustomTabsIntent.
            String url = "http://www.evrim.k12.tr/tr/okulumuzu-taniyin/iletisim/";
            CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
            // set toolbar color and/or setting custom actions before invoking build()
            // Once ready, call CustomTabsIntent.Builder.build() to create a CustomTabsIntent
            CustomTabsIntent customTabsIntent = builder.build();
            builder.setToolbarColor(ResourcesCompat.getColor(getResources(), R.color.okulumuzu_taniyin, null));
            builder.enableUrlBarHiding();
            // and launch the desired Url with CustomTabsIntent.launchUrl()
            customTabsIntent.launchUrl(this, Uri.parse(url));


        } else if (id == R.id.nav_blog) {

            // Use a CustomTabsIntent.Builder to configure CustomTabsIntent.
            String url = "http://www.evrim.k12.tr/tr/evrim-guncel/blog/";
            CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
            // set toolbar color and/or setting custom actions before invoking build()
            // Once ready, call CustomTabsIntent.Builder.build() to create a CustomTabsIntent
            CustomTabsIntent customTabsIntent = builder.build();
            builder.setToolbarColor(ResourcesCompat.getColor(getResources(), R.color.evrim_guncel, null));
            builder.enableUrlBarHiding();
            // and launch the desired Url with CustomTabsIntent.launchUrl()
            customTabsIntent.launchUrl(this, Uri.parse(url));

        } else if (id == R.id.nav_sosyal) {

            Intent intent = new Intent(getApplicationContext(), SosyalEvrim.class);
            startActivity(intent);

        } else if (id == R.id.nav_yemek) {


            // Use a CustomTabsIntent.Builder to configure CustomTabsIntent.
            String url = "http://www.evrim.k12.tr/tr/evrim-guncel/aylik-yemek-menuleri/";
            CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
            // set toolbar color and/or setting custom actions before invoking build()
            // Once ready, call CustomTabsIntent.Builder.build() to create a CustomTabsIntent
            CustomTabsIntent customTabsIntent = builder.build();
            builder.setToolbarColor(ResourcesCompat.getColor(getResources(), R.color.evrim_guncel, null));
            builder.enableUrlBarHiding();
            // and launch the desired Url with CustomTabsIntent.launchUrl()
            customTabsIntent.launchUrl(this, Uri.parse(url));
            ;


        } else if (id == R.id.nav_veligorusme) {


            // Use a CustomTabsIntent.Builder to configure CustomTabsIntent.
            String url = "http://www.evrim.k12.tr/tr/evrim-guncel/veli-gorusme-gun-ve-saatleri/";
            CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
            // set toolbar color and/or setting custom actions before invoking build()
            // Once ready, call CustomTabsIntent.Builder.build() to create a CustomTabsIntent
            CustomTabsIntent customTabsIntent = builder.build();
            builder.setToolbarColor(ResourcesCompat.getColor(getResources(), R.color.evrim_guncel, null));
            builder.enableUrlBarHiding();
            // and launch the desired Url with CustomTabsIntent.launchUrl()
            customTabsIntent.launchUrl(this, Uri.parse(url));


        } else if (id == R.id.nav_calismatakvimi) {

            // Use a CustomTabsIntent.Builder to configure CustomTabsIntent.
            String url = "http://www.evrim.k12.tr/tr/evrim-guncel/20142015-egitim-ogretim-yili-calisma-takvimi/";
            CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
            // set toolbar color and/or setting custom actions before invoking build()
            // Once ready, call CustomTabsIntent.Builder.build() to create a CustomTabsIntent
            CustomTabsIntent customTabsIntent = builder.build();
            builder.setToolbarColor(ResourcesCompat.getColor(getResources(), R.color.evrim_guncel, null));
            builder.enableUrlBarHiding();
            // and launch the desired Url with CustomTabsIntent.launchUrl()
            customTabsIntent.launchUrl(this, Uri.parse(url));


        } else if (id == R.id.nav_kurucu_temsilcisi) {

            // Use a CustomTabsIntent.Builder to configure CustomTabsIntent.
            String url = "http://www.evrim.k12.tr/tr/okulumuzu-taniyin/kurucu-temsilcisi/";
            CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
            // set toolbar color and/or setting custom actions before invoking build()
            // Once ready, call CustomTabsIntent.Builder.build() to create a CustomTabsIntent
            CustomTabsIntent customTabsIntent = builder.build();
            builder.setToolbarColor(ResourcesCompat.getColor(getResources(), R.color.okulumuzu_taniyin, null));
            builder.enableUrlBarHiding();
            // and launch the desired Url with CustomTabsIntent.launchUrl()
            customTabsIntent.launchUrl(this, Uri.parse(url));


        } else if (id == R.id.nav_gorusler) {

            // Use a CustomTabsIntent.Builder to configure CustomTabsIntent.
            String url = "http://www.evrim.k12.tr/tr/okulumuzu-taniyin/gorusler/";
            CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
            // set toolbar color and/or setting custom actions before invoking build()
            // Once ready, call CustomTabsIntent.Builder.build() to create a CustomTabsIntent
            CustomTabsIntent customTabsIntent = builder.build();
            builder.setToolbarColor(ResourcesCompat.getColor(getResources(), R.color.okulumuzu_taniyin, null));
            builder.enableUrlBarHiding();
            // and launch the desired Url with CustomTabsIntent.launchUrl()
            customTabsIntent.launchUrl(this, Uri.parse(url));


        } else if (id == R.id.nav_tarihcemiz) {

                // Use a CustomTabsIntent.Builder to configure CustomTabsIntent.
                String url = "http://www.evrim.k12.tr/tr/okulumuzu-taniyin/tarihcemiz/";
                CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
                // set toolbar color and/or setting custom actions before invoking build()
                // Once ready, call CustomTabsIntent.Builder.build() to create a CustomTabsIntent
                CustomTabsIntent customTabsIntent = builder.build();
            builder.setToolbarColor(ResourcesCompat.getColor(getResources(), R.color.okulumuzu_taniyin, null));
            builder.enableUrlBarHiding();
                // and launch the desired Url with CustomTabsIntent.launchUrl()
                customTabsIntent.launchUrl(this, Uri.parse(url));

        } else if (id == R.id.nav_duyurular) {

            // Use a CustomTabsIntent.Builder to configure CustomTabsIntent.
            String url = "http://www.evrim.k12.tr/tr/evrim-guncel/duyurular/";
            CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
            // set toolbar color and/or setting custom actions before invoking build()
            // Once ready, call CustomTabsIntent.Builder.build() to create a CustomTabsIntent
            CustomTabsIntent customTabsIntent = builder.build();
            builder.setToolbarColor(ResourcesCompat.getColor(getResources(), R.color.evrim_guncel, null));
            builder.enableUrlBarHiding();
            // and launch the desired Url with CustomTabsIntent.launchUrl()
            customTabsIntent.launchUrl(this, Uri.parse(url));

        } else if (id == R.id.nav_insan_kaynaklari) {

            // Use a CustomTabsIntent.Builder to configure CustomTabsIntent.
            String url = "http://www.evrim.k12.tr/tr/okulumuzu-taniyin/insan-kaynaklari/";
            CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
            // set toolbar color and/or setting custom actions before invoking build()
            // Once ready, call CustomTabsIntent.Builder.build() to create a CustomTabsIntent
            CustomTabsIntent customTabsIntent = builder.build();
            builder.setToolbarColor(ResourcesCompat.getColor(getResources(), R.color.okulumuzu_taniyin, null));
            builder.enableUrlBarHiding();
            // and launch the desired Url with CustomTabsIntent.launchUrl()
            customTabsIntent.launchUrl(this, Uri.parse(url));

        } else if (id == R.id.nav_okul_kayitlari) {

            // Use a CustomTabsIntent.Builder to configure CustomTabsIntent.
            String url = "http://www.evrim.k12.tr/tr/okulumuzu-taniyin/kayit-bilgileri/";
            CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
            // set toolbar color and/or setting custom actions before invoking build()
            // Once ready, call CustomTabsIntent.Builder.build() to create a CustomTabsIntent
            CustomTabsIntent customTabsIntent = builder.build();
            builder.setToolbarColor(ResourcesCompat.getColor(getResources(), R.color.okulumuzu_taniyin, null));
            builder.enableUrlBarHiding();
            // and launch the desired Url with CustomTabsIntent.launchUrl()
            customTabsIntent.launchUrl(this, Uri.parse(url));

        } else if (id == R.id.nav_search) {

        // Use a CustomTabsIntent.Builder to configure CustomTabsIntent.
            String url = "http://www.evrim.k12.tr/tr/?s=";
            CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
            // set toolbar color and/or setting custom actions before invoking build()
            // Once ready, call CustomTabsIntent.Builder.build() to create a CustomTabsIntent
            CustomTabsIntent customTabsIntent = builder.build();
            // and launch the desired Url with CustomTabsIntent.launchUrl()

            builder.setToolbarColor(ResourcesCompat.getColor(getResources(), R.color.search, null));
            builder.enableUrlBarHiding();
            customTabsIntent.launchUrl(this, Uri.parse(url));
        } else if (id == R.id.nav_egitim_projemiz) {

            // Use a CustomTabsIntent.Builder to configure CustomTabsIntent.
            String url = "http://www.evrim.k12.tr/tr/akademik-egitim/egitim-projemiz/";
            CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
            // set toolbar color and/or setting custom actions before invoking build()
            // Once ready, call CustomTabsIntent.Builder.build() to create a CustomTabsIntent
            CustomTabsIntent customTabsIntent = builder.build();
            // and launch the desired Url with CustomTabsIntent.launchUrl()

            builder.setToolbarColor(ResourcesCompat.getColor(getResources(), R.color.akademik_egitim, null));
            builder.enableUrlBarHiding();
            customTabsIntent.launchUrl(this, Uri.parse(url));
        } else if (id == R.id.nav_yabanci_dil) {

            // Use a CustomTabsIntent.Builder to configure CustomTabsIntent.
            String url = "http://www.evrim.k12.tr/tr/akademik-egitim/yabanci-dil-egitimi/";
            CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
            // set toolbar color and/or setting custom actions before invoking build()
            // Once ready, call CustomTabsIntent.Builder.build() to create a CustomTabsIntent
            CustomTabsIntent customTabsIntent = builder.build();
            // and launch the desired Url with CustomTabsIntent.launchUrl()

            builder.setToolbarColor(ResourcesCompat.getColor(getResources(), R.color.akademik_egitim, null));
            builder.enableUrlBarHiding();
            customTabsIntent.launchUrl(this, Uri.parse(url));
        } else if (id == R.id.nav_ilkokul) {

            // Use a CustomTabsIntent.Builder to configure CustomTabsIntent.
            String url = "http://www.evrim.k12.tr/tr/akademik-egitim/ilkokul/";
            CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
            // set toolbar color and/or setting custom actions before invoking build()
            // Once ready, call CustomTabsIntent.Builder.build() to create a CustomTabsIntent
            CustomTabsIntent customTabsIntent = builder.build();
            // and launch the desired Url with CustomTabsIntent.launchUrl()

            builder.setToolbarColor(ResourcesCompat.getColor(getResources(), R.color.akademik_egitim, null));
            builder.enableUrlBarHiding();
            customTabsIntent.launchUrl(this, Uri.parse(url));
        } else if (id == R.id.nav_ortaokul) {

            // Use a CustomTabsIntent.Builder to configure CustomTabsIntent.
            String url = "http://www.evrim.k12.tr/tr/akademik-egitim/ortaokul/";
            CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
            // set toolbar color and/or setting custom actions before invoking build()
            // Once ready, call CustomTabsIntent.Builder.build() to create a CustomTabsIntent
            CustomTabsIntent customTabsIntent = builder.build();
            // and launch the desired Url with CustomTabsIntent.launchUrl()

            builder.setToolbarColor(ResourcesCompat.getColor(getResources(), R.color.akademik_egitim, null));
            builder.enableUrlBarHiding();
            customTabsIntent.launchUrl(this, Uri.parse(url));
        } else if (id == R.id.nav_ders_katalogu) {

            // Use a CustomTabsIntent.Builder to configure CustomTabsIntent.
            String url = "http://www.evrim.k12.tr/tr/akademik-egitim/ders-katalogu/";
            CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
            // set toolbar color and/or setting custom actions before invoking build()
            // Once ready, call CustomTabsIntent.Builder.build() to create a CustomTabsIntent
            CustomTabsIntent customTabsIntent = builder.build();
            // and launch the desired Url with CustomTabsIntent.launchUrl()

            builder.setToolbarColor(ResourcesCompat.getColor(getResources(), R.color.akademik_egitim, null));
            builder.enableUrlBarHiding();
            customTabsIntent.launchUrl(this, Uri.parse(url));
        } else if (id == R.id.nav_kulupler) {

            // Use a CustomTabsIntent.Builder to configure CustomTabsIntent.
            String url = "http://www.evrim.k12.tr/tr/kampuste-hayat/kulupler/";
            CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
            // set toolbar color and/or setting custom actions before invoking build()
            // Once ready, call CustomTabsIntent.Builder.build() to create a CustomTabsIntent
            CustomTabsIntent customTabsIntent = builder.build();
            // and launch the desired Url with CustomTabsIntent.launchUrl()

            builder.setToolbarColor(ResourcesCompat.getColor(getResources(), R.color.kampuste_hayat, null));
            builder.enableUrlBarHiding();
            customTabsIntent.launchUrl(this, Uri.parse(url));
        } else if (id == R.id.nav_kurslar) {

            // Use a CustomTabsIntent.Builder to configure CustomTabsIntent.
            String url = "http://www.evrim.k12.tr/tr/kampuste-hayat/kurslar/";
            CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
            // set toolbar color and/or setting custom actions before invoking build()
            // Once ready, call CustomTabsIntent.Builder.build() to create a CustomTabsIntent
            CustomTabsIntent customTabsIntent = builder.build();
            // and launch the desired Url with CustomTabsIntent.launchUrl()

            builder.setToolbarColor(ResourcesCompat.getColor(getResources(), R.color.kampuste_hayat, null));
            builder.enableUrlBarHiding();
            customTabsIntent.launchUrl(this, Uri.parse(url));
        } else if (id == R.id.nav_rehberlik_servisi) {

            // Use a CustomTabsIntent.Builder to configure CustomTabsIntent.
            String url = "http://www.evrim.k12.tr/tr/kampuste-hayat/rehberlik-servisi/";
            CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
            // set toolbar color and/or setting custom actions before invoking build()
            // Once ready, call CustomTabsIntent.Builder.build() to create a CustomTabsIntent
            CustomTabsIntent customTabsIntent = builder.build();
            // and launch the desired Url with CustomTabsIntent.launchUrl()

            builder.setToolbarColor(ResourcesCompat.getColor(getResources(), R.color.kampuste_hayat, null));
            builder.enableUrlBarHiding();
            customTabsIntent.launchUrl(this, Uri.parse(url));
        } else if (id == R.id.nav_kutuphane) {

            // Use a CustomTabsIntent.Builder to configure CustomTabsIntent.
            String url = "http://www.evrim.k12.tr/tr/kampuste-hayat/kutuphane/";
            CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
            // set toolbar color and/or setting custom actions before invoking build()
            // Once ready, call CustomTabsIntent.Builder.build() to create a CustomTabsIntent
            CustomTabsIntent customTabsIntent = builder.build();
            // and launch the desired Url with CustomTabsIntent.launchUrl()

            builder.setToolbarColor(ResourcesCompat.getColor(getResources(), R.color.kampuste_hayat, null));
            builder.enableUrlBarHiding();
            customTabsIntent.launchUrl(this, Uri.parse(url));
        } else if (id == R.id.nav_egitim_spor_alanlari) {

            // Use a CustomTabsIntent.Builder to configure CustomTabsIntent.
            String url = "http://www.evrim.k12.tr/tr/kampuste-hayat/egitim-ve-spor-alanlari/";
            CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
            // set toolbar color and/or setting custom actions before invoking build()
            // Once ready, call CustomTabsIntent.Builder.build() to create a CustomTabsIntent
            CustomTabsIntent customTabsIntent = builder.build();
            // and launch the desired Url with CustomTabsIntent.launchUrl()

            builder.setToolbarColor(ResourcesCompat.getColor(getResources(), R.color.kampuste_hayat, null));
            builder.enableUrlBarHiding();
            customTabsIntent.launchUrl(this, Uri.parse(url));
        } else if (id == R.id.nav_kampus_birimleri) {

            // Use a CustomTabsIntent.Builder to configure CustomTabsIntent.
            String url = "http://www.evrim.k12.tr/tr/kampuste-hayat/kampus-birimleri/";
            CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
            // set toolbar color and/or setting custom actions before invoking build()
            // Once ready, call CustomTabsIntent.Builder.build() to create a CustomTabsIntent
            CustomTabsIntent customTabsIntent = builder.build();
            // and launch the desired Url with CustomTabsIntent.launchUrl()

            builder.setToolbarColor(ResourcesCompat.getColor(getResources(), R.color.kampuste_hayat, null));
            builder.enableUrlBarHiding();

            customTabsIntent.launchUrl(this, Uri.parse(url));






            DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
            drawer.closeDrawer(GravityCompat.START);
            return true;




        }
        return false;
    }
}
