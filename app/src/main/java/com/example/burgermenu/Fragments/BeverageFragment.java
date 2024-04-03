package com.example.burgermenu.Fragments;
// HomeFragment.java
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.burgermenu.Adapter;
import com.example.burgermenu.R;
import com.example.burgermenu.item;

import java.util.ArrayList;
import java.util.List;

public class BeverageFragment extends Fragment {

    Adapter adapter;

    public BeverageFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_food, container, false);
        RecyclerView recyclerView = view.findViewById(R.id.recycleView);

        List<item> items = new ArrayList<item>();

        items.add(new item("Avocado Milk","made of an Avocado with milk and ice","https://ih1.redbubble.net/image.1485054529.4962/st,small,507x507-pad,600x600,f8f8f8.u1.jpg"));
        items.add(new item("Chocolatte Milk","made of a Chocolatte with milk and ice","https://ih1.redbubble.net/image.1485048592.4850/st,small,507x507-pad,600x600,f8f8f8.u1.jpg"));
        items.add(new item("Banana Milik","made of Banana with milk and ice","https://ih1.redbubble.net/image.1485042556.4733/st,small,507x507-pad,600x600,f8f8f8.u1.jpg"));
        items.add(new item("Peach Milk","made of an Peach with milk and ice","https://ih1.redbubble.net/image.1485068199.5248/st,small,507x507-pad,600x600,f8f8f8.u1.jpg"));
        items.add(new item("Blueberry Milk","made of an Blueberry with milk and ice","https://ih1.redbubble.net/image.1485060898.5093/st,small,507x507-pad,600x600,f8f8f8.u1.jpg"));
        items.add(new item("Strawberry Milk","made of an Strawberry with milk and ice","https://ih1.redbubble.net/image.1485034279.4575/st,small,507x507-pad,600x600,f8f8f8.u1.jpg"));

        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(new Adapter(getActivity().getApplicationContext(), items));

        adapter = new Adapter(getActivity(),items);
        recyclerView.setAdapter(adapter);
        return view;
    }
}