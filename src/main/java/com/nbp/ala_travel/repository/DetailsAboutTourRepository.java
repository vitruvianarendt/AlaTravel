package com.nbp.ala_travel.repository;

import com.nbp.ala_travel.model.DetailsAboutTour;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DetailsAboutTourRepository extends JpaRepository<DetailsAboutTour, Long> {
    @Query(value = "select * from view_details_about_tour_fun(:city_name_arg, :tour_name_arg)", nativeQuery = true)
    List<DetailsAboutTour> viewDetailsAboutTour(String city_name_arg, String tour_name_arg);
}
//cudno, da se proveri