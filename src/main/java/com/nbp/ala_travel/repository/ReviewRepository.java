package com.nbp.ala_travel.repository;

import com.nbp.ala_travel.model.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReviewRepository extends JpaRepository<Review, Long> {

    List<Review> findAllByTourid(Long tourId);

    @Query(value = "select * from insert_into_review_and_check(:touristId, :grade, :description, :tourId)", nativeQuery = true)
    void createReview(Long touristId, Integer grade, String description, Long tourId);
}
