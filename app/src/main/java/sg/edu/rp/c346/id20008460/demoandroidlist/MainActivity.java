package sg.edu.rp.c346.id20008460.demoandroidlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

   // ArrayAdapter<AndroidVersion> aa;
    CustomAdapter adapter;
    ArrayList<AndroidVersion> alItems;

    ListView lvItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvItems = findViewById(R.id.lvItems);
        alItems = new ArrayList<>();

        AndroidVersion item1 = new AndroidVersion("Pie", "9.0");
        AndroidVersion item2 = new AndroidVersion("Oreo", "8.0 - 8.1");
        alItems.add(item1);
        alItems.add(item2);
        alItems.add(new AndroidVersion("Nougat", "7.0 - 7.1.2"));

//        aa = new ArrayAdapter(this, android.R.layout.simple_list_item_1, alItems);
//        lvItems.setAdapter(aa);

        adapter = new CustomAdapter(MainActivity.this, R.layout.row , alItems);
        lvItems.setAdapter(adapter);
    }
}