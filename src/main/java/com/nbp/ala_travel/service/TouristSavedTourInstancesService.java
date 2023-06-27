package com.nbp.ala_travel.service;

import com.nbp.ala_travel.model.TouristSavedTourInstances;
import com.nbp.ala_travel.repository.TouristRepository;
import com.nbp.ala_travel.repository.TouristSavedTourInstancesRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
@AllArgsConstructor
public class TouristSavedTourInstancesService {
    private final TouristSavedTourInstancesRepository repository;
    private final TouristRepository touristRepository;
    public List<TouristSavedTourInstances> touristSavedTourInstances(Long personId, String city_name1, LocalDate tour_date1) {
        return repository.touristSavedTourInstances(touristRepository.findByPersonid(personId).getId(), city_name1, tour_date1);
    }

}
