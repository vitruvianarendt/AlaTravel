package com.nbp.ala_travel.service;

import com.nbp.ala_travel.model.DetailsAboutTour;
import com.nbp.ala_travel.repository.DetailsAboutTourRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class DetailsAboutTourService {
    private final DetailsAboutTourRepository repository;

    public List<DetailsAboutTour> viewDetailsAboutTour(String city_name_arg, String tour_name_arg) {
        return repository.viewDetailsAboutTour(city_name_arg, tour_name_arg);
    }
}
