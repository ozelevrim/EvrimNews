package tr.k12.evrim.evrimnews;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
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


public class Main2Activity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {




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
        if (id == R.id.dark_mode) {




            return true;
        }

        if (id == R.id.feedback_button) {

            Intent intent = new Intent(getApplicationContext(), FeedbackActivity.class);
            startActivity(intent);


            return true;
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


        }



        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
