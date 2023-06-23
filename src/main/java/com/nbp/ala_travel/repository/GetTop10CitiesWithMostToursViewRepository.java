package com.nbp.ala_travel.repository;

import com.nbp.ala_travel.model.GetTop10CitiesWithMostToursViewModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GetTop10CitiesWithMostToursViewRepository extends JpaRepository<GetTop10CitiesWithMostToursViewModel, Long> {
    @Query(value = "select * from get_top10_cities_with_most_tours()", nativeQuery = true)
    List<GetTop10CitiesWithMostToursViewModel> getTop10CitiesWithMostTours();
}
