package com.example.customlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;

public class DetailedActivity extends AppCompatActivity {

    CircleImageView odposter;
    TextView odname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailed);

        odposter = findViewById(R.id.dposter);
        odname = findViewById(R.id.dname);

        Intent intent = getIntent();
        String dname = intent.getStringExtra("moviename");
        int dimage = intent.getIntExtra("poster",R.drawable.showtime);

        odposter.setImageResource(dimage);
        odname.setText(dname);

    }
}