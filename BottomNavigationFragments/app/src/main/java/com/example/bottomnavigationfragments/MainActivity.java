package com.example.bottomnavigationfragments;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener{

    FrameLayout frameLayout;
    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        frameLayout = findViewById(R.id.myframelayout);
        bottomNavigationView = findViewById(R.id.mybottomnavigation);

        bottomNavigationView.setOnNavigationItemSelectedListener(this);

        loadFragment(new BollywoodFragment());

    }

    private void loadFragment(Fragment fragment) {

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.myframelayout,fragment);
        fragmentTransaction.commit();
    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()){
            case R.id.bollywood:
                loadFragment(new BollywoodFragment());
                break;
            case R.id.hollywood:
                loadFragment(new HollywoodFragment());
                break;
            case R.id.tollywood:
                loadFragment(new TollywoodFragment());
                break;
        }
        return true;
    }
}