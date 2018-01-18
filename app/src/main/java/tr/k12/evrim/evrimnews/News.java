package tr.k12.evrim.evrimnews;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.ValueEventListener;

/**
 * Created by ardacebi on 16/03/17.
 */

public class News {

    public String newsTitle;
    public String newsContent;

    public News() {
        // Default constructor required for calls to DataSnapshot.getValue(User.class)

    }

    public News(String title) {
        // Default constructor required for calls to DataSnapshot.getValue(User.class)
        this.newsTitle = title;
    }

    public News(String title, String content) {
        this.newsTitle = title;
        this.newsContent = content;
    }

    public void writeNewNews(String newsId, String title, String content, DatabaseReference mDatabase) {
        News news = new News(title, content);

        mDatabase.child("News").push().setValue(news);
    }

    public void getAllNews(DatabaseReference mRef, String childName){

        mRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                News news = dataSnapshot.getValue(News.class);
                System.out.println(news);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
    }

}
