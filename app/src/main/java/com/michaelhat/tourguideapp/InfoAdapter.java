package com.michaelhat.tourguideapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
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

        //Whether image exists or not
        ImageView imageView = listItemView.findViewById(R.id.imageView);
        if (currentNugget.getPhotoId() != 0) { //If imageid is not 0, then set image
            //Setting the Image
            imageView.setImageDrawable(ContextCompat.getDrawable(getContext(), currentNugget.getPhotoId()));
        } else { //else hide the ImageView
            imageView.setVisibility(View.GONE);
        }
        //Setting the Description
        TextView descriptionTextView = listItemView.findViewById(R.id.description);
        descriptionTextView.setText(currentNugget.getDescription());
        //Whether TrailText exists or not
        TextView trailTextView = listItemView.findViewById(R.id.trail_text);
        if (currentNugget.getTrailText() != 0) { //If trailtext id is not 0, then set trailtext
            //Set trailtext
            trailTextView.setText(currentNugget.getTrailText());
        } else { //else hide trailtext view
            trailTextView.setVisibility(View.GONE);
        }

        return listItemView;
    }
}
