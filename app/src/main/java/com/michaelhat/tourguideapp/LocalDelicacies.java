package com.michaelhat.tourguideapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class LocalDelicacies extends Fragment {

    ArrayList<InfoNugget> infoNuggetsList;
    public LocalDelicacies() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View lDView = inflater.inflate(R.layout.fragment_local_delicacies, container, false);

        generateLocalDelicaciesList();
        InfoAdapter infoAdapter = new InfoAdapter(getContext(), infoNuggetsList);

        ListView listView = lDView.findViewById(R.id.delicacies_list_view);
        listView.setAdapter(infoAdapter);

        return lDView;
    }

    private void generateLocalDelicaciesList() {
        infoNuggetsList = new ArrayList<>();
        infoNuggetsList.add(new InfoNugget(R.string.delicacy_1, R.string.description_1));
        infoNuggetsList.add(new InfoNugget(R.string.delicacy_2, R.string.description_2));
        infoNuggetsList.add(new InfoNugget(R.string.delicacy_3, R.string.description_3));
        infoNuggetsList.add(new InfoNugget(R.string.delicacy_4, R.string.description_4));

    }
}
