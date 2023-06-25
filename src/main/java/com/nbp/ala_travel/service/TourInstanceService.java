package com.nbp.ala_travel.service;

import com.nbp.ala_travel.repository.TourInstanceRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalTime;

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

    public String createTourInstance(Long new_tour_id, Long new_tour_guide_id, Long new_language_id,
                                     LocalTime new_time, LocalDate new_date) {
        try {
            repository.createTourInstance(new_tour_id, new_tour_guide_id, new_language_id, new_time, new_date);
        } catch (Exception e) {
            return e.getMessage();
        }
        return "OK";
    }
}
