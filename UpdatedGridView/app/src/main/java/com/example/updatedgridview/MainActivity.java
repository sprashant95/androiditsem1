package com.example.updatedgridview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {

    String[] moviename = {"Main Atal Hoon", "Fighter", "Ae Watan Mere Watan", "Hanuman", "Karmma Calling", "Showtime", "The Marvels","The Kerala Stroy", "Mamla Legal Hai"};

   // String[] platform = {"Amazon Prime", "Netflix", "Disney Hotstar", "Zee Prime", "Amazon Prime", "Netflix", "Disney Hotstar", "Zee Prime", "Netflix"};

    int[] poster = {R.drawable.mainatalhoon, R.drawable.fighter, R.drawable.aewatanmerewatan, R.drawable.hanuman,
            R.drawable.karmmacalling, R.drawable.showtime, R.drawable.themarvels, R.drawable.thekeralastory, R.drawable.mamlalegalhai};


    GridView gridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = findViewById(R.id.gridview);

        MyCustomAdapter myCustomAdapter = new MyCustomAdapter(this,moviename,poster);
        gridView.setAdapter(myCustomAdapter);


    }
}