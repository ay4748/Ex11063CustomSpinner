package com.example.ex11063_customspinner;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ex11063_customspinner.Country;

public class CustomAdapter extends BaseAdapter {
    private Context text;
    private Country[] countries ;
    private LayoutInflater inf;

    public CustomAdapter(Context text, Country[] countries)
    {
        this.text = text;
        this.countries= countries;
        inf = (LayoutInflater.from(text));
    }

    @Override
    public int getCount() {

        return countries.length;
    }

    @Override
    public Object getItem(int position)
    {

        return countries[position];
    }

    @Override
    public long getItemId(int position) {

        return position;
    }

    @Override
    public View getView(int i, View view, ViewGroup parent)
    {
        view = inf.inflate(R.layout.custom_spinner, parent, false);
        ImageView flag = view.findViewById(R.id.iV);
        TextView Name = view.findViewById(R.id.name);
        TextView capital = view.findViewById(R.id.Capital);

        flag.setImageResource(countries[i].getFlag());
        Name.setText(countries[i].getCountryname());
        capital.setText(countries[i].getCapital());

        return view;
    }
}
