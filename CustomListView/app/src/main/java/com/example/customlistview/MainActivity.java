package com.example.customlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    String[] moviename = {"Main Atal Hoon", "Fighter", "Ae Watan Mere Watan", "Hanuman", "Karmma Calling", "Showtime", "The Marvels","The Kerala Stroy", "Mamla Legal Hai"};

    String[] platform = {"Amazon Prime", "Netflix", "Disney Hotstar", "Zee Prime", "Amazon Prime", "Netflix", "Disney Hotstar", "Zee Prime", "Netflix"};

    int[] poster = {R.drawable.mainatalhoon, R.drawable.fighter, R.drawable.aewatanmerewatan, R.drawable.hanuman,
    R.drawable.karmmacalling, R.drawable.showtime, R.drawable.themarvels, R.drawable.thekeralastory, R.drawable.mamlalegalhai};

    ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listview);
        MyCustomAdapter myCustomAdapter = new MyCustomAdapter(this,moviename,platform,poster);
        listView.setAdapter(myCustomAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(MainActivity.this,DetailedActivity.class);
                intent.putExtra("moviename",moviename[i]);
                intent.putExtra("poster",poster[i]);

                startActivity(intent);
            }
        });
    }
}