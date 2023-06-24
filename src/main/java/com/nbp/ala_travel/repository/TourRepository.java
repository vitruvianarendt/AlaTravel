package com.nbp.ala_travel.repository;

import com.nbp.ala_travel.model.Tour;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface TourRepository extends JpaRepository<Tour,Long> {
    @Query(value = "select * from create_tour(:new_starting_point, :new_tour_guide_id, :new_city_id, :new_title," +
            ":new_desc, :new_duration, :new_max_participants)", nativeQuery = true)
    void createTour(Long new_starting_point, Long new_tour_guide_id, Long new_city_id,
                    String new_title, String new_desc, Integer new_duration, Integer new_max_participants);
}
