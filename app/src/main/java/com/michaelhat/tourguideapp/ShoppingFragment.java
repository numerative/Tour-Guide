package com.michaelhat.tourguideapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class ShoppingFragment extends Fragment {
    ArrayList<InfoNugget> shoppingList;

    public ShoppingFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_shopping, container, false);
        generateEmergencyList();

        InfoAdapter adapter = new InfoAdapter(getContext(), shoppingList);
        ListView shoppingListView = view.findViewById(R.id.shopping_list_view);
        shoppingListView.setAdapter(adapter);

        return view;
    }

    private void generateEmergencyList() {
        shoppingList = new ArrayList<>();
        shoppingList.add(new InfoNugget(R.string.shopping_1, R.string.shopping_description_1));
        shoppingList.add(new InfoNugget(R.string.shopping_2, R.string.shopping_description_2));
        shoppingList.add(new InfoNugget(R.string.shopping_3, R.string.shopping_description_3));
    }
}
