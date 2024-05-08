package com.example.contextmenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn, popupbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.contextmenu);
        popupbtn = findViewById(R.id.popup);

        registerForContextMenu(btn);

        popupbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PopupMenu popupMenu = new PopupMenu(MainActivity.this,view);
                popupMenu.inflate(R.menu.mymenu);
                popupMenu.show();

            }
        });
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {

        menu.add(1,v.getId(),3,"Profile");
        menu.add(1,v.getId(),4,"Settings");
        menu.add(1,v.getId(),4,"Share");
        menu.add(1,v.getId(),1,"Delete");

        super.onCreateContextMenu(menu, v, menuInfo);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {

        Toast.makeText(this, item.getTitle(), Toast.LENGTH_SHORT).show();

        return super.onContextItemSelected(item);
    }
}