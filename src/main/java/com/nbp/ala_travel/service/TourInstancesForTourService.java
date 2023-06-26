package com.nbp.ala_travel.service;

import com.nbp.ala_travel.model.TourInstancesForTour;
import com.nbp.ala_travel.repository.TourInstancesForTourRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class TourInstancesForTourService {
    private final TourInstancesForTourRepository repository;

    public List<TourInstancesForTour> getTourInstancesForTour(Long selected_tour_id) {
        return repository.getTourInstancesForTour(selected_tour_id);
    }
}
