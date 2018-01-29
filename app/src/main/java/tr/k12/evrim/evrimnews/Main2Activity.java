package tr.k12.evrim.evrimnews;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.support.customtabs.CustomTabsIntent;
import android.support.design.widget.Snackbar;
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
import android.widget.ListView;
import android.widget.Toast;


public class Main2Activity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private static final int TIME_DELAY = 2000;
    private static long back_pressed;


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
        ab.setSubtitle("Özel Evrim Okulları");



    }

    public void OpenTarihcemiz(View v) {
        // Use a CustomTabsIntent.Builder to configure CustomTabsIntent.
        String url = "http://www.evrim.k12.tr/tr/okulumuzu-taniyin/tarihcemiz/";
        CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
        // set toolbar color and/or setting custom actions before invoking build()
        // Once ready, call CustomTabsIntent.Builder.build() to create a CustomTabsIntent
        CustomTabsIntent customTabsIntent = builder.build();
        // and launch the desired Url with CustomTabsIntent.launchUrl()
        customTabsIntent.launchUrl(this, Uri.parse(url));
    }

    public void OpenAylikYemek(View v) {
        Intent intent = new Intent(getApplicationContext(), AylikYemekMenuleri.class);
        startActivity(intent);
    }

    public void OpenVeliGorusme(View v) {
        Intent intent = new Intent(getApplicationContext(), VeliGorusmeGunleri.class);
        startActivity(intent);
    }

    public void OpenBasarilarimiz(View v) {
        Intent intent = new Intent(getApplicationContext(), basarilarimiz.class);
        startActivity(intent);
    }

    public void OpenMezunlarimiz(View v) {
        Intent intent = new Intent(getApplicationContext(), Mezunlarimiz.class);
        startActivity(intent);
    }

    public void OpenGorusler(View v) {
        Intent intent = new Intent(getApplicationContext(), Gorusler.class);
        startActivity(intent);
    }

    public void OpenSosyal(View v) {
        Intent intent = new Intent(getApplicationContext(), SosyalEvrim.class);
        startActivity(intent);
    }

    public void OpenDuyurular(View v) {
        Intent intent = new Intent(getApplicationContext(), Duyurular.class);
        startActivity(intent);
    }


    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
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

        if (id == R.id.feedback_button) {

            Intent intent = new Intent(getApplicationContext(), FeedbackActivity.class);
            startActivity(intent);


            return true;
        }

        if (id == R.id.dark_mode) {

            switch (item.getItemId()) {
                case R.id.dark_mode:
                    if (item.isChecked()) {
// If item already checked then unchecked it
                        item.setChecked(false);
                    } else {
// If item is unchecked then checked it
                        item.setChecked(true);
                    }
                default:
                    return super.onOptionsItemSelected(item);
            }
        }

        if (id == R.id.about_button) {

            Intent intent = new Intent(getApplicationContext(), AboutActivity.class);
            startActivity(intent);


            return true;
        }

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

        if (id == R.id.nav_signin) {

            Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
            startActivity(intent);

            // Handle the camera action
        } else if (id == R.id.nav_kadromuz) {

            Intent intent = new Intent(getApplicationContext(), Kadromuz.class);
            startActivity(intent);

        } else if (id == R.id.nav_ortaklarımız) {

            Intent intent = new Intent(getApplicationContext(), Ortaklarimiz.class);
            startActivity(intent);

        } else if (id == R.id.nav_başarılarımız) {

            Intent intent = new Intent(getApplicationContext(), basarilarimiz.class);
            startActivity(intent);

        } else if (id == R.id.nav_mezunlarımız) {

            Intent intent = new Intent(getApplicationContext(), Mezunlarimiz.class);
            startActivity(intent);


        } else if (id == R.id.nav_hakkımızda) {

            Intent intent = new Intent(getApplicationContext(), AboutActivity.class);
            startActivity(intent);

        } else if (id == R.id.nav_iletisim) {

            Intent intent = new Intent(getApplicationContext(), iletisim.class);
            startActivity(intent);


        } else if (id == R.id.nav_blog) {

            Intent intent = new Intent(getApplicationContext(), Duyurular.class);
            startActivity(intent);

        } else if (id == R.id.nav_sosyal) {

            Intent intent = new Intent(getApplicationContext(), SosyalEvrim.class);
            startActivity(intent);

        } else if (id == R.id.nav_yemek) {


            Intent intent = new Intent(getApplicationContext(), AylikYemekMenuleri.class);
            startActivity(intent);


        } else if (id == R.id.nav_veligorusme) {


            Intent intent = new Intent(getApplicationContext(), VeliGorusmeGunleri.class);
            startActivity(intent);


        } else if (id == R.id.nav_calismatakvimi) {

            Intent intent = new Intent(getApplicationContext(), CalismaTakvimi.class);
            startActivity(intent);


        } else if (id == R.id.nav_kurucu_temsilcisi) {

            Intent intent = new Intent(getApplicationContext(), Kurucu_temsilcisi.class);
            startActivity(intent);


        } else if (id == R.id.nav_gorusler) {

            Intent intent = new Intent(getApplicationContext(), Gorusler.class);
            startActivity(intent);


        } else if (id == R.id.nav_tarihcemiz) {

            // Use a CustomTabsIntent.Builder to configure CustomTabsIntent.
            String url = "http://www.evrim.k12.tr/tr/okulumuzu-taniyin/tarihcemiz/";
            CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
            // set toolbar color and/or setting custom actions before invoking build()
            // Once ready, call CustomTabsIntent.Builder.build() to create a CustomTabsIntent
            CustomTabsIntent customTabsIntent = builder.build();
            // and launch the desired Url with CustomTabsIntent.launchUrl()
            customTabsIntent.launchUrl(this, Uri.parse(url));


        } else if (id == R.id.nav_messages) {

        }


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;



}
}
