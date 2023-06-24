package com.nbp.ala_travel.service;

import com.nbp.ala_travel.model.TouristSavedTourInstances;
import com.nbp.ala_travel.repository.TouristSavedTourInstancesRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
@AllArgsConstructor
public class TouristSavedTourInstancesService {
    private final TouristSavedTourInstancesRepository repository;

    public List<TouristSavedTourInstances> touristSavedTourInstances(Long touristid1, String city_name1, LocalDate tour_date1) {
        return repository.touristSavedTourInstances(touristid1, city_name1, tour_date1);
    }

}
