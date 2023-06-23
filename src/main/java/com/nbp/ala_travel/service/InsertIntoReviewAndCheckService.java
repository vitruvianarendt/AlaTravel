package com.nbp.ala_travel.service;

import com.nbp.ala_travel.repository.InsertIntoReviewAndCheckRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class InsertIntoReviewAndCheckService {
    private final InsertIntoReviewAndCheckRepository repository;

    public String insertIntoReviewAndCheck(Long new_tourist_id, Integer new_grade, String new_description,
                                         Long new_tour_id, Long new_tour_guide_id) {

        try {
            repository.insertIntoReviewAndCheck(new_tourist_id, new_grade, new_description, new_tour_id, new_tour_guide_id);
        } catch (Exception e) {
            return e.getMessage();
        }
        return "OK";
    }
}
