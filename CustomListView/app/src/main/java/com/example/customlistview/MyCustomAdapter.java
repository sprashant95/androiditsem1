package com.example.customlistview;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import de.hdodenhof.circleimageview.CircleImageView;

public class MyCustomAdapter extends ArrayAdapter<String> {

    String[] name,platform;
    int[] poster;
    Activity context;

    public MyCustomAdapter(Activity context1, String[] name, String[] platform, int[] poster) {
        super(context1, R.layout.mycustomitem);
        this.name = name;
        this.platform = platform;
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
        View rowView = inflater.inflate(R.layout.mycustomitem,null,true);

        CircleImageView image = rowView.findViewById(R.id.poster);
        TextView moviename = rowView.findViewById(R.id.name);
        TextView movieplatform = rowView.findViewById(R.id.platform);

        image.setImageResource(poster[position]);
        moviename.setText(name[position]);
        movieplatform.setText(platform[position]);

        return rowView;
    }
}
