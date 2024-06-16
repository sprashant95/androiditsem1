package com.example.bottomnavigationfragments;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class MyMoviesAdapter extends ArrayAdapter<String> {

    String[] cname;
    int[] cimage;
    Activity context;

    public MyMoviesAdapter(Activity context1, String[] cname, int[] cimage) {
        super(context1, R.layout.mycustomitem);
        this.cname = cname;
        this.cimage = cimage;
        this.context = context1;
    }

    @Override
    public int getCount() {
        return cname.length;
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater inflater = context.getLayoutInflater();
        View view = inflater.inflate(R.layout.mycustomitem,null,true);

        ImageView imageView = view.findViewById(R.id.cimage);
        TextView textView = view.findViewById(R.id.cname);

        imageView.setImageResource(cimage[position]);
        textView.setText(cname[position]);
        return view;
    }
}
