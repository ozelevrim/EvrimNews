package tr.k12.evrim.evrimnews;

import android.app.Activity;
import android.os.Bundle;

public class ActivityParent extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parent);
    }
}
