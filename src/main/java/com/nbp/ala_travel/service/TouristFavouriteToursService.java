package com.nbp.ala_travel.service;

import com.nbp.ala_travel.model.TouristFavouriteTours;
import com.nbp.ala_travel.repository.TouristFavouriteToursRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class TouristFavouriteToursService {
    private final TouristFavouriteToursRepository repository;

    public List<TouristFavouriteTours> filter_favourite_tours(Long touristid, String city_name) {
        return repository.filter_favourite_tours(touristid,city_name);
    }

}
