package com.example.homework43;
import static com.example.homework43.ContinentsFragment.KEY_FOR_BUNDLE;


import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import com.example.namespace.R;
import com.example.namespace.databinding.FragmentDetailBinding;

import java.util.ArrayList;


public class DetailFragment extends Fragment implements Lister {

    private FragmentDetailBinding binding;
    private CountryAdapter countryAdapter ;
    private  ArrayList<Country> countryList = new ArrayList<>();





    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding=FragmentDetailBinding.inflate(inflater,container,false);
        return binding.getRoot();

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        String continent = getArguments().getString(KEY_FOR_BUNDLE);
        binding.title.setText(continent);
        loadData(continent);
    }
    public void init(){}

    public void loadData(String continent){

        if ("Australia".equals(continent)) {
            countryList.add(new Country("Australia", "Канберра", R.drawable.australia));
            countryList.add(new Country("Tonga", "Nukualofa", R.drawable.tonga));
            countryList.add(new Country("Vanuatu"," Port Vila",R.drawable.vanuatu));
            countryList.add(new Country(" Fiji","Suva",R.drawable.fiji));
            countryList.add(new Country("Belau"," Ngerulmud",R.drawable.palau));
            countryList.add(new Country(" Niue","Alofi",R.drawable.niue));
        }
        else if ("Eurasia".equals(continent)){
            countryList.add(new Country("China","Pekin",R.drawable.china));
            countryList.add(new Country("Japan","Tokio",R.drawable.japan));
            countryList.add(new Country("Turkey","Ankara",R.drawable.turcey));
            countryList.add(new Country("Germany","Berlin",R.drawable.germany));
            countryList.add(new Country("Iran","Tehran",R.drawable.iran));
        }
        else if ("North America".equals(continent)){
            countryList.add(new Country("Canada","Ottawa",R.drawable.canada));
            countryList.add(new Country("Cuba","Habana",R.drawable.cuba));
            countryList.add(new Country("Jamaica","Kinston",R.drawable.jamaica));
            countryList.add(new Country(" Guatemala","Guatemala",R.drawable.guatemala));
            countryList.add(new Country("Barbados","Bridgetown",R.drawable.barbados));
        }
        else if ("South America".equals(continent)){
            countryList.add(new Country("Brasil","Brasilia",R.drawable.braziliya));
            countryList.add(new Country("Argentina","Buenos Aires",R.drawable.argentina));
            countryList.add(new Country("Venezuela","Caracas",R.drawable.venezuela));
            countryList.add(new Country("Colombia", "Bogota",R.drawable.columbia));
            countryList.add(new Country("","Montevideo", R.drawable.uruguay));
        }
        else if ("Africa".equals(continent)){
            countryList.add(new Country("Congo","Brazzaville",R.drawable.congo));
            countryList.add(new Country("Kingdom of Lesotho","Maseru",R.drawable.lesotho));
            countryList.add(new Country("Sudan","الخرطوم",R.drawable.sudan));
            countryList.add(new Country("Mauritania","Nouakchott",R.drawable.mouritania));
            countryList.add(new Country("Tunisia","Tunisia",R.drawable.tunisia));

        }

        if (!countryList.isEmpty()){
            countryAdapter = new CountryAdapter(countryList);
            binding.recyclerForCountry.setAdapter(countryAdapter);
        }
    }
    @Override
    public void onItemClick(Continent continent) {}
}
