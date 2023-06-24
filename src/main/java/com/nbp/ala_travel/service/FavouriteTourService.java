package com.nbp.ala_travel.service;

import com.nbp.ala_travel.repository.FavouriteTourRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class FavouriteTourService {
    private final FavouriteTourRepository repository;

    public String savedFavouriteTour(Long tourist_id, Long tour_id) {
        try {
            repository.savedFavouriteTour(tourist_id, tour_id);
        } catch (Exception e) {
            return e.getMessage();
        }
        return "OK";
    }
}
