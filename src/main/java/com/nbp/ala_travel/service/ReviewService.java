package com.nbp.ala_travel.service;

import com.nbp.ala_travel.model.LoginPersonResponse;
import com.nbp.ala_travel.model.Review;
import com.nbp.ala_travel.repository.ReviewRepository;
import com.nbp.ala_travel.repository.TouristRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ReviewService {
    private final ReviewRepository repository;
    private final TouristRepository touristRepository;

    public String createReview(Long personId, Integer grade, String description, Long tourId) {
        try {
            repository.createReview(touristRepository.findByPersonid(personId).getId(), grade, description, tourId);
        } catch (Exception e) {
            return e.getMessage();
        }
        return "OK";
    }

    public List<Review> getReviewsForTour(Long tourId) {
        return repository.findAllByTourid(tourId);
    }
}