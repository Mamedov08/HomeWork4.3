package com.example.homework43;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.namespace.R;
import com.example.namespace.databinding.FragmentContinentsBinding;

import java.util.ArrayList;


public class ContinentsFragment extends Fragment implements Lister {

    private FragmentContinentsBinding binding;
    private ContinentAdapter adapter;
    private ArrayList<Continent> continentList = new ArrayList<>();
    public final static String KEY_FOR_BUNDLE = "Continent";


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentContinentsBinding.inflate(inflater, container, false);


        adapter = new ContinentAdapter(continentList, this);
        loadData();
        binding.recycleView.setAdapter(adapter);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

    }

    private void loadData() {
        continentList.clear();
        continentList.add(new Continent("Australia", R.drawable.australia));
        continentList.add(new Continent("Eurasia", R.drawable.eurasia));
        continentList.add(new Continent("North America", R.drawable.northamerica));
        continentList.add(new Continent("South America", R.drawable.south));
        continentList.add(new Continent("Africa", R.drawable.africa));


    }

    @Override
    public void onItemClick(Continent continent) {

        Bundle bundle = new Bundle();
        bundle.putSerializable(KEY_FOR_BUNDLE, continent.getName());
        Fragment fragment = new DetailFragment();
        fragment.setArguments(bundle);
        requireActivity().getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, fragment).addToBackStack(null).commit();

    }


}