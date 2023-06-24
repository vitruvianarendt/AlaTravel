package com.nbp.ala_travel.service;

import com.nbp.ala_travel.repository.TourInstanceRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class TourInstanceService {
    private final TourInstanceRepository repository;

    public String saveTourInstance(Long tourist_id, Long tour_instance_id) {
        try {
            repository.saveTourInstance(tourist_id, tour_instance_id);
        } catch (Exception e) {
            return e.getMessage();
        }
        return "OK";
    }
}
