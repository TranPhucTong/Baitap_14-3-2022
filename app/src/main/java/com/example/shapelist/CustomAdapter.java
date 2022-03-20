package com.example.shapelist;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.CharArrayWriter;
import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter<Contact>  {
    private Activity activity;
    private int idLayout;
    private ArrayList<Contact> list;

    public CustomAdapter(Activity activity, int idLayout,
                         ArrayList<Contact> list){
        super(activity, idLayout, list);
        this.activity =activity;
        this.idLayout = idLayout;
        this.list = list;
    }




    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = activity.getLayoutInflater();
        convertView = inflater.inflate(idLayout, null);

        ImageView image = (ImageView) convertView.findViewById(R.id.image_12);
        TextView text1 = (TextView) convertView.findViewById(R.id.tv_name);
        TextView text2 = (TextView) convertView.findViewById(R.id.tv_ghiChu);
        TextView text3 = (TextView) convertView.findViewById(R.id.gia);
        ImageButton ibu = (ImageButton) convertView.findViewById(R.id.plus);

        text1.setText(list.get(position).getName());
        text3.setText(list.get(position).getGia());
        image.setImageResource(list.get(position).getHinh());

        return convertView;



    }
}
