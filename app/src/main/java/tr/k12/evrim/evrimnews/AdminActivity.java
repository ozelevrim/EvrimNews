package tr.k12.evrim.evrimnews;

import android.content.Intent;
import android.os.Bundle;
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







}
