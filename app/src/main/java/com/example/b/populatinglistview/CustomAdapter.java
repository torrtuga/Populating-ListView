package com.example.b.populatinglistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

/**
 * Created by B on 8/12/2016.
 */
public class CustomAdapter extends ArrayAdapter<String> {

    public CustomAdapter(Context context, String[] names) {
        super(context, R.layout.row_custom_layout,names);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater myInflator = LayoutInflater.from(getContext());
        View myView = myInflator.inflate(R.layout.row_custom_layout,parent,false);

        String names = getItem(position);
        TextView myTextView = (TextView) myView.findViewById(R.id.textViewCustom);

        myTextView.setText(names);

        return myView;
    }
}
