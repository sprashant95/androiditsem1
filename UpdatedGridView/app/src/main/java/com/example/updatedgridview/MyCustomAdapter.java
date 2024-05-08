package com.example.updatedgridview;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import de.hdodenhof.circleimageview.CircleImageView;

public class MyCustomAdapter extends ArrayAdapter<String> {


    String[] name;
    int[] poster;
    Activity context;

    public MyCustomAdapter(Activity context1, String[] name, int[] poster) {
        super(context1, R.layout.mygriditem);
        this.name = name;
        this.poster = poster;
        this.context = context1;
    }

    @Override
    public int getCount() {
        return poster.length;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.mygriditem,null,true);

        CircleImageView image = rowView.findViewById(R.id.poster);
        TextView moviename = rowView.findViewById(R.id.name);

        image.setImageResource(poster[position]);
        moviename.setText(name[position]);

        return rowView;
    }
}
