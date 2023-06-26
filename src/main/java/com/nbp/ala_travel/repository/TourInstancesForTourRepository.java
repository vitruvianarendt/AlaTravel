package com.nbp.ala_travel.repository;

import com.nbp.ala_travel.model.TourInstancesForTour;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TourInstancesForTourRepository extends JpaRepository<TourInstancesForTour, Long> {
    @Query(value = "select * from get_tour_instances_for_tour(:selected_tour_id)", nativeQuery = true)
    List<TourInstancesForTour> getTourInstancesForTour(Long selected_tour_id);
}
