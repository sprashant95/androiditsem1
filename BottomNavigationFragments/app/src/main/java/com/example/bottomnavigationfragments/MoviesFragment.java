package com.example.bottomnavigationfragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;


public class MoviesFragment extends Fragment {

    public MoviesFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        String[] cname = {"BMW","FERRARI","MINI COOPER","BENTLEY","FIAT",
                "BMW","FERRARI","MINI COOPER","BENTLEY","FIAT",
                "BMW","FERRARI","MINI COOPER","BENTLEY","FIAT"};

        int[] cimage = {R.drawable.bmw,R.drawable.ferrari,R.drawable.mini,R.drawable.bentley,R.drawable.fiat,
                R.drawable.bmw,R.drawable.ferrari,R.drawable.mini,R.drawable.bentley,R.drawable.fiat,
                R.drawable.bmw,R.drawable.ferrari,R.drawable.mini,R.drawable.bentley,R.drawable.fiat};

        View view = inflater.inflate(R.layout.fragment_movies, container, false);

        ListView listView = view.findViewById(R.id.list);

        MyMoviesAdapter myMoviesAdapter = new MyMoviesAdapter(getActivity(),cname,cimage);
        listView.setAdapter(myMoviesAdapter);

        // Inflate the layout for this fragment
        return view;
    }

}