package com.nbp.ala_travel.repository;

import com.nbp.ala_travel.model.TouristSavedTourInstances;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface TouristSavedTourInstancesRepository extends JpaRepository<TouristSavedTourInstances, Long> {

    @Query(value = "select * from tourist_saved_tourInstances(:touristid1, :city_name1, :tour_date1)", nativeQuery = true)
    List<TouristSavedTourInstances> touristSavedTourInstances(Long touristid1, String city_name1, LocalDate tour_date1);
}
