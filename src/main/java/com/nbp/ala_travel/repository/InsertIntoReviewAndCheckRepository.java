package com.nbp.ala_travel.repository;

import com.nbp.ala_travel.model.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface InsertIntoReviewAndCheckRepository extends JpaRepository<Review, Long> {
    @Query(value = "select * from insert_into_review_and_check(:new_tourist_id, :new_grade, :new_description, " +
            ":new_tour_id, :new_tour_guide_id)", nativeQuery = true)
    void insertIntoReviewAndCheck(Long new_tourist_id, Integer new_grade, String new_description, Long new_tour_id,
                                  Long new_tour_guide_id);
}
