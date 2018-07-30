package com.michaelhat.tourguideapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class InfoAdapter extends ArrayAdapter<InfoNugget> {

    public InfoAdapter(@NonNull Context context, @NonNull ArrayList<InfoNugget> nuggets) {
        super(context, 0, nuggets);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item_layout, parent, false);
        }
        //Get the {@Link InfoNugget} object at this position in the list
        InfoNugget currentNugget = getItem(position);

        //Setting the Title
        TextView titleTextView = listItemView.findViewById(R.id.title);
        titleTextView.setText(currentNugget.getTitle());
        //Setting the Description
        TextView descriptionTextView = listItemView.findViewById(R.id.description);
        descriptionTextView.setText(currentNugget.getDescription());
        //Hiding the TrailText
        TextView trailTextView = listItemView.findViewById(R.id.trail_text);
        trailTextView.setVisibility(View.GONE);

        return listItemView;
    }
}
