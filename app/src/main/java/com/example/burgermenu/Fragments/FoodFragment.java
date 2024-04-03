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

public class FoodFragment extends Fragment {

    Adapter adapter;

    public FoodFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_food, container, false);
        RecyclerView recyclerView = view.findViewById(R.id.recycleView);

        List<item> items = new ArrayList<item>();

        items.add(new item("Shoyu Ramen"," A soy sauce-based broth with chicken slices, boiled egg, green onions, and nori", "https://i.pinimg.com/564x/cc/77/0c/cc770c98ea66c9fe35bb5fd359881181.jpg"));
        items.add(new item("Miso Ramen","A broth made with miso paste, topped with pork slices, garlic, corn kernels, and shiitake mushrooms.", "https://i.pinimg.com/236x/5a/b7/31/5ab731cacd4603920a5d06eb0c882ad8.jpg"));
        items.add(new item("Tonkotsu Ramen","A creamy pork bone broth served with chashu, boiled egg, nori, and chopped green onions.", "https://i.pinimg.com/236x/bc/ae/df/bcaedff0be07748d49e1f8199a1108ae.jpg"));
        items.add(new item("Shio Ramen","A clear, salty broth with ingredients like chikuwa, napa cabbage, grilled crab, and grilled squid.", "https://i.pinimg.com/236x/ef/0a/2e/ef0a2e6bbf108d0b2f851462d90975d3.jpg"));
        items.add(new item("Tantanmen Ramen","A spicy broth with minced beef, chopped onions, celery, and minced garlic.", "https://i.pinimg.com/236x/67/59/04/6759040801503e49cf9e8cff1fb72f3b.jpg"));
        items.add(new item("Shrimp Ramen","A seafood-based broth with shrimp, bok choy, chopped onions, and a boiled egg.", "https://i.pinimg.com/236x/4c/42/51/4c4251994447d5fa87e4ea979d753a2b.jpg"));
        items.add(new item("Curry Ramen","A curry-flavored broth with chicken slices, boiled potatoes, carrots, and chopped onions.", "https://i.pinimg.com/736x/4e/6b/4f/4e6b4fbbefde156bed89e8b7f93bc7b4.jpg"));
        items.add(new item("Beef Ramen","A clear broth with boiled beef slices, broccoli, carrots, and a boiled egg .", "https://i.pinimg.com/564x/84/c7/c7/84c7c721e25ca509aaefdb36daa6b051.jpg"));

        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(new Adapter(getActivity().getApplicationContext(), items));

        adapter = new Adapter(getActivity(),items);
        recyclerView.setAdapter(adapter);
        return view;
    }
}