package com.michaelhat.tourguideapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class EmergencyContact extends Fragment {

    ArrayList<InfoNugget> emergencyList;

    public EmergencyContact() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_emergency_contact, container, false);
        generateEmergencyList();

        InfoAdapter adapter = new InfoAdapter(getContext(), emergencyList);
        ListView emergencyListView = view.findViewById(R.id.emergency_list_view);
        emergencyListView.setAdapter(adapter);

        return view;
    }

    private void generateEmergencyList() {
        emergencyList = new ArrayList<>();
        emergencyList.add(new InfoNugget(R.string.police, R.string.police_description));
        emergencyList.add(new InfoNugget(R.string.womens_safety, R.string.womens_safety_description));
        emergencyList.add(new InfoNugget(R.string.ambulance, R.string.ambulance_description));
    }

}
