package tr.k12.evrim.evrimnews;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class NewPost extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_post);
    }


    public void Share(View v) {
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef;

        EditText newsTitle = (EditText) findViewById(R.id.newsTitle);
        EditText newsContent = (EditText) findViewById(R.id.content);

        News news = new News();
        news.newsContent = newsContent.getText().toString();
        news.newsTitle = newsTitle.getText().toString();

        news.writeNewNews(database.getReference().push().getKey(), news.newsTitle,news.newsContent,database.getReference());


                Intent intent = new Intent(getApplicationContext(), AdminActivity.class);
            startActivity(intent);


    }




}







