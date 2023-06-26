package com.nbp.ala_travel.repository;

import com.nbp.ala_travel.model.TourInstancesByCityAndDate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface TourInstancesByCityAndDateRepository extends JpaRepository<TourInstancesByCityAndDate, Long> {
    @Query(value = "select * from get_tours_instances_by_city_and_date(:city_id, :start_date)", nativeQuery = true)
    List<TourInstancesByCityAndDate> tourInstancesByCityAndStartDate(Long city_id, LocalDate start_date);
}
