package com.example.ala_travel.repository;

import com.example.ala_travel.model.GetTop10CitiesWithMostToursViewModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface GetTop10CitiesWithMostToursViewRepository extends JpaRepository<GetTop10CitiesWithMostToursViewModel, Long> {
    @Query(
            value = "select * from get_top10_cities_with_most_tours()",
            nativeQuery = true)
    List<GetTop10CitiesWithMostToursViewModel> getTop10CitiesWithMostTours();
}
