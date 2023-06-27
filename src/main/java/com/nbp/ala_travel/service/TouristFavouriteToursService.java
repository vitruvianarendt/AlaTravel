package com.nbp.ala_travel.service;

import com.nbp.ala_travel.model.TouristFavouriteTours;
import com.nbp.ala_travel.repository.TouristFavouriteToursRepository;
import com.nbp.ala_travel.repository.TouristRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class TouristFavouriteToursService {
    private final TouristFavouriteToursRepository repository;
    private final TouristRepository touristRepository;

    public List<TouristFavouriteTours> filter_favourite_tours(Long personId, String city_name) {
        return repository.filter_favourite_tours(touristRepository.findByPersonid(personId).getId(),city_name);
    }

}
