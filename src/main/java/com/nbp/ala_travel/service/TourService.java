package com.nbp.ala_travel.service;

import com.nbp.ala_travel.repository.TourRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class TourService {
    private final TourRepository repository;

    public String createTour(Long new_starting_point, Long new_tour_guide_id, Long new_city_id,
                             String new_title, String new_desc, Integer new_duration, Integer new_max_participants) {
        try {
            repository.createTour(new_starting_point, new_tour_guide_id, new_city_id, new_title, new_desc,
                    new_duration, new_max_participants);
        } catch (Exception e) {
            return e.getMessage();
        }
        return "OK";
    }
}
