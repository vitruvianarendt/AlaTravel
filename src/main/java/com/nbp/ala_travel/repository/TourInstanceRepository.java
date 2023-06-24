package com.nbp.ala_travel.repository;

import com.nbp.ala_travel.model.TourInstance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface TourInstanceRepository extends JpaRepository<TourInstance, Long> {

    @Query(value = "select * from saved_tour_instance(:tourist_id, :tour_instance_id)", nativeQuery = true)
    void saveTourInstance(Long tourist_id, Long tour_instance_id);
}
