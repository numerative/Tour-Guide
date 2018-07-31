package com.michaelhat.tourguideapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class PlacesInterest extends Fragment {

    ArrayList<InfoNugget> placesList;

    public PlacesInterest() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_places_interest, container, false);
        generatePlacesList();

        InfoAdapter adapter = new InfoAdapter(getContext(), placesList);
        ListView placesListView = view.findViewById(R.id.places_list_view);
        placesListView.setAdapter(adapter);

        return view;
    }

    private void generatePlacesList() {
        placesList = new ArrayList<>();
        placesList.add(new InfoNugget(R.string.place_1, R.drawable.kaba_gandhi_no_delo,
                R.string.places_description_1, R.string.places_trail_text_1));
        placesList.add(new InfoNugget(R.string.place_2, R.drawable.watson_museum,
                R.string.places_description_2, R.string.places_trail_text_2));
        placesList.add(new InfoNugget(R.string.place_3, R.drawable.fun_world,
                R.string.places_description_3, R.string.places_trail_text_3));
        placesList.add(new InfoNugget(R.string.place_4, R.drawable.rotary_dolls_museum,
                R.string.places_description_4, R.string.places_trail_text_4));
        placesList.add(new InfoNugget(R.string.place_5, R.drawable.aji_dam,
                R.string.places_description_5, R.string.places_trail_text_5));
    }
}
