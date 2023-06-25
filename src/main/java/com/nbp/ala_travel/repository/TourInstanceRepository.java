package com.nbp.ala_travel.repository;

import com.nbp.ala_travel.model.TourInstance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.time.LocalTime;

@Repository
public interface TourInstanceRepository extends JpaRepository<TourInstance, Long> {

    @Query(value = "select * from saved_tour_instance(:tourist_id, :tour_instance_id)", nativeQuery = true)
    void saveTourInstance(Long tourist_id, Long tour_instance_id);

    @Query(value = "select * from create_tour_instance(:new_tour_id, :new_tour_guide_id, :new_language_id" +
            ":new_time, :new_date)", nativeQuery = true)
    void createTourInstance(Long new_tour_id, Long new_tour_guide_id, Long new_language_id,
                            LocalTime new_time, LocalDate new_date);

}
