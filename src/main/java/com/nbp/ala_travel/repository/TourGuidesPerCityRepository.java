package com.nbp.ala_travel.repository;

import com.nbp.ala_travel.model.TourGuidesPerCity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TourGuidesPerCityRepository extends JpaRepository<TourGuidesPerCity, Long> {

    @Query(value = "select * from filter_tour_guides_per_city(:city_name_arg)", nativeQuery = true)
    List<TourGuidesPerCity> tourGuidesPerCity(String city_name_arg);
}
