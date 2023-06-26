package com.nbp.ala_travel.service;

import com.nbp.ala_travel.model.TourGuidesPerCity;
import com.nbp.ala_travel.repository.TourGuidesPerCityRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class TourGuidesPerCityService {
    private final TourGuidesPerCityRepository repository;

    public List<TourGuidesPerCity> tourGuidesPerCity(String city_name_arg) {
        return repository.tourGuidesPerCity(city_name_arg);
    }
}
